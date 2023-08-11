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
StringBundler sb = (StringBundler)request.getAttribute(WebKeys.LAYOUT_CONTENT);

if ((sb != null) && themeDisplay.isStateExclusive()) {
	sb.writeTo(out);
}
else {
	Definition definition = (Definition)request.getAttribute(TilesUtil.DEFINITION);

	boolean tilesPopUp = false;

	if (definition != null) {
		Map<String, String> attributes = definition.getAttributes();

		tilesPopUp = GetterUtil.getBoolean(attributes.get("pop_up"));
	}
%>

	<c:choose>
		<c:when test="<%= tilesPopUp || themeDisplay.isStatePopUp() || themeDisplay.isWidget() %>">
			<liferay-theme:include
				page="portal_pop_up.jsp"
			/>
		</c:when>
		<c:otherwise>
			<liferay-theme:include
				page="portal_normal.jsp"
			/>
		</c:otherwise>
	</c:choose>

<%
}

request.removeAttribute(WebKeys.LAYOUT_CONTENT);

PortalMessages.clear(request);
SessionMessages.clear(request);
SessionErrors.clear(request);
%>