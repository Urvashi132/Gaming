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

<%@ include file="/html/taglib/ui/quick_access/init.jsp" %>

<%
String linkClass = "d-block p-2 sr-only sr-only-focusable text-reset";
String randomNamespace = StringUtil.randomId() + StringPool.UNDERLINE;
%>

<c:if test="<%= ((quickAccessEntries != null) && !quickAccessEntries.isEmpty()) || Validator.isNotNull(contentId) %>">
	<nav aria-label="<liferay-ui:message key="quick-links" />" class="bg-dark d-none d-xl-block quick-access-nav text-center text-white" id="<%= randomNamespace %>quickAccessNav">
		<h1 class="sr-only"><liferay-ui:message key="navigation" /></h1>

		<ul class="list-unstyled mb-0">
			<c:if test="<%= Validator.isNotNull(contentId) %>">
				<li>
					<a class="<%= linkClass %>" href="<%= contentId %>">
						<liferay-ui:message key="skip-to-content" />
					</a>
				</li>
			</c:if>

			<c:if test="<%= (quickAccessEntries != null) && !quickAccessEntries.isEmpty() %>">

				<%
				for (QuickAccessEntry quickAccessEntry : quickAccessEntries) {
				%>

					<li>
						<a class="<%= linkClass %>" href="<%= quickAccessEntry.getURL() %>" id="<%= randomNamespace + quickAccessEntry.getId() %>" onclick="<%= quickAccessEntry.getOnClick() %>">
							<%= quickAccessEntry.getContent() %>
						</a>
					</li>

				<%
				}
				%>

			</c:if>
		</ul>
	</nav>
</c:if>