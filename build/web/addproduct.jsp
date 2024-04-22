<%-- 
    Document   : addproduct
    Created on : Apr 21, 2024, 1:02:28 PM
    Author     : pasin
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <style>
            /* styles.css */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        
        .container {
            width: 100%;
            height: auto;
            max-width: 800px;
            margin: 50px auto;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        .row {
            margin-top: 5px;
            margin-left: 2px;
            margin-right: 2px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        select,
        textarea,
        input[type="number"],
        input[type="file"],
        button {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            margin-top: 5px;
        }

        button {
            cursor: pointer;
        }

        .col-md-6 {
            width: 50%;
            float: left;
        }

        .text-center {
            text-align: center;
        }

        .btn {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .btn-danger {
            background-color: #dc3545;
            color: #fff;
        }

        .btn-danger:hover {
            background-color: #c82333;
        }

        .btn-success {
            background-color: #28a745;
            color: #fff;
        }

        .btn-success:hover {
            background-color: #218838;
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
        <%@ include file="header.jsp" %>
        </div>
        <h1 align="center">Add New Product</h1>
        <div class="container">
		<div class="row"
			style="margin-top: 5px; margin-left: 2px; margin-right: 2px;">
			<form action="AddProductServlet" method="post" enctype="multipart/form-data">
				<div></div>
				<div class="row">
					<div class="col-md-6 form-group">
						<label for="last_name">Product Name</label> <input type="text"
							placeholder="Enter Product Name" name="name" class="form-control"
							id="last_name" required>
					</div>
					<div class="col-md-6 form-group">
						<label for="producttype">Product Type</label> <select name="type"
							id="producttype" class="form-control" required>
							<option value="mobile">MOBILE</option>
							<option value="tv">TV</option>
							<option value="camera">CAMERA</option>
							<option value="laptop">LAPTOP</option>
							<option value="tablet">TABLET</option>
							<option value="speaker">SPEAKER</option>
							<option value="other">Some Other Appliances</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label for="last_name">Product Description</label>
					<textarea name="info" class="form-control" id="last_name" required></textarea>
				</div>
				<div class="row">
					<div class="col-md-6 form-group">
						<label for="last_name">Unit Price</label> <input type="number"
							placeholder="Enter Unit Price" name="price" class="form-control"
							id="last_name" required>
					</div>
					<div class="col-md-6 form-group">
						<label for="last_name">Stock Quantity</label> <input type="number"
							placeholder="Enter Stock Quantity" name="quantity"
							class="form-control" id="last_name" required>
					</div>
				</div>
				<div>
					<div class="col-md-12 form-group">
						<label for="last_name">Product Image</label> <input type="file"
							placeholder="Select Image" name="image" class="form-control"
							id="last_name" required>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 text-center" style="margin-bottom: 2px;">
						<button type="reset" class="btn btn-danger">Reset</button>
					</div>
					<div class="col-md-6 text-center">
						<button type="submit" class="btn btn-success">Add Product</button>
					</div>
				</div>
			</form>
		</div>
	</div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
