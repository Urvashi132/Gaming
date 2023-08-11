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

<%@ include file="/html/taglib/ui/search_container/init.jsp" %>

<%
boolean toggleRowChecker = GetterUtil.getBoolean(request.getAttribute("liferay-ui:search-container-column-icon:toggleRowChecker"));
%>

<div class="<%= toggleRowChecker ? "click-selector" : StringPool.BLANK %> sticker sticker-secondary sticker-static">
	<aui:icon image='<%= (String)request.getAttribute("liferay-ui:search-container-column-icon:icon") %>' markupView="lexicon" url='<%= (String)request.getAttribute("liferay-ui:search-container-column-icon:href") %>' />
</div>