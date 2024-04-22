<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Header</title>
    <style>
        /* Add your header styles here */
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
            <a href="products.jsp">Products</a>
            <a href="cart.jsp">Cart</a>
            <a href="register.jsp">Register</a>
            <a href="login.jsp">Login</a> 
        </div>
    </div>
</body>
</html>
