<%-- 
    Document   : index
    Created on : 24-Feb-2020, 15:19:03
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <h3>Choose File to Upload in Server</h3>
            <form action="result.jsp" method="post" enctype="multipart/form-data">
                <h3>File Upload:</h3>
                Select a file to upload: <br/>
                <input type="file" name="file"/>
                <br/>
                <input type="submit" value="upload"/>
            </form>
        
    </body>
</html>
