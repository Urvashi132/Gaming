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

<%@ include file="/html/portal/init.jsp" %>

<c:choose>
	<c:when test="<%= Validator.isNotNull(request.getAttribute(NoSuchLayoutException.class.getName())) %>">
		<div class="container pb-3 pt-3">
			<h3 class="alert alert-danger">
				<liferay-ui:message key="not-found" />
			</h3>

			<liferay-ui:message key="the-requested-resource-could-not-be-found" />

			<br /><br />

			<%
			String url = ParamUtil.getString(request, "previousURL");

			if (Validator.isNull(url)) {
				url = PortalUtil.getCurrentURL(request);
			}

			url = HttpComponentsUtil.decodeURL(themeDisplay.getPortalURL() + url);
			%>

			<code class="lfr-url-error"><%= HtmlUtil.escape(url) %></code>
		</div>
	</c:when>
	<c:otherwise>

		<%
		StringBundler sb = (StringBundler)request.getAttribute(WebKeys.LAYOUT_CONTENT);

		sb.writeTo(out);

		request.removeAttribute(WebKeys.LAYOUT_CONTENT);
		%>

	</c:otherwise>
</c:choose>