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

<%@ include file="/html/common/init.jsp" %>

<%@ page isErrorPage="true" %>

<%
String message = null;

StringBundler sb = new StringBundler(9);

sb.append("User ID ");
sb.append(request.getRemoteUser());
sb.append(", current URL ");
sb.append(PortalUtil.getCurrentURL(request));
sb.append(", referer ");
sb.append(request.getHeader("Referer"));
sb.append(", remote address ");
sb.append(request.getRemoteAddr());

if (exception == null) {
	sb.append(", null exception");
}

if (exception != null) {
	message = exception.getMessage();
}

if (exception instanceof PrincipalException) {
	if (exception != null) {
		_log.warn(exception, exception);
	}
	else {
		_log.warn(sb.toString());
	}
}
else {
	if (exception != null) {
		_log.error(exception, exception);
	}
	else {
		_log.error(sb.toString());
	}
}
%>

<center>
	<br />

	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td>
				<font color="#FF0000" face="Verdana, Tahoma, Arial" size="2">
					<c:choose>
						<c:when test="<%= exception instanceof PrincipalException %>">
							<liferay-ui:message key="you-do-not-have-permission-to-view-this-page" />
						</c:when>
						<c:otherwise>
							<liferay-ui:message key="an-unexpected-system-error-occurred" />
						</c:otherwise>
					</c:choose>

					<br />
				</font>

				<c:if test="<%= message != null %>">
					<br />

					<%= HtmlUtil.escape(message) %>
				</c:if>
			</td>
		</tr>
	</table>

	<br />
</center>

<%!
private static final Log _log = LogFactoryUtil.getLog("portal_web.docroot.html.common.error_jsp");
%>