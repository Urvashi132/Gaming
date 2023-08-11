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

<%@ include file="/html/taglib/aui/nav_bar/init.jsp" %>

<c:if test="<%= Validator.isContent(bodyContentString) %>">
	<div class="navbar <%= cssClass %>" id="<%= id %>" <%= AUIUtil.buildData(data) %> <%= InlineUtil.buildDynamicAttributes(dynamicAttributes) %>>
		<div class="container-fluid container-fluid-max-xl">
			<c:if test="<%= Validator.isNotNull(dataTarget) %>">
				<button class="<%= (navItemCount.getValue() > 1) ? "collapsed" : StringPool.BLANK %> navbar-toggler navbar-toggler-link" data-target="<%= (navItemCount.getValue() > 1) ? "#" + dataTarget + "NavbarCollapse" : StringPool.BLANK %>" data-toggle="<%= (navItemCount.getValue() > 1) ? "collapse" : StringPool.BLANK %>" id="<%= dataTarget %>NavbarBtn" type="button">
					<span class="c-inner" tabindex="-1">
						<span class="sr-only"><liferay-ui:message key="toggle-navigation" /></span>

						<span class="navbar-text-truncate page-name"><%= LanguageUtil.get(resourceBundle, selectedItemName) %></span>

						<aui:icon image="caret-bottom" markupView="lexicon" />
					</span>
				</button>
			</c:if>

			<%= bodyContentString %>
		</div>
	</div>
</c:if>