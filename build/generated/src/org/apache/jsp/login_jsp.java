package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #0F0228;\n");
      out.write("                margin: 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .name{\n");
      out.write("                color: #00004d;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 50px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                margin: 80px;\n");
      out.write("                transition: color 0.15s;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .name:hover{\n");
      out.write("                color: #008000;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .mainArea{\n");
      out.write("                width: auto;\n");
      out.write("                height: 600px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                float: center;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .content{\n");
      out.write("                min-width: 600px;\n");
      out.write("                height: 480px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                margin-right: 400px;\n");
      out.write("                margin-left: 400px;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #F8F8F8;\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.1), 0 6px 20px 0 rgba(0, 0, 0, 0.1);\n");
      out.write("                float: center;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"text\"],input[type=\"email\"]{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                border: 1px solid gray;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"password\"]{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                border: 1px solid gray;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"submit\"], .back{\n");
      out.write("                height: 50px;\n");
      out.write("                width: 85px;\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: white;\n");
      out.write("                background-color: red;\n");
      out.write("                border: 0px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: background-color 0.2s ease-in-out; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"reset\"]{\n");
      out.write("                height: 50px;\n");
      out.write("                width: 85px;\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: white;\n");
      out.write("                background-color: red;\n");
      out.write("                border: 0px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: background-color 0.2s ease-in-out;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"submit\"]:hover, .back:hover{\n");
      out.write("                color: red;\n");
      out.write("                background-color: white;\n");
      out.write("                border: 1px solid red;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"reset\"]:hover{\n");
      out.write("                color: red;\n");
      out.write("                background-color: white;\n");
      out.write("                border: 1px solid red;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mainArea\" align=\"center\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <font size=\"10\" color=\"black\"><b>LOGIN</b></font>\n");
      out.write("                <br> <br> <br> <br> <br> <br>\n");
      out.write("                \n");
      out.write("                <form method=\"POST\" action=\"login\">\n");
      out.write("                    <input type=\"text\" name=\"userName\" placeholder=\"Enter userName*\" required><br/>\n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Enter password*\" required><br/>\n");
      out.write("                    <input type=\"submit\" value=\"Login\"/> &nbsp;\n");
      out.write("                    <input type=\"reset\" value=\"Reset\"/> <br/> <br/>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
