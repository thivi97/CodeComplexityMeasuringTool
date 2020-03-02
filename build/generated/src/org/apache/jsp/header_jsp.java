package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: calibri;\n");
      out.write("                margin: 0px;\n");
      out.write("                background-color: #F8F8F8;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .mainHeader{\n");
      out.write("                height: 85px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #0F0228;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                z-index: 0;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                height: 130px;\n");
      out.write("                width: 320px;\n");
      out.write("                float: left;\n");
      out.write("                margin-left: 15px;\n");
      out.write("                border: none;\n");
      out.write("                background-image: url(images/logo.png);\n");
      out.write("                background-size: contain;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog{\n");
      out.write("                height: 30px;\n");
      out.write("                width: 270px;\n");
      out.write("                float: right;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                margin-left: 100px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog button{\n");
      out.write("                height: 30px;\n");
      out.write("                width: 60px;\n");
      out.write("                border: 0px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                float: right;\n");
      out.write("                transition: background-color 0.2s ease-in-out;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .account{\n");
      out.write("                height: 40px;\n");
      out.write("                width: 40px;\n");
      out.write("                background-image: url(images/default.png);\n");
      out.write("                background-size: cover;\n");
      out.write("                border: 1.5px solid #00d32d;\n");
      out.write("                border-radius: 100px;\n");
      out.write("                margin-top: -5px;\n");
      out.write("                margin-right: 30px;\n");
      out.write("                transition: border 0.2s ease-in-out;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .account:hover{\n");
      out.write("                border: 1.5px solid red;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .logout{\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 60px;\n");
      out.write("                border: 0px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .logout:hover{\n");
      out.write("                background-color: #FF3333;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .loginButton{\n");
      out.write("                background-color: #4EA250;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .loginButton:hover{\n");
      out.write("                background-color: #8FEA90;\n");
      out.write("                color: #0F0228;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .signupButton{\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .userLog .signupButton:hover{\n");
      out.write("                background-color: #EB7979;\n");
      out.write("                color: #0F0228;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"logo\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
