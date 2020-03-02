package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

  int MAX_MEMORY_SIZE = 1024 * 1024 * 2;
  final int MAX_REQUEST_SIZE = 1024 * 1024;
  
  DiskFileItemFactory factory = new DiskFileItemFactory();
  
  factory.setSizeThreshold(MAX_MEMORY_SIZE);  
    
    factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
    
    String uploadFolder = "D:/data c/3rd Year/1st Semester/IT Project Management(ITPM)/Project/CodeComplexityMeasuringTool/web/codes";
    
    ServletFileUpload upload = new ServletFileUpload(factory);
    
    upload.setSizeMax(MAX_REQUEST_SIZE);
    
    try{
        List items = upload.parseRequest(request);
        for(Object item1 : items){
            FileItem item = (FileItem) item1;
            
            if(!item.isFormField()){
                String fileName = new File(item.getName()).getName();
                String filePath = uploadFolder + File.separator + fileName;
                File uploadedFile = new File(filePath);
                
                item.write(uploadedFile);
            }
        }
        response.sendRedirect("success.jsp");
    }catch(Exception e){
        response.sendRedirect("error.jsp");
    }


      out.write('\n');
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
