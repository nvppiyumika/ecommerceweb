<%-- 
    Document   : customer
    Created on : Apr 22, 2024, 5:56:34 AM
    Author     : pasin
--%>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        .header {
            background-color: #004d66;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        .shop{
            text-align: left;   
        }
        .shop h2{
            font-weight: bold; 
            color: #ffffff;
            line-height:0;
            padding-left: 20px;
        }

        .menu {
            text-align: right;
        }

        .menu a {
            margin-left: 10px;
            padding: 10px 20px;
            background-color: #004d66;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        .menu a:hover {
            background-color: #e6f9ff;
            color: #004d66;
        }
    </style>
    </head>
    <body>
        <div class="header">
            <div class="shop">
            <h2>iShopLK</h2>
            </div>
            <div class="menu">
                <a href="cart.jsp">Cart</a>
                <a href="">Logout</a> 
            </div>
        </div>
        
        <h1>Hello World!</h1>
        <%@include file="footer.jsp" %>
    </body>
</html>
