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

<%@ include file="/html/taglib/aui/fieldset/init.jsp" %>

<%
if (Validator.isNull(label)) {
	collapsible = false;
	collapsed = false;
}
else if (collapsible) {
	boolean defaultState = collapsed;

	collapsed = GetterUtil.getBoolean(SessionClicks.get(request, id, null), defaultState);
}

if (Validator.isNull(cssClass)) {
	cssClass = collapsible ? "panel panel-unstyled" : StringPool.BLANK;
}

if (Validator.isNull(panelHeaderLinkCssClass)) {
	panelHeaderLinkCssClass = collapsible ? "sheet-subtitle" : StringPool.BLANK;
}
%>

<fieldset class="<%= cssClass %>" <%= Validator.isNotNull(id) ? "id=\"" + id + "\"" : StringPool.BLANK %> <%= InlineUtil.buildDynamicAttributes(dynamicAttributes) %>>
	<c:choose>
		<c:when test="<%= Validator.isNotNull(label) %>">
			<liferay-util:buffer
				var="header"
			>
				<liferay-ui:message key="<%= label %>" localizeKey="<%= localizeLabel %>" />

				<c:if test="<%= Validator.isNotNull(helpMessage) %>">
					<liferay-ui:icon-help message="<%= helpMessage %>" />
				</c:if>
			</liferay-util:buffer>

			<c:choose>
				<c:when test="<%= collapsible %>">
					<legend class="sr-only">
						<%= header %>
					</legend>

					<a aria-controls="<%= id %>Content" aria-expanded="<%= !collapsed %>" class="collapse-icon collapse-icon-middle <%= panelHeaderLinkCssClass %> <%= collapsed ? "collapsed" : StringPool.BLANK %>" data-toggle="liferay-collapse" href="#<%= id %>Content" role="button">
						<span class="c-inner" tabindex="-1">
							<span aria-hidden="true">
								<%= header %>
							</span>

							<aui:icon cssClass="collapse-icon-closed" image="angle-right" markupView="lexicon" />

							<aui:icon cssClass="collapse-icon-open" image="angle-down" markupView="lexicon" />
						</span>
					</a>
				</c:when>
				<c:otherwise>
					<legend class="fieldset-legend">
						<span class="legend">
							<%= header %>
						</span>
					</legend>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<legend class="sr-only">
				<%= HtmlUtil.escape(portletDisplay.getTitle()) %>
			</legend>
		</c:otherwise>
	</c:choose>

	<div class="<%= !collapsed ? "show" : StringPool.BLANK %> <%= collapsible ? "panel-collapse collapse" : StringPool.BLANK %> <%= column ? "row" : StringPool.BLANK %>" id="<%= id %>Content" role="presentation">
		<div class="panel-body">