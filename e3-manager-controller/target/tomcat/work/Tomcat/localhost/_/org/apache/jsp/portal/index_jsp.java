/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-08-12 09:49:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }/layout/inc.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\tvar portalLayout;\r\n");
      out.write("\tvar portal;\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tportalLayout = $('#portalLayout').layout({\r\n");
      out.write("\t\t\tfit : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(window).resize(function() {\r\n");
      out.write("\t\t\tportalLayout.layout('panel', 'center').panel('resize', {\r\n");
      out.write("\t\t\t\twidth : 1,\r\n");
      out.write("\t\t\t\theight : 1\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tpanels = [ {\r\n");
      out.write("\t\t\tid : 'p1',\r\n");
      out.write("\t\t\ttitle : '关于宜立方',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/about'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tid : 'p2',\r\n");
      out.write("\t\t\ttitle : 'link',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/link'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tid : 'p3',\r\n");
      out.write("\t\t\ttitle : '数据库维护',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/repair'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tid : 'p4',\r\n");
      out.write("\t\t\ttitle : '库存排序',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/seq'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tid : 'p5',\r\n");
      out.write("\t\t\ttitle : '日志',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/about2'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tid : 'p6',\r\n");
      out.write("\t\t\ttitle : '宜立方通讯录',\r\n");
      out.write("\t\t\theight : 200,\r\n");
      out.write("\t\t\tcollapsible : true\r\n");
      out.write("\t\t\t//href : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/baseController/portal/qun'\r\n");
      out.write("\t\t} ];\r\n");
      out.write("\r\n");
      out.write("\t\tportal = $('#portal').portal({\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tonStateChange : function() {\r\n");
      out.write("\t\t\t\t$.cookie('portal-state', getPortalState(), {\r\n");
      out.write("\t\t\t\t\texpires : 7\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tvar state = $.cookie('portal-state');\r\n");
      out.write("\t\tif (!state) {\r\n");
      out.write("\t\t\tstate = 'p1,p2,p3:p4,p5,p6';/*冒号代表列，逗号代表行*/\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\taddPortalPanels(state);\r\n");
      out.write("\t\tportal.portal('resize');\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction getPanelOptions(id) {\r\n");
      out.write("\t\tfor ( var i = 0; i < panels.length; i++) {\r\n");
      out.write("\t\t\tif (panels[i].id == id) {\r\n");
      out.write("\t\t\t\treturn panels[i];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn undefined;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getPortalState() {\r\n");
      out.write("\t\tvar aa = [];\r\n");
      out.write("\t\tfor ( var columnIndex = 0; columnIndex < 2; columnIndex++) {\r\n");
      out.write("\t\t\tvar cc = [];\r\n");
      out.write("\t\t\tvar panels = portal.portal('getPanels', columnIndex);\r\n");
      out.write("\t\t\tfor ( var i = 0; i < panels.length; i++) {\r\n");
      out.write("\t\t\t\tcc.push(panels[i].attr('id'));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\taa.push(cc.join(','));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn aa.join(':');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction addPortalPanels(portalState) {\r\n");
      out.write("\t\tvar columns = portalState.split(':');\r\n");
      out.write("\t\tfor ( var columnIndex = 0; columnIndex < columns.length; columnIndex++) {\r\n");
      out.write("\t\t\tvar cc = columns[columnIndex].split(',');\r\n");
      out.write("\t\t\tfor ( var j = 0; j < cc.length; j++) {\r\n");
      out.write("\t\t\t\tvar options = getPanelOptions(cc[j]);\r\n");
      out.write("\t\t\t\tif (options) {\r\n");
      out.write("\t\t\t\t\tvar p = $('<div/>').attr('id', options.id).appendTo('body');\r\n");
      out.write("\t\t\t\t\tp.panel(options);\r\n");
      out.write("\t\t\t\t\tportal.portal('add', {\r\n");
      out.write("\t\t\t\t\t\tpanel : p,\r\n");
      out.write("\t\t\t\t\t\tcolumnIndex : columnIndex\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"portalLayout\">\r\n");
      out.write("\t\t<div data-options=\"region:'center',border:false\">\r\n");
      out.write("\t\t\t<div id=\"portal\" style=\"position: relative\">\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
