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
  <div class="product-card">
    <img src="DisplayImageServlet?pid=${product.pid}" alt="Product Image">
    <div class="card-content">
      <h3>${product.name}</h3>
      <p>Type: ${product.type}</p>
      <p>Info: ${product.info}</p>
      <p>Price: $${product.price}</p>
    </div>
    <div class="buttons">
      <form action="AddToCartServlet" method="post">
        <input type="hidden" name="pid" value="${product.pid}">
        <input type="hidden" name="price" value="${product.price}">
        <label for="quantity-${product.pid}">Quantity:</label>
        <input type="number" id="quantity-${product.pid}" name="quantity" value="1" min="1" max="${product.quantity}">
        <button type="submit">Add to Cart</button>
      </form>
    </div>
  </div>
</c:forEach>

        </table>
      </div>
    </div>
    <%@ include file="footer.jsp" %>
  </div>
</body>
</html>
