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

<%@ include file="/html/common/themes/init.jsp" %>

<%
String jspPath = (String)PortalMessages.get(request, PortalMessages.KEY_JSP_PATH);
String message = (String)PortalMessages.get(request, PortalMessages.KEY_MESSAGE);
%>

<c:if test="<%= Validator.isNotNull(jspPath) || Validator.isNotNull(message) %>">

	<%
	String portletId = (String)PortalMessages.get(request, PortalMessages.KEY_PORTLET_ID);
	%>

	<liferay-util:buffer
		var="alertMessage"
	>
		<c:choose>
			<c:when test="<%= Validator.isNotNull(jspPath) %>">
				<liferay-util:include page="<%= jspPath %>" portletId="<%= portletId %>" />
			</c:when>
			<c:otherwise>
				<liferay-ui:message key="<%= message %>" />
			</c:otherwise>
		</c:choose>
	</liferay-util:buffer>

	<aui:script>
		Liferay.Util.openToast({
			message: '<%= HtmlUtil.escapeJS(alertMessage) %>',
			renderData: {
				portletId: <%= portletId %>
			},
			toastProps: {
				autoClose: <%= GetterUtil.getInteger(PortalMessages.get(request, PortalMessages.KEY_TIMEOUT), 10000) %>,
				className: '<%= GetterUtil.getString(PortalMessages.get(request, PortalMessages.KEY_CSS_CLASS), "alert-info") %>',
				style: {top: 0},
			}
		});
	</aui:script>
</c:if>