import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // JDBC URL, username, and password for your MySQL database
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerceweb";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Retrieve form data
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String info = request.getParameter("info");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        
        // Image upload handling
        InputStream inputStream = null; // Input stream of the upload file
        Part filePart = request.getPart("image");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
            
            // Generate unique product ID
            String pid = UUID.randomUUID().toString();
            
            // SQL query to insert data into products table
            String sql = "INSERT INTO products (pid, pname, ptype, pinfo, pprice, pquantity, image) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pid);
            stmt.setString(2, name);
            stmt.setString(3, type);
            stmt.setString(4, info);
            stmt.setDouble(5, price);
            stmt.setInt(6, quantity);
            
            // Set the input stream for the image blob
            if (inputStream != null) {
                stmt.setBlob(7, inputStream);
            }
            
            // Execute the SQL statement
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                out.println("<h3>Product added successfully!</h3>");
            } else {
                out.println("<h3>Error adding product!</h3>");
            }
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                out.println("<h3>Error closing database connections: " + e.getMessage() + "</h3>");
            }
        }
    }
}
