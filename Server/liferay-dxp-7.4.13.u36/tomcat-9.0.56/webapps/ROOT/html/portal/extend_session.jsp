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

<%
String requestedSessionId = request.getRequestedSessionId();

if (Validator.isNotNull(requestedSessionId) && !StringUtil.equals(requestedSessionId, session.getId())) {
	response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

	if (_log.isWarnEnabled()) {
		_log.warn("Unable to extend the HTTP session.");
	}

	if (_log.isDebugEnabled()) {
		_log.debug("The requested session " + requestedSessionId + " is not the same as session " + session.getId());
	}
}

for (String servletContextName : ServletContextPool.keySet()) {
	ServletContext servletContext = ServletContextPool.get(servletContextName);

	if (Validator.isNull(servletContextName) || servletContextName.equals(PortalUtil.getPathContext())) {
		continue;
	}

	PortletApp portletApp = PortletLocalServiceUtil.getPortletApp(servletContextName);

	for (Portlet portlet : portletApp.getPortlets()) {
		PortletConfig portletConfig = PortletConfigFactoryUtil.create(portlet, servletContext);

		String invokerPortletName = portletConfig.getInitParameter(InvokerPortlet.INIT_INVOKER_PORTLET_NAME);

		if (invokerPortletName == null) {
			invokerPortletName = portletConfig.getPortletName();
		}

		String path = StringBundler.concat(StringPool.SLASH, invokerPortletName, "/invoke");

		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);

		if (requestDispatcher == null) {
			continue;
		}

		request.setAttribute(WebKeys.EXTEND_SESSION, Boolean.TRUE);

		try {
			requestDispatcher.include(request, response);
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Unable to extend session for " + servletContextName);
			}
		}
	}
}
%>

<%!
private static final Log _log = LogFactoryUtil.getLog("portal_web.docroot.html.portal.extend_session_jsp");
%>