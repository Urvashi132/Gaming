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

<%@ include file="/html/taglib/ui/logo_selector/init.jsp" %>

<%
String randomNamespace = PortalUtil.generateRandomKey(request, "taglib_ui_logo_selector") + StringPool.UNDERLINE;

int aspectRatio = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:logo-selector:aspectRatio"));
String currentLogoURL = (String)request.getAttribute("liferay-ui:logo-selector:currentLogoURL");
boolean defaultLogo = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:logo-selector:defaultLogo"));
String defaultLogoURL = (String)request.getAttribute("liferay-ui:logo-selector:defaultLogoURL");
String editLogoFn = GetterUtil.getString((String)request.getAttribute("liferay-ui:logo-selector:editLogoFn"));
String logoDisplaySelector = (String)request.getAttribute("liferay-ui:logo-selector:logoDisplaySelector");
boolean preserveRatio = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:logo-selector:preserveRatio"));
boolean showBackground = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:logo-selector:showBackground"));
boolean showButtons = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:logo-selector:showButtons"));
String tempImageFileName = (String)request.getAttribute("liferay-ui:logo-selector:tempImageFileName");

boolean deleteLogo = ParamUtil.getBoolean(request, "deleteLogo");
long fileEntryId = ParamUtil.getLong(request, "fileEntryId");

String imageURL = null;

if (deleteLogo) {
	imageURL = defaultLogoURL;
}
else if (fileEntryId > 0) {
	ResourceURL previewURL = PortletURLFactoryUtil.create(portletRequest, PortletKeys.IMAGE_UPLOADER, PortletRequest.RESOURCE_PHASE);

	previewURL.setParameter("mvcRenderCommandName", "/image_uploader/upload_image");
	previewURL.setParameter(Constants.CMD, Constants.GET_TEMP);
	previewURL.setParameter("tempImageFileName", tempImageFileName);

	imageURL = previewURL.toString();
}
else {
	imageURL = currentLogoURL;
}
%>

<c:choose>
	<c:when test="<%= showButtons %>">
		<div class="taglib-logo-selector" id="<%= randomNamespace %>taglibLogoSelector">
			<div class="taglib-logo-selector-content" id="<%= randomNamespace %>taglibLogoSelectorContent">
				<a class="lfr-change-logo <%= showBackground ? "show-background" : StringPool.BLANK %>" href="javascript:void(0);">
					<img alt="<liferay-ui:message escapeAttribute="<%= true %>" key="current-image" />" class="avatar img-fluid mw-100" id="<%= randomNamespace %>avatar" src="<%= HtmlUtil.escape(imageURL) %>" />
				</a>

				<c:if test='<%= Validator.isNull(imageURL) || imageURL.contains("/spacer.png") %>'>
					<p class="text-muted" id="<%= randomNamespace %>emptyResultMessage">
						<liferay-ui:message key="none" />
					</p>
				</c:if>

				<div class="mb-4 mt-3 portrait-icons">
					<div class="btn-group button-holder">
						<aui:button cssClass="btn btn-secondary edit-logo modify-link mr-3" value="change" />

						<aui:button cssClass="btn btn-secondary delete-logo modify-link" disabled="<%= defaultLogo && (fileEntryId == 0) %>" value="delete" />
					</div>

					<aui:input name="deleteLogo" type="hidden" value="<%= deleteLogo %>" />

					<aui:input name="fileEntryId" type="hidden" value="<%= fileEntryId %>" />
				</div>
			</div>
		</div>

		<liferay-portlet:renderURL portletName="<%= PortletKeys.IMAGE_UPLOADER %>" var="uploadImageURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
			<liferay-portlet:param name="mvcRenderCommandName" value="/image_uploader/upload_image" />
			<liferay-portlet:param name="randomNamespace" value="<%= randomNamespace %>" />
			<liferay-portlet:param name="aspectRatio" value="<%= String.valueOf(aspectRatio) %>" />
			<liferay-portlet:param name="currentLogoURL" value="<%= currentLogoURL %>" />
			<liferay-portlet:param name="preserveRatio" value="<%= String.valueOf(preserveRatio) %>" />
			<liferay-portlet:param name="tempImageFileName" value="<%= tempImageFileName %>" />
		</liferay-portlet:renderURL>

		<aui:script use="liferay-logo-selector">
			new Liferay.LogoSelector(
				{
					boundingBox: '#<%= randomNamespace %>taglibLogoSelector',
					contentBox: '#<%= randomNamespace %>taglibLogoSelectorContent',
					defaultLogo: '<%= defaultLogo %>',
					defaultLogoURL: '<%= defaultLogoURL %>',
					editLogoFn: '<%= editLogoFn %>',
					editLogoURL: '<%= uploadImageURL %>',
					logoDisplaySelector: '<%= logoDisplaySelector %>',
					portletNamespace: '<portlet:namespace />',
					randomNamespace: '<%= randomNamespace %>'
				}
			).render();
		</aui:script>
	</c:when>
	<c:otherwise>
		<div class="taglib-logo-selector" id="<%= randomNamespace %>taglibLogoSelector">
			<div class="taglib-logo-selector-content" id="<%= randomNamespace %>taglibLogoSelectorContent">
				<span class="lfr-change-logo <%= showBackground ? "show-background" : StringPool.BLANK %>">
					<img alt="<liferay-ui:message escapeAttribute="<%= true %>" key="current-image" />" class="avatar img-fluid" id="<%= randomNamespace %>avatar" src="<%= HtmlUtil.escape(imageURL) %>" />
				</span>
			</div>
		</div>
	</c:otherwise>
</c:choose>