import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerceweb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productId = request.getParameter("pid");

        if (productId != null) {
            try {
                Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
                String sql = "DELETE FROM products WHERE pid=?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, productId);
                int rowsDeleted = statement.executeUpdate();

                conn.close();

                if (rowsDeleted > 0) {
                    response.sendRedirect("deleteproduct.jsp?deleted=true");
                } else {
                    response.sendRedirect("deleteproduct.jsp?deleted=false");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                response.sendRedirect("deleteproduct.jsp?deleted=false");
            }
        } else {
            response.sendRedirect("deleteproduct.jsp?deleted=false");
        }
    }
}
