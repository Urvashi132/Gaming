package org.apache.jsp.portlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.application.list.PanelCategory;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.module.configuration.ConfigurationProviderUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.SessionClicks;
import com.liferay.portal.kernel.webserver.WebServerServletTokenUtil;
import com.liferay.product.navigation.applications.menu.configuration.ApplicationsMenuInstanceConfiguration;
import com.liferay.product.navigation.product.menu.display.context.ProductMenuDisplayContext;
import com.liferay.product.navigation.product.menu.web.internal.constants.ProductNavigationProductMenuWebKeys;
import com.liferay.product.navigation.product.menu.web.internal.display.context.LayoutsTreeDisplayContext;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;
import java.util.Objects;

public final class pages_005ftree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/portlet/init.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-staging:defineObjects
      com.liferay.staging.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1staging_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.staging.taglib.servlet.taglib.DefineObjectsTag.class) : new com.liferay.staging.taglib.servlet.taglib.DefineObjectsTag();
      _jspx_th_liferay$1staging_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1staging_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1staging_defineObjects_0 = _jspx_th_liferay$1staging_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1staging_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1staging_defineObjects_0);
        _jspx_th_liferay$1staging_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1staging_defineObjects_0);
      _jspx_th_liferay$1staging_defineObjects_0.release();
      com.liferay.portal.kernel.model.Group group = null;
      java.lang.Long groupId = null;
      com.liferay.portal.kernel.model.Group liveGroup = null;
      java.lang.Long liveGroupId = null;
      java.lang.Boolean privateLayout = null;
      com.liferay.portal.kernel.model.Group scopeGroup = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.model.Group stagingGroup = null;
      java.lang.Long stagingGroupId = null;
      group = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("group");
      groupId = (java.lang.Long) _jspx_page_context.findAttribute("groupId");
      liveGroup = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("liveGroup");
      liveGroupId = (java.lang.Long) _jspx_page_context.findAttribute("liveGroupId");
      privateLayout = (java.lang.Boolean) _jspx_page_context.findAttribute("privateLayout");
      scopeGroup = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("scopeGroup");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      stagingGroup = (com.liferay.portal.kernel.model.Group) _jspx_page_context.findAttribute("stagingGroup");
      stagingGroupId = (java.lang.Long) _jspx_page_context.findAttribute("stagingGroupId");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.DefineObjectsTag.class) : new com.liferay.taglib.portlet.DefineObjectsTag();
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
        _jspx_th_portlet_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
      _jspx_th_portlet_defineObjects_0.release();
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

ProductMenuDisplayContext productMenuDisplayContext = new ProductMenuDisplayContext(liferayPortletRequest, liferayPortletResponse);

      out.write('\n');
      out.write('\n');

