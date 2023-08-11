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

@generated
--%>

<%@ include file="/html/taglib/taglib-init.jsp" %>

<%
java.lang.String anchorCssClass = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:anchorCssClass"));
java.util.Map anchorData = (java.util.Map)request.getAttribute("aui:nav-item:anchorData");
java.lang.String anchorId = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:anchorId"));
java.lang.String ariaLabel = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:ariaLabel"));
java.lang.String ariaRole = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:ariaRole"));
java.lang.String cssClass = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:cssClass"));
java.util.Map data = (java.util.Map)request.getAttribute("aui:nav-item:data");
boolean dropdown = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:dropdown")));
java.lang.String href = GetterUtil.getString((java.lang.Object)request.getAttribute("aui:nav-item:href"), "javascript: void(0);");
java.lang.String iconCssClass = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:iconCssClass"));
java.lang.String iconSrc = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:iconSrc"));
java.lang.String id = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:id"));
java.lang.String label = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:label"));
boolean localizeLabel = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:localizeLabel")), true);
boolean selected = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:selected")));
java.lang.String state = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:state"));
java.lang.String target = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:target"));
java.lang.String title = GetterUtil.getString((java.lang.String)request.getAttribute("aui:nav-item:title"));
boolean toggle = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:toggle")));
boolean toggleTouch = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:toggleTouch")), true);
boolean useDialog = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:useDialog")));
boolean wrapDropDownMenu = GetterUtil.getBoolean(String.valueOf(request.getAttribute("aui:nav-item:wrapDropDownMenu")), true);
Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute("aui:nav-item:dynamicAttributes");
%>

<%@ include file="/html/taglib/aui/nav_item/init-ext.jspf" %>