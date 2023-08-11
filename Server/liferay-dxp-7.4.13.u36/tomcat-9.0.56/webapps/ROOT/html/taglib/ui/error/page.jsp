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
String alertIcon = (String)request.getAttribute("liferay-ui:error:alertIcon");
String alertMessage = (String)request.getAttribute("liferay-ui:error:alertMessage");
String alertStyle = (String)request.getAttribute("liferay-ui:error:alertStyle");
String alertTitle = (String)request.getAttribute("liferay-ui:error:alertTitle");
%>

<c:choose>
	<c:when test='<%= GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:error:embed")) %>'>
		<div class="alert alert-dismissible alert-<%= alertStyle %>" role="alert">
			<button aria-label="<%= LanguageUtil.get(request, "close") %>" class="close" data-dismiss="liferay-alert" type="button">
				<aui:icon image="times" markupView="lexicon" />

				<span class="sr-only"><%= LanguageUtil.get(request, "close") %></span>
			</button>

			<span class="alert-indicator">
				<svg aria-hidden="true" class="lexicon-icon lexicon-icon-<%= alertIcon %>">
					<use xlink:href="<%= FrontendIconsUtil.getSpritemap(themeDisplay) %>#<%= alertIcon %>"></use>
				</svg>
			</span>

			<strong class="lead"><%= alertTitle %></strong><%= alertMessage %>
		</div>

		<%= (String)request.getAttribute("liferay-ui:error:rowBreak") %>
	</c:when>
	<c:otherwise>
		<aui:script>
			Liferay.Util.openToast({
			   message: '<%= HtmlUtil.escapeJS(alertMessage) %>',
			   title: '<%= alertTitle %>',
			   type: '<%= alertStyle %>'
			});
		</aui:script>
	</c:otherwise>
</c:choose>