LayoutsTreeDisplayContext layoutsTreeDisplayContext = (LayoutsTreeDisplayContext)request.getAttribute(ProductNavigationProductMenuWebKeys.LAYOUTS_TREE_DISPLAY_CONTEXT);

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"");
      out.print( liferayPortletResponse.getNamespace() + "-layout-finder" );
      out.write("\">\n");
      out.write("\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_0.setPageContext(_jspx_page_context);
      _jspx_th_react_component_0.setParent(null);
      _jspx_th_react_component_0.setModule("js/LayoutFinder.es");
      _jspx_th_react_component_0.setProps( layoutsTreeDisplayContext.getLayoutFinderData() );
      _jspx_th_react_component_0.setServletContext( application );
      int _jspx_eval_react_component_0 = _jspx_th_react_component_0.doStartTag();
      if (_jspx_th_react_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
        _jspx_th_react_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_0);
      _jspx_th_react_component_0.release();
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"");
      if (_jspx_meth_portlet_namespace_0(_jspx_page_context))
        return;
      out.write("layoutsTree\">\n");
      out.write("\t<div id=\"");
      out.print( liferayPortletResponse.getNamespace() + "-page-type" );
      out.write("\">\n");
      out.write("\t\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_1.setPageContext(_jspx_page_context);
      _jspx_th_react_component_1.setParent(null);
      _jspx_th_react_component_1.setModule("js/PageTypeSelector.es");
      _jspx_th_react_component_1.setProps( layoutsTreeDisplayContext.getPageTypeSelectorData() );
      _jspx_th_react_component_1.setServletContext( application );
      int _jspx_eval_react_component_1 = _jspx_th_react_component_1.doStartTag();
      if (_jspx_th_react_component_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
        _jspx_th_react_component_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_1);
      _jspx_th_react_component_1.release();
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 layoutsTreeDisplayContext.isSiteNavigationMenu() ) {
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t");
      //  react:component
      com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag _jspx_th_react_component_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.react.servlet.taglib.ComponentTag();
      _jspx_th_react_component_2.setPageContext(_jspx_page_context);
      _jspx_th_react_component_2.setParent(null);
      _jspx_th_react_component_2.setModule("js/NavigationMenuItemsTree.es");
      _jspx_th_react_component_2.setProps( layoutsTreeDisplayContext.getSiteNavigationMenuData() );
      _jspx_th_react_component_2.setServletContext( application );
      int _jspx_eval_react_component_2 = _jspx_th_react_component_2.doStartTag();
      if (_jspx_th_react_component_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_2);
        _jspx_th_react_component_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_react_component_2);
      _jspx_th_react_component_2.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.BufferTag.class) : new com.liferay.taglib.util.BufferTag();
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("linkTemplate");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t");
          //  clay:content-row
          com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
          _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_content$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
          _jspx_th_clay_content$1row_0.setContainerElement("span");
          int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
          if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n");
            out.write("\t\t\t\t\t<a class=\"{cssClass}\" data-regular-url=\"{regularURL}\" data-url=\"{url}\" data-uuid=\"{uuid}\" href=\"{url}\" id=\"{id}\" title=\"{title}\">\n");
            out.write("\t\t\t\t\t\t<span class=\"c-inner\" tabindex=\"-1\">\n");
            out.write("\t\t\t\t\t\t\t<span class=\"mr-1 list-icon {type}-layout\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            if (_jspx_meth_aui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t\t\t\t<span class=\"mr-1 page-icon {type}-layout\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            if (_jspx_meth_aui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t\t\t\t{label}\n");
            out.write("\t\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t\t</a>\n");
            out.write("\n");
            out.write("\t\t\t\t\t");
if (
 (layoutsTreeDisplayContext.hasAddLayoutPermission() && ((stagingGroup == null) || Objects.equals(scopeGroupId, stagingGroupId))) || layoutsTreeDisplayContext.hasConfigureLayoutPermission() ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t<span class=\"d-sm-block dropdown pages-tree-dropdown text-right\">\n");
            out.write("\t\t\t\t\t\t\t<button class=\"btn btn-unstyled dropdown-toggle ml-1 taglib-icon\" data-toggle=\"liferay-dropdown\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            if (_jspx_meth_aui_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t\t\t\t</button>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\">\n");
            out.write("\t\t\t\t\t\t\t\t<li class=\"preview-draft-action-option {draftStatus}\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_1.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_1.setContainerElement("a");
            _jspx_th_clay_content$1row_1.setCssClass("dropdown-item layout-action");
            _jspx_th_clay_content$1row_1.setDynamicAttribute(null, "href", new String("{draftURL}"));
            _jspx_th_clay_content$1row_1.setDynamicAttribute(null, "target", new String("_blank"));
            int _jspx_eval_clay_content$1row_1 = _jspx_th_clay_content$1row_1.doStartTag();
            if (_jspx_eval_clay_content$1row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_1);
              _jspx_th_clay_content$1col_0.setContainerElement("span");
              _jspx_th_clay_content$1col_0.setExpand( true );
              int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
              if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_clay_content$1section_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
                _jspx_th_clay_content$1col_0.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
              _jspx_th_clay_content$1col_0.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
              _jspx_th_clay_content$1row_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_1);
            _jspx_th_clay_content$1row_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</li>\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
