<%-- 
    Document   : deleteproduct
    Created on : Apr 22, 2024, 1:51:58 AM
    Author     : pasin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Delete Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        .container {
            width: 100%;
            height: 30%;
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        .header {
            background-color: #004d66;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        .menu {
            text-align: right;
            margin-bottom: 20px;
            margin-top: 20px;
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
        h1 {
            padding-top: 30px;
            text-align: center;
        }
        form {
            margin-top: 20px;
            
        }
        input[type="text"], input[type="submit"] {
            padding: 10px;
            margin-right: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #dc3545;
            color: white;
            border: none;
            cursor: pointer;
        }
        p {
            margin-top: 10px;
            padding: 10px;
            border-radius: 5px;
        }
        .success {
            background-color: #dff0d8;
            color: #3c763d;
            border: 1px solid #d6e9c6;
        }
        .error {
            background-color: #f2dede;
            color: #a94442;
            border: 1px solid #ebccd1;
        }
        .footer {
            background-color: #004d66;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="header">
            <div class="menu">
            <a href="products.jsp">Products</a>
            <a href="cart.jsp">Cart</a>
            <a href="register.jsp">Register</a>
            <a href="login.jsp">Login</a> 
        </div>
        </div>
    
    <h1>Delete Product</h1>
    <div class="container">
        
        <form action="DeleteProductServlet" method="GET" align="center">
            Enter Product ID to delete: <input type="text" name="pid" required>
            <input type="submit" value="Delete">
            <br><br><br><br>
            
            <% if (request.getParameter("deleted") != null) { %>
        <% if (Boolean.parseBoolean(request.getParameter("deleted"))) { %>
            <p>Product deleted successfully!</p>
        <% } else { %>
            <p>Error deleting product. Please try again.</p>
        <% } %>
    <% } %>
        </form>
    </div>
    
    
    <div class="footer">
            <p>&copy; 2024 Your E-commerce Store</p>
        </div>
</body>
</html>
