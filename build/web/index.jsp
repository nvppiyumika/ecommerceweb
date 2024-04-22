<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        /* Add your custom styles here */
        body {
            font-family: Arial, sans-serif;
        }

        .container {
            width: 90%;
            margin: auto;
        }
        
        .banner{
            width: 100%;
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
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>
    <br><br>

    <div class="container">
        <div class="search-bar">
            <form action="SearchServlet" method="get">
                <input type="text" name="query" placeholder="Search products...">
                <input type="submit" value="Search">
            </form>
        </div>
        
        <div>
            <image class="banner" src="images\banner.jpg">
        </div>

        <div class="content">
    <h2 style="color: #333; text-align: center; font-size: 28px; margin-bottom: 20px;">About Us</h2>
    <p style="font-size: 18px; line-height: 1.6; color: #666; text-align: justify;">
        Welcome to <span style="font-weight: bold; color: #079dfa;">iShopLK</span>! We are dedicated to providing you with a wide range of 
        high-quality electronic products to meet your needs. Our mission is to offer the latest gadgets and appliances, ensuring a seamless 
        shopping experience and exceptional customer service. Whether you're looking for smartphones, laptops, TVs, or other electronic essentials, 
        we've got you covered. Explore our collection and discover the convenience of shopping for electronics online with us.
    </p>
</div>

    </div>

    <%@ include file="footer.jsp" %>
</body>
</html>
