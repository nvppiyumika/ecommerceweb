package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Admin Dashboard</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #ccf2ff; /* Light Blue */\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            max-width: 800px;\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            color: #002633; /* Dark Blue */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu {\r\n");
      out.write("            margin-bottom: 50px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu a {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("            margin-top: 15px;\r\n");
      out.write("            color: #fff; /* White text */\r\n");
      out.write("            background-color: #002633; /* Dark Blue */\r\n");
      out.write("            padding: 10px 20px; /* Adjust padding for button size */\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("            display: inline-block; /* Make anchor tags inline-block to behave like buttons */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu a:hover {\r\n");
      out.write("            background-color: #00bfff; /* Light Blue */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-list {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-list li {\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .product-list li:hover {\r\n");
      out.write("            background-color: #ccf2ff; /* Light Blue */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     ");
      out.print(session.getAttribute( "user"));
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Welcome, Admin!</h1>\r\n");
      out.write("        <div class=\"menu\">      \r\n");
      out.write("            <a href=\"addproduct.jsp\">Add Product</a>\r\n");
      out.write("            <a href=\"updateproduct.jsp\">Update Product</a>\r\n");
      out.write("            <a href=\"deleteproduct.jsp\">Delete Product</a>\r\n");
      out.write("            <a href=\"vieworders.jsp\">View Orders</a>\r\n");
      out.write("            <a href=\"manageusers.jsp\">Manage Users</a>\r\n");
      out.write("            <a href=\"index.jsp\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <!-- Add content here based on admin actions -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
