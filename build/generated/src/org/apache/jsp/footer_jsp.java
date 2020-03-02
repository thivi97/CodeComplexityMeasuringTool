package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Footer</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: calibri;\n");
      out.write("                margin: 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .mainFooter {\n");
      out.write("                height: auto;\n");
      out.write("                width: auto;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                background-color: #484157;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .details th, .details td {\n");
      out.write("                color: #F0CFC9;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .details th {\n");
      out.write("                color: #707076;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"mainFooter\">\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 300px;\">Contact</th>\n");
      out.write("                        <th style=\"width: 300px;\">About</th>\n");
      out.write("                        <th style=\"width: 300px;\">Support Us</th>\n");
      out.write("                        <th style=\"width: 300px;\">Follow Us</th>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>+94 114 500 199</td>\n");
      out.write("                        <td>Terms of Service</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><image class=\"icon\" src=\"images/fb-art.png\" width=\"40px\" height=\"40px\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>+94 077 366 9767</td>\n");
      out.write("                        <td>Privacy Policy</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><image class=\"icon\" src=\"images/google.png\" width=\"40px\" height=\"40px\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>+94 077 700 6773</td>\n");
      out.write("                        <td>Trust & Safety</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><image class=\"icon\" src=\"images/twitter.png\" width=\"40px\" height=\"40px\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>+94 077 787 6003</td>\n");
      out.write("                        <td>Trust & Safety</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><image class=\"icon\" src=\"images/insta.jpg\" width=\"40px\" height=\"40px\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                <br/>\n");
      out.write("            </div>\n");
      out.write("            <footer style=\"color: dimgray; text-align: center;\">\n");
      out.write("                Last updated:\n");
      out.write("                ");
      out.print( new java.util.Date() );
      out.write("<br/> Copyright &copy; CDE IT Solution\n");
      out.write("                Code Complexity Measuring Tool 2020. All Rights Reserved.\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
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
