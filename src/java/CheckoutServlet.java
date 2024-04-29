import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class CheckoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the user ID from the session and form inputs from the request
        String userId = (String) request.getSession().getAttribute("user_id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        
        Connection connection = null;
        PreparedStatement orderStatement = null;
        PreparedStatement itemStatement = null;
        ResultSet cartItems = null;
        
        try {
            // Get the database connection
            connection = DatabaseConnection.getConnection();

            // Begin a transaction
            connection.setAutoCommit(false);

            // Create a new order entry
            String orderQuery = "INSERT INTO orders (user_id, order_date, total_price, name, address, email, phone) VALUES (?, CURRENT_TIMESTAMP, ?, ?, ?, ?, ?)";
            orderStatement = connection.prepareStatement(orderQuery, Statement.RETURN_GENERATED_KEYS);
            orderStatement.setString(1, userId);
            orderStatement.setDouble(2, request.getSession().getAttribute("totalPrice"));
            orderStatement.setString(3, name);
            orderStatement.setString(4, address);
            orderStatement.setString(5, email);
            orderStatement.setString(6, phone);
            orderStatement.executeUpdate();

            // Get the generated order ID
            ResultSet generatedKeys = orderStatement.getGeneratedKeys();
            int orderId = 0;
            if (generatedKeys.next()) {
                orderId = generatedKeys.getInt(1);
            }

            // Retrieve cart items from the session
            cartItems = (ResultSet) request.getSession().getAttribute("cartItems");

            // Add order items to the order_items table
            while (cartItems.next()) {
                int productId = cartItems.getInt("pid");
                int quantity = cartItems.getInt("quantity");

                String itemQuery = "INSERT INTO order_items (order_id, pid, quantity) VALUES (?, ?, ?)";
                itemStatement = connection.prepareStatement(itemQuery);
                itemStatement.setInt(1, orderId);
                itemStatement.setInt(2, productId);
                itemStatement.setInt(3, quantity);
                itemStatement.executeUpdate();
            }

            // Commit the transaction
            connection.commit();

            // Clear the user's cart
            request.getSession().setAttribute("cartItems", null);
            request.getSession().setAttribute("totalPrice", null);

            // Redirect the user to an order confirmation page
            response.sendRedirect("OrderConfirmation.jsp");
        } catch (SQLException e) {
            // Roll back the transaction in case of error
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            // Log the error and display an error message
            e.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred during checkout. Please try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Checkout.jsp");
            dispatcher.forward(request, response);
        } finally {
            // Close the database resources
            if (itemStatement != null) {
                try {
                    itemStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (orderStatement != null) {
                try {
                    orderStatement.close();
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
