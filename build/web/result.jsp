<%-- 
    Document   : result
    Created on : 25-Feb-2020, 14:52:07
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.io.*,java.util.*" %>
<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="org.apache.commons.fileupload.disk.*" %>
<%@page import="org.apache.commons.fileupload.servlet.*" %>

<%
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

%>
<%--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
--%>