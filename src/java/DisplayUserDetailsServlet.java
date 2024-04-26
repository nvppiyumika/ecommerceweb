import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayUserDetailsServlet")
public class DisplayUserDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
       
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerceweb", "root", "");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();

            ArrayList<HashMap<String, String>> userList = new ArrayList<>();
            while (rs.next()) {
                HashMap<String, String> userMap = new HashMap<>();
                userMap.put("id", rs.getString("id"));
                userMap.put("name", rs.getString("name"));
                userMap.put("birth_date", rs.getString("birth_date"));
                userMap.put("gender", rs.getString("gender"));
                userMap.put("email", rs.getString("email"));
                userMap.put("username", rs.getString("username"));
                userMap.put("password", rs.getString("password"));
                userList.add(userMap);
            }

            con.close();

            // Set user list as request attribute
            request.setAttribute("userList", userList);
            // Forward to display.jsp
            request.getRequestDispatcher("display.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}