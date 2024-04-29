
public class RemoveFromCartServlet {

}
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class RemoveFromCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the user ID from the session and product ID from the request
        String userId = (String) request.getSession().getAttribute("user_id");
        String productId = request.getParameter("pid");

        // Remove the product from the cart
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Get the database connection
            connection = DatabaseConnection.getConnection();

            // Delete the product from the cart
            String deleteQuery = "DELETE FROM cart WHERE user_id = ? AND pid = ?";
            statement = connection.prepareStatement(deleteQuery);
            statement.setString(1, userId);
            statement.setString(2, productId);
            statement.executeUpdate();

            // Redirect the user back to the cart page
            response.sendRedirect("Cart.jsp");
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
