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
      width: 70%;
      margin: auto;
    }
    
    .product-card {
      border: 1px solid #ddd;
      border-radius: 5px;
      margin-bottom: 20px;
      display: inline-block;
      width: calc(33.33% - 20px); /* Adjust based on your grid layout */
      vertical-align: top;
      box-sizing: border-box;
      /* Ensure all product cards have the same height */
      height: auto;
      padding-bottom: 100px;
    }
    .product-card img {
      max-width: 100%;
      height: 200px; /* Adjust the image height as needed */
      object-fit: cover; /* Ensure images cover the entire container */
      border-top-left-radius: 5px;
      border-top-right-radius: 5px;
    }
    .product-card .card-content {
      padding: 10px;
      background-color: #f9f9f9;
      border-bottom-left-radius: 5px;
      border-bottom-right-radius: 5px;
      height: calc(100% - 200px); /* Calculate the height for content */
      overflow: hidden; /* Hide overflowing content */
    }
    .product-card .card-content h3 {
      margin-top: 0;
      overflow: hidden;
      text-overflow: ellipsis; /* Add ellipsis for long text */
      white-space: nowrap;
    }
    .product-card .buttons {
      text-align: center;
      margin-top: 10px;
    }
    .buttons button {
      padding: 8px 16px;
      background-color: #079dfa;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      margin-right: 10px;
    }
    .buttons button:hover {
      background-color: #555;
    }
  </style>
</head>
<body>
  <div>
    <%@ include file="header.jsp" %>
    <br>
    <div class="container">
      <div class="content">
        <h2>Products</h2>
        <div class="product-grid">
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
                <button>Add to Cart</button>
                <button>Buy Now</button>
              </div>
            </div>
          </c:forEach>
        </div>
      </div>
    </div>
    <%@ include file="footer.jsp" %>
  </div>
</body>
</html>
