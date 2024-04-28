import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserValidationServlet")
public class UserValidationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (isValidUser(username, password)) {
            // Redirect to customer.jsp on successful login for customer
            
            HttpSession session = request.getSession();
            // get user name from 
            String name= request.getParameter("username");
            session.setAttribute("user",name);
            response.sendRedirect("customer.jsp");
        } else {
            // Display error message on login failure
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Login Failed. Invalid username or password.</h2></body></html>");
        }
    }

    private boolean isValidUser(String username, String password) {
        // JDBC URL, username, and password of your database
        String jdbcURL = "jdbc:mysql://localhost:3306/ecommerceweb";
        String dbUsername = "root";
        String dbPassword = "";

        try (Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // Return true if a matching user is found
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
 