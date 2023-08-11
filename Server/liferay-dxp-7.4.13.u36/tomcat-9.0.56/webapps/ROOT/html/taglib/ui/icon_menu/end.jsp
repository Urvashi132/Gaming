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

		</ul>
	<c:if test='<%= GetterUtil.getBoolean(request.getAttribute("liferay-ui:icon-menu:scroll")) %>'>
		</div>
	</c:if>
</div>

<aui:script use="liferay-menu">
	Liferay.Menu.handleFocus('#<%= GetterUtil.getString((String)request.getAttribute("liferay-ui:icon-menu:id")) %>menu');
</aui:script>