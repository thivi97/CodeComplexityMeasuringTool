<%-- 
    Document   : footer
    Created on : 24-Feb-2020, 15:19:15
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
        <style>
            body {
                font-family: calibri;
                margin: 0px;
            }
            
            .mainFooter {
                height: auto;
                width: auto;
                margin-left: auto;
                margin-right: auto;
                background-color: #484157;
                padding: 30px;
            }
            
            .details th, .details td {
                color: #F0CFC9;
                text-align: left;
            }
            
            .details th {
                color: #707076;
            }
            
        </style>
    </head>
    <body>
        
        <div class="mainFooter">
            <div class="details">
                <table align="center">
                    <tr>
                        <th style="width: 300px;">Contact</th>
                        <th style="width: 300px;">About</th>
                        <th style="width: 300px;">Support Us</th>
                        <th style="width: 300px;">Follow Us</th>
                    </tr>
                    
                    <tr>
                        <td>+94 114 500 199</td>
                        <td>Terms of Service</td>
                        <td></td>
                        <td>Face Book</td>
                    </tr>
                    
                    <tr>
                        <td>+94 077 366 9767</td>
                        <td>Privacy Policy</td>
                        <td></td>
                        <td><img src="../src/java/images/insta.jpg"/></td>
                    </tr>
                    
                    <tr>
                        <td>+94 077 700 6773</td>
                        <td>Trust & Safety</td>
                        <td></td>
                        <td>Twitter</td>
                    </tr>
                    
                    <tr>
                        <td>+94 077 787 6003</td>
                        <td>Trust & Safety</td>
                        <td></td>
                        <td>Google+</td>
                    </tr>
                    
                </table>
                <br/>
            </div>
            <footer style="color: dimgray; text-align: center;">
                Last updated:
                <%= new java.util.Date() %><br/> Copyright &copy; CDE IT Solution
                Code Complexity Measuring Tool 2020. All Rights Reserved.
            </footer>
        </div>
        
        
    </body>
</html>
