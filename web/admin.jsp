<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ccf2ff; /* Light Blue */
            margin: 0;
            padding: 0;
        }

        .container {
            width: 100%;
            max-width: 800px;
            margin: 50px auto;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #002633; /* Dark Blue */
        }

        .menu {
            margin-bottom: 50px;
            text-align: center;
            
        }

        .menu a {
            margin-right: 10px;
            margin-top: 15px;
            color: #fff; /* White text */
            background-color: #002633; /* Dark Blue */
            padding: 10px 20px; /* Adjust padding for button size */
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s ease;
            display: inline-block; /* Make anchor tags inline-block to behave like buttons */
        }

        .menu a:hover {
            background-color: #00bfff; /* Light Blue */
        }

        .product-list {
            list-style-type: none;
            padding: 0;
        }

        .product-list li {
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            transition: background-color 0.3s ease;
        }

        .product-list li:hover {
            background-color: #ccf2ff; /* Light Blue */
        }
    </style>
</head>
<body>
     <%=session.getAttribute( "user")%>
    <div class="container">
        <h1>Welcome, Admin!</h1>
        <div class="menu">      
            <a href="addproduct.jsp">Add Product</a>
            <a href="updateproduct.jsp">Update Product</a>
            <a href="deleteproduct.jsp">Delete Product</a>
            <a href="vieworders.jsp">View Orders</a>
            <a href="manageusers.jsp">Manage Users</a>
            <a href="index.jsp">Logout</a>
        </div>
        <div class="content">
            <!-- Add content here based on admin actions -->
        </div>
    </div>
</body>
</html>
