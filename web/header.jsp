<%--
    Document   : header
    Created on : 25-Feb-2020, 10:19:32
    Author     : User
--%>
<%@page import="model.Info" %>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <style>
            body{
                font-family: calibri;
                margin: 0px;
                background-color: #F8F8F8;
            }
            
            a{
                text-decoration: none;
            }
            
            .mainHeader{
                height: 85px;
                width: 100%;
                background-color: #0F0228;
                padding-top: 10px;
                padding-bottom: 10px;
                position: fixed;
                top: 0;
                z-index: 0;
            }
            .logo{
                height: 130px;
                width: 320px;
                float: left;
                margin-left: 10px;
                border: none;
                background-image: url(images/logo.png);
                background-size: contain;
                background-repeat: no-repeat;
                
            }
            
            .userLog{
                height: 30px;
                width: 270px;
                float: right;
                padding-top: 20px;
                margin-left: 100px;
            }
            
            .userLog button{
                height: 30px;
                width: 60px;
                border: 0px;
                border-radius: 5px;
                margin-right: 10px;
                float: right;
                transition: background-color 0.2s ease-in-out;
            }
            
            .userLog .account{
                height: 40px;
                width: 40px;
                background-image: url(images/default.png);
                background-size: cover;
                border: 1.5px solid #00d32d;
                border-radius: 100px;
                margin-top: -5px;
                margin-right: 30px;
                transition: border 0.2s ease-in-out;
            }
            
            .userLog .account:hover{
                border: 1.5px solid red;
            }
            
            .userLog .logout{
                background-color: red;
                color: white;
                height: 30px;
                width: 60px;
                border: 0px;
                border-radius: 5px;
            }
            
            .userLog .logout:hover{
                background-color: #FF3333;
                border: none;
            }
            
            .userLog .loginButton{
                background-color: #4EA250;
                color: white;
            }
            
            .userLog .loginButton:hover{
                background-color: #8FEA90;
                color: #0F0228;
            }
            
            .userLog .signupButton{
                background-color: red;
                color: white;
            }
            
            .userLog .signupButton:hover{
                background-color: #EB7979;
                color: #0F0228;
            }
            
        </style>
        
    </head>
    <body>
        <div class="mainHeader" align="center">
        <div class="logo"></div>
        </div>
        
        <div class="userLog">
            
            <a href="register.jsp"><button class="signupButton">Signup</button></a>
            <a href="login.jsp"><button class="loginButton">Login</button></a>
           
           
            
        </div>
        
    </body>
</html>
