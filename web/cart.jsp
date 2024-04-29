<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
     <title>Shopping Cart</title>
    <style>
        /* Add your CSS styles here */
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 90%;
            margin: auto;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #079dfa;
            color: #fff;
        }
        button {
            padding: 10px 20px;
            background-color: #dc3545;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
   
        body {
            font-family: Arial, sans-serif;
            background-color: #c6e9f5;
            margin-top:20px;
            padding: 20px;
        }

        .container {
            width: 80%;
            margin: 20px auto;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .cart-items {
            list-style-type: none;
            padding: 0;
        }

        .cart-item {
            margin-bottom: 10px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            overflow: hidden;
        }

        .item-info {
            float: left;
        }

        .item-actions {
            float: right;
        }

        .total-price {
            margin-top: 20px;
            text-align: right;
            font-weight: bold;
        }

        .checkout-button {
            display: block;
            margin-top: 20px;
            padding: 10px;
            background-color: #28a745;
            color: #fff;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .checkout-button:hover {
            background-color: #286090;
        }
    </style>
</head>
<body>

    <%@ include file="header.jsp" %>
    <div class="container">
        <h2>Cart</h2>
        <table>
            <tr>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Total</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="item" items="${cartItems}">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.quantity}</td>
                    <td>$${item.price}</td>
                    <td>$${item.quantity * item.price}</td>
                    <td>
                        <form action="RemoveFromCartServlet" method="post">
                            <input type="hidden" name="pid" value="${item.pid}">
                            <button type="submit">Remove</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h3>Total Price: $${totalPrice}</h3>
        <form action="CheckoutServlet" method="post">
            <button type="submit">Proceed to Checkout</button>
        </form>
    </div>
    <%@ include file="footer.jsp" %>
    <div class="container">
        <h1>Shopping Cart</h1>
        <ul class="cart-items">
            <!-- Iterate over cart items and display -->
            <c:forEach items="${cartItems}" var="item">
                <li class="cart-item">
                    <div class="item-info">
                        <strong>${item.product.name}</strong>
                        <br>
                        Quantity: ${item.quantity}
                        <br>
                        Price: $${item.product.price}
                    </div>
                    <div class="item-actions">
                        <form action="removeFromCart" method="post">
                            <input type="hidden" name="itemId" value="${item.id}">
                            <input type="submit" value="Remove">
                        </form>
                    </div>
                </li>
            </c:forEach>
        </ul>
        <div class="total-price">
            Total: $${totalPrice}
        </div>
        <a href="checkout" class="checkout-button">Checkout</a>
    </div>
</body>
</html>
