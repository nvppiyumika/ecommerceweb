import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayImageServlet")
public class DisplayImageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Replace with your actual JDBC connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerceweb";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pid = request.getParameter("pid"); // Get product ID from request parameter

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

            String sql = "SELECT image FROM products WHERE pid = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pid);

            rs = stmt.executeQuery();

            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                byte[] imageBytes = blob.getBytes(1, (int) blob.length()); // Convert Blob to byte array

                // Set response content type based on image format (replace with appropriate content type if needed)
                response.setContentType("image/jpeg");

                OutputStream os = response.getOutputStream();
                os.write(imageBytes);
                os.flush();
                os.close();
            } else {
                // Handle case where no image is found for the product ID
                response.setContentType("text/plain");
                response.getWriter().println("Image not found for product ID: " + pid);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle errors appropriately (e.g., log the exception)
            response.setContentType("text/plain");
            response.getWriter().println("Error retrieving image: " + e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                // Handle closing connection errors
                e.printStackTrace();
            }
        }
    }
}
