<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Products</title>
  <style>
    /* Add your CSS styles here */
    body {
      font-family: Arial, sans-serif;
    }
    .container {
      width: 90%;
      margin: auto;
    }
     
    .search-bar {
            margin-bottom: 20px;
            text-align: center;
        }

        .search-bar input[type="text"] {
            padding: 10px;
            width: 60%;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
        }

        .search-bar input[type="submit"] {
            padding: 10px 20px;
            background-color: #079dfa;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .search-bar input[type="submit"]:hover {
            background-color: #555;
        }

    .content {
      padding: 20px;
    }
    .footer {
      background-color: #333;
      color: #fff;
      padding: 10px;
      text-align: center;
    }
  </style>
</head>
<body>
  <div>
    <%@ include file="header.jsp" %>
    <br>
    <div class="container">
      <div class="search-bar">
        <form action="SearchServlet" method="get">
          <input type="text" name="query" placeholder="Search products...">
          <input type="submit" value="Search">
        </form>
      </div>
      
      <div class="content">
        <h2>Products</h2>
        <table border="1">
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Info</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Image</th>
          </tr>
          <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.pid}</td>
                <td>${product.name}</td>
                <td>${product.type}</td>
                <td>${product.info}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td><img src="DisplayImageServlet?pid=${product.pid}" width="100" height="100" alt="Product Image"></td>
            </tr>
            </c:forEach>
        </table>
      </div>
    </div>
    <%@ include file="footer.jsp" %>
  </div>
</body>
</html>
