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

@WebServlet("/AdminValidationServlet")
public class AdminValidationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        //get the session
        HttpSession session = request .getSession();
        //clear
         session.invalidate();
         response.sendRedirect("index.jsp");
        
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (isValidUser(username, password)) {
        // Create a session and set the username attribute
        HttpSession session = request.getSession();
        session.setAttribute("user", username); // Setting the username attribute in the session

        // Redirect to customer.jsp on successful login for customer
        response.sendRedirect("admin.jsp");
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
            String sql = "SELECT * FROM admins WHERE username = ? AND password = ?";
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
