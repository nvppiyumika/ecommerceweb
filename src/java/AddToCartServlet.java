import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the request
        String userId = (String) request.getSession().getAttribute("user_id");
        String productId = request.getParameter("pid");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Add product to the cart
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Get the database connection
            connection = DatabaseConnection.getConnection();

            // Check if the product is already in the cart
            String checkQuery = "SELECT * FROM cart WHERE user_id = ? AND pid = ?";
            statement = connection.prepareStatement(checkQuery);
            statement.setString(1, userId);
            statement.setString(2, productId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Product already in the cart, update the quantity
                int currentQuantity = resultSet.getInt("quantity");
                int newQuantity = currentQuantity + quantity;

                String updateQuery = "UPDATE cart SET quantity = ? WHERE user_id = ? AND pid = ?";
                statement = connection.prepareStatement(updateQuery);
                statement.setInt(1, newQuantity);
                statement.setString(2, userId);
                statement.setString(3, productId);
                statement.executeUpdate();
            } else {
                // Add new product to the cart
                String insertQuery = "INSERT INTO cart (user_id, pid, quantity) VALUES (?, ?, ?)";
                statement = connection.prepareStatement(insertQuery);
                statement.setString(1, userId);
                statement.setString(2, productId);
                statement.setInt(3, quantity);
                statement.executeUpdate();
            }

            // Redirect the user back to the products page
            response.sendRedirect("Products.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database resources
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
