<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
--%>

<%@ include file="/html/taglib/init.jsp" %>

<%
String layoutTemplateId = (String)request.getAttribute("liferay-ui:layout-templates-list:layoutTemplateId");
String layoutTemplateIdPrefix = (String)request.getAttribute("liferay-ui:layout-templates-list:layoutTemplateIdPrefix");
List<LayoutTemplate> layoutTemplates = (List<LayoutTemplate>)request.getAttribute("liferay-ui:layout-templates-list:layoutTemplates");
%>

<div class="container-fluid <portlet:namespace />layout-template-list lfr-page-layouts">
	<ul class="card-page">

		<%
		layoutTemplates = PluginUtil.restrictPlugins(layoutTemplates, user);

		for (int i = 0; i < layoutTemplates.size(); i++) {
			LayoutTemplate layoutTemplate = layoutTemplates.get(i);

			String templateId = layoutTemplate.getLayoutTemplateId();

			// LPS-90259

			if (templateId.equals("1_column_dynamic")) {
				continue;
			}
		%>

			<li class="card-page-item card-page-item-directory lfr-layout-template">
				<div class="checkbox-card">
					<label class="d-block" for="<portlet:namespace /><%= layoutTemplateIdPrefix + "layoutTemplateId" + i %>">
						<aui:input checked="<%= layoutTemplateId.equals(layoutTemplate.getLayoutTemplateId()) %>" id='<%= layoutTemplateIdPrefix + "layoutTemplateId" + i %>' label="" name="layoutTemplateId" type="radio" value="<%= layoutTemplate.getLayoutTemplateId() %>" wrappedField="<%= true %>" />

						<div class="card card-interactive card-interactive-primary card-type-template <%= layoutTemplateId.equals(layoutTemplate.getLayoutTemplateId()) ? "active" : StringPool.BLANK %>">
							<div class="card-body">
								<div class="card-row">
									<div class="autofit-col">
										<img alt="" class="layout-template-entry inline-item-before modify-linkm <%= layoutTemplateId.equals(layoutTemplate.getLayoutTemplateId()) ? "layout-selected" : StringPool.BLANK %>" height="28" src="<%= layoutTemplate.getStaticResourcePath() %><%= HtmlUtil.escapeAttribute(layoutTemplate.getThumbnailPath()) %>" width="28" />
									</div>

									<div class="autofit-col autofit-col-expand">
										<span class="text-truncate" title="<%= HtmlUtil.escape(layoutTemplate.getName(locale)) %>"><%= HtmlUtil.escape(layoutTemplate.getName(locale)) %></span>
									</div>
								</div>
							</div>
						</div>
					</label>
				</div>
			</li>

		<%
		}
		%>

	</ul>
</div>

<aui:script require="frontend-js-web/liferay/delegate/delegate.es as delegateModule">
	const delegate = delegateModule.default;

	const delegateHandler = delegate(document.querySelector('.<portlet:namespace />layout-template-list.lfr-page-layouts'), 'click', '.lfr-layout-template', (event) => {
		const layoutTemplateInput = event.delegateTarget.querySelector('input');

		if (layoutTemplateInput) {
			layoutTemplateInput.checked = true;
		}

		const currentActiveCard = event.currentTarget.querySelector('.active');

		if (currentActiveCard) {
			currentActiveCard.classList.remove('active');
		}

		const card = event.delegateTarget.querySelector('.card');

		if (card) {
			card.classList.add('active');
		}
	});

	const onDestroyPortlet = () => {
		delegateHandler.dispose();

		Liferay.detach('destroyPortlet', onDestroyPortlet);
	};

	Liferay.once('destroyPortlet', onDestroyPortlet);
</aui:script>