if (
 layoutsTreeDisplayContext.hasAddLayoutPermission() && ((stagingGroup == null) || Objects.equals(scopeGroupId, stagingGroupId)) ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<li class=\"child-page-action-option type-{parentable}\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_2.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_2.setContainerElement("a");
            _jspx_th_clay_content$1row_2.setCssClass("dropdown-item layout-action");
            _jspx_th_clay_content$1row_2.setDynamicAttribute(null, "href",  layoutsTreeDisplayContext.getAddChildURLTemplate() );
            int _jspx_eval_clay_content$1row_2 = _jspx_th_clay_content$1row_2.doStartTag();
            if (_jspx_eval_clay_content$1row_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_2);
              _jspx_th_clay_content$1col_1.setContainerElement("span");
              _jspx_th_clay_content$1col_1.setExpand( true );
              int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
              if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_clay_content$1section_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_1, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
                _jspx_th_clay_content$1col_1.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
              _jspx_th_clay_content$1col_1.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_2);
              _jspx_th_clay_content$1row_2.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_2);
            _jspx_th_clay_content$1row_2.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t\t\t\t\t\t<li class=\"child-page-action-option type-{parentable}\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_3.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_3.setContainerElement("a");
            _jspx_th_clay_content$1row_3.setCssClass("dropdown-item layout-action");
            _jspx_th_clay_content$1row_3.setDynamicAttribute(null, "href",  layoutsTreeDisplayContext.getAddChildCollectionURLTemplate() );
            int _jspx_eval_clay_content$1row_3 = _jspx_th_clay_content$1row_3.doStartTag();
            if (_jspx_eval_clay_content$1row_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_2.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_3);
              _jspx_th_clay_content$1col_2.setContainerElement("span");
              _jspx_th_clay_content$1col_2.setExpand( true );
              int _jspx_eval_clay_content$1col_2 = _jspx_th_clay_content$1col_2.doStartTag();
              if (_jspx_eval_clay_content$1col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_clay_content$1section_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_2, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
                _jspx_th_clay_content$1col_2.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_2);
              _jspx_th_clay_content$1col_2.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_3);
              _jspx_th_clay_content$1row_3.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_3);
            _jspx_th_clay_content$1row_3.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t");
