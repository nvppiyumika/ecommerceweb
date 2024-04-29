import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String birthDate = request.getParameter("birth_date");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerceweb", "root", "");

            PreparedStatement ps = con.prepareStatement("INSERT INTO users (Name, birth_date, gender, email, username, password) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, birthDate);
            ps.setString(3, gender);
            ps.setString(4, email);
            ps.setString(5, username);
            ps.setString(6, password);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                out.println("<h2>User registered successfully!</h2>");
            } else {
                out.println("<h2>Error registering user. Please try again.</h2>");
            }

            con.close();
        } catch (Exception e) {
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        }

        out.close();
    }
}
