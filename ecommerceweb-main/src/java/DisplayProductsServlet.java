import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayProductsServlet")
public class DisplayProductsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Replace with your actual JDBC connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerceweb";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Product> productList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerceweb", "root", "");

            String sql = "SELECT * FROM products";
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setPid(rs.getString("pid"));
                product.setName(rs.getString("pname"));
                product.setType(rs.getString("ptype"));
                product.setInfo(rs.getString("pinfo"));
                product.setPrice(rs.getDouble("pprice"));
                product.setQuantity(rs.getInt("pquantity"));
                // You may need to handle the image retrieval here
                productList.add(product);
            }

            request.setAttribute("productList", productList);
            request.getRequestDispatcher("products.jsp").forward(request, response);

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                out.println("<h3>Error closing database connections: " + e.getMessage() + "</h3>");
            }
        }
    }
}