if (
 layoutsTreeDisplayContext.hasConfigureLayoutPermission() ) {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t<li>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_4.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_4.setContainerElement("a");
            _jspx_th_clay_content$1row_4.setCssClass("dropdown-item layout-action");
            _jspx_th_clay_content$1row_4.setDynamicAttribute(null, "href",  layoutsTreeDisplayContext.getConfigureLayoutURLTemplate() );
            int _jspx_eval_clay_content$1row_4 = _jspx_th_clay_content$1row_4.doStartTag();
            if (_jspx_eval_clay_content$1row_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_3.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_4);
              _jspx_th_clay_content$1col_3.setContainerElement("span");
              _jspx_th_clay_content$1col_3.setExpand( true );
              int _jspx_eval_clay_content$1col_3 = _jspx_th_clay_content$1col_3.doStartTag();
              if (_jspx_eval_clay_content$1col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_clay_content$1section_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_3, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
                _jspx_th_clay_content$1col_3.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_3);
              _jspx_th_clay_content$1col_3.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_4);
              _jspx_th_clay_content$1row_4.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_4);
            _jspx_th_clay_content$1row_4.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<li class=\"view-collection-items-action-option {type}\" data-view-collection-items-url=\"");
            out.print( layoutsTreeDisplayContext.getViewCollectionItemsURL() );
            out.write("\">\n");
            out.write("\t\t\t\t\t\t\t\t\t");
            //  clay:content-row
            com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
            _jspx_th_clay_content$1row_5.setPageContext(_jspx_page_context);
            _jspx_th_clay_content$1row_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_5.setContainerElement("a");
            _jspx_th_clay_content$1row_5.setCssClass("dropdown-item layout-action");
            _jspx_th_clay_content$1row_5.setDynamicAttribute(null, "href", new String("javascript:void(0);"));
            int _jspx_eval_clay_content$1row_5 = _jspx_th_clay_content$1row_5.doStartTag();
            if (_jspx_eval_clay_content$1row_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              //  clay:content-col
              com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
              _jspx_th_clay_content$1col_4.setPageContext(_jspx_page_context);
              _jspx_th_clay_content$1col_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_5);
              _jspx_th_clay_content$1col_4.setContainerElement("span");
              _jspx_th_clay_content$1col_4.setExpand( true );
              int _jspx_eval_clay_content$1col_4 = _jspx_th_clay_content$1col_4.doStartTag();
              if (_jspx_eval_clay_content$1col_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t\t");
                if (_jspx_meth_clay_content$1section_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_4, _jspx_page_context))
                  return;
                out.write("\n");
                out.write("\t\t\t\t\t\t\t\t\t\t");
              }
              if (_jspx_th_clay_content$1col_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_4);
                _jspx_th_clay_content$1col_4.release();
                return;
              }
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_4);
              _jspx_th_clay_content$1col_4.release();
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
            }
            if (_jspx_th_clay_content$1row_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_5);
              _jspx_th_clay_content$1row_5.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_5);
            _jspx_th_clay_content$1row_5.release();
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t\t\t</span>\n");
            out.write("\t\t\t\t");
          }
          if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
            _jspx_th_clay_content$1row_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
          _jspx_th_clay_content$1row_0.release();
          out.write("\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
        _jspx_th_liferay$1util_buffer_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_buffer_0);
      _jspx_th_liferay$1util_buffer_0.release();
      java.lang.String linkTemplate = null;
      linkTemplate = (java.lang.String) _jspx_page_context.findAttribute("linkTemplate");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

			Group siteGroup = themeDisplay.getSiteGroup();
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-layout:layouts-tree
      com.liferay.layout.taglib.servlet.taglib.LayoutsTreeTag _jspx_th_liferay$1layout_layouts$1tree_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.layout.taglib.servlet.taglib.LayoutsTreeTag.class) : new com.liferay.layout.taglib.servlet.taglib.LayoutsTreeTag();
      _jspx_th_liferay$1layout_layouts$1tree_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1layout_layouts$1tree_0.setParent(null);
      _jspx_th_liferay$1layout_layouts$1tree_0.setGroupId( layoutsTreeDisplayContext.getGroupId() );
      _jspx_th_liferay$1layout_layouts$1tree_0.setLinkTemplate( linkTemplate );
      _jspx_th_liferay$1layout_layouts$1tree_0.setPrivateLayout( layoutsTreeDisplayContext.isPrivateLayout() );
      _jspx_th_liferay$1layout_layouts$1tree_0.setRootLinkTemplate("<a tabindex=\"-1\" class=\"{cssClass}ml-1\" href=\"javascript:void(0);\" id=\"{id}\" title=\"{title}\">{label}</a>");
      _jspx_th_liferay$1layout_layouts$1tree_0.setRootNodeName( siteGroup.getLayoutRootNodeName(layoutsTreeDisplayContext.isPrivateLayout(), locale) );
      _jspx_th_liferay$1layout_layouts$1tree_0.setSelPlid( layoutsTreeDisplayContext.getSelPlid() );
      _jspx_th_liferay$1layout_layouts$1tree_0.setTreeId("pagesTree");
      int _jspx_eval_liferay$1layout_layouts$1tree_0 = _jspx_th_liferay$1layout_layouts$1tree_0.doStartTag();
      if (_jspx_th_liferay$1layout_layouts$1tree_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1layout_layouts$1tree_0);
        _jspx_th_liferay$1layout_layouts$1tree_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1layout_layouts$1tree_0);
      _jspx_th_liferay$1layout_layouts$1tree_0.release();
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 layoutsTreeDisplayContext.hasAdministrationPortletPermission() ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"pages-administration-link\">\n");
      out.write("\t\t\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setCssClass("ml-2");
      _jspx_th_aui_a_0.setHref( layoutsTreeDisplayContext.getAdministrationPortletURL() );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.print( LanguageUtil.get(request, "go-to-pages-administration") );
      }
      if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
        _jspx_th_aui_a_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
      _jspx_th_aui_a_0.release();
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      //  liferay-frontend:component
      com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
      _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_component_0.setParent(null);
      _jspx_th_liferay$1frontend_component_0.setComponentId( ProductNavigationProductMenuWebKeys.PAGES_TREE );
      _jspx_th_liferay$1frontend_component_0.setModule("js/PagesTree.es");
      int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
      if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
        _jspx_th_liferay$1frontend_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
      _jspx_th_liferay$1frontend_component_0.release();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_portlet_namespace_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent(null);
    int _jspx_eval_portlet_namespace_0 = _jspx_th_portlet_namespace_0.doStartTag();
    if (_jspx_th_portlet_namespace_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
      _jspx_th_portlet_namespace_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
    _jspx_th_portlet_namespace_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    _jspx_th_aui_icon_0.setImage("list");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
      _jspx_th_aui_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_0);
    _jspx_th_aui_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    _jspx_th_aui_icon_1.setImage("page");
    _jspx_th_aui_icon_1.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_1 = _jspx_th_aui_icon_1.doStartTag();
    if (_jspx_th_aui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_1);
      _jspx_th_aui_icon_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_1);
    _jspx_th_aui_icon_1.release();
    return false;
  }

  private boolean _jspx_meth_aui_icon_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.IconTag.class) : new com.liferay.taglib.aui.IconTag();
    _jspx_th_aui_icon_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    _jspx_th_aui_icon_2.setImage("ellipsis-v");
    _jspx_th_aui_icon_2.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_2 = _jspx_th_aui_icon_2.doStartTag();
    if (_jspx_th_aui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_2);
      _jspx_th_aui_icon_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_icon_2);
    _jspx_th_aui_icon_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
    _jspx_th_liferay$1ui_message_0.setKey("options");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1section_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-section
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
    _jspx_th_clay_content$1section_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1section_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_clay_content$1section_0.setContainerElement("span");
    _jspx_th_clay_content$1section_0.setCssClass("text-left");
    int _jspx_eval_clay_content$1section_0 = _jspx_th_clay_content$1section_0.doStartTag();
    if (_jspx_eval_clay_content$1section_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1section_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1section_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_0);
      _jspx_th_clay_content$1section_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_0);
    _jspx_th_clay_content$1section_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1section_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_0);
    _jspx_th_liferay$1ui_message_1.setKey("preview-draft");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1section_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-section
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
    _jspx_th_clay_content$1section_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1section_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
    _jspx_th_clay_content$1section_1.setContainerElement("span");
    _jspx_th_clay_content$1section_1.setCssClass("text-left");
    int _jspx_eval_clay_content$1section_1 = _jspx_th_clay_content$1section_1.doStartTag();
    if (_jspx_eval_clay_content$1section_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1section_1, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1section_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_1);
      _jspx_th_clay_content$1section_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_1);
    _jspx_th_clay_content$1section_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1section_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_1);
    _jspx_th_liferay$1ui_message_2.setKey("add-child-page");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1section_2(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-section
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
    _jspx_th_clay_content$1section_2.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1section_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_2);
    _jspx_th_clay_content$1section_2.setContainerElement("span");
    _jspx_th_clay_content$1section_2.setCssClass("text-left");
    int _jspx_eval_clay_content$1section_2 = _jspx_th_clay_content$1section_2.doStartTag();
    if (_jspx_eval_clay_content$1section_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1section_2, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1section_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_2);
      _jspx_th_clay_content$1section_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_2);
    _jspx_th_clay_content$1section_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1section_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_2);
    _jspx_th_liferay$1ui_message_3.setKey("add-child-collection-page");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
      _jspx_th_liferay$1ui_message_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
    _jspx_th_liferay$1ui_message_3.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1section_3(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-section
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
    _jspx_th_clay_content$1section_3.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1section_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_3);
    _jspx_th_clay_content$1section_3.setContainerElement("span");
    _jspx_th_clay_content$1section_3.setCssClass("text-left");
    int _jspx_eval_clay_content$1section_3 = _jspx_th_clay_content$1section_3.doStartTag();
    if (_jspx_eval_clay_content$1section_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1section_3, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1section_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_3);
      _jspx_th_clay_content$1section_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_3);
    _jspx_th_clay_content$1section_3.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1section_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_3);
    _jspx_th_liferay$1ui_message_4.setKey("configure");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
    _jspx_th_liferay$1ui_message_4.release();
    return false;
  }

  private boolean _jspx_meth_clay_content$1section_4(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:content-section
    com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag _jspx_th_clay_content$1section_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentSectionTag();
    _jspx_th_clay_content$1section_4.setPageContext(_jspx_page_context);
    _jspx_th_clay_content$1section_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_4);
    _jspx_th_clay_content$1section_4.setContainerElement("span");
    _jspx_th_clay_content$1section_4.setCssClass("text-left");
    int _jspx_eval_clay_content$1section_4 = _jspx_th_clay_content$1section_4.doStartTag();
    if (_jspx_eval_clay_content$1section_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1section_4, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
    }
    if (_jspx_th_clay_content$1section_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_4);
      _jspx_th_clay_content$1section_4.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1section_4);
    _jspx_th_clay_content$1section_4.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1section_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1section_4);
    _jspx_th_liferay$1ui_message_5.setKey("view-collection-items");
    int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
    if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
      _jspx_th_liferay$1ui_message_5.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_5);
    _jspx_th_liferay$1ui_message_5.release();
    return false;
  }
}
