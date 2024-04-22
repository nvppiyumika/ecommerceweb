package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Home</title>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #004d66;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .search-bar {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-bar input[type=\"text\"] {\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 60%;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .banner{\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-bar input[type=\"submit\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #079dfa;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .search-bar input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu {\n");
      out.write("            text-align: right;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a {\n");
      out.write("            margin-left: 10px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #004d66;\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu a:hover {\n");
      out.write("            background-color: #e6f9ff;\n");
      out.write("            color: #004d66;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .footer {\n");
      out.write("            background-color: #004d66;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("            <a href=\"products.jsp\">Products</a>\n");
      out.write("            <a href=\"cart.jsp\">Cart</a>\n");
      out.write("            <a href=\"register.jsp\">Register</a>\n");
      out.write("            <a href=\"login.jsp\">Login</a> \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"search-bar\">\n");
      out.write("                <form action=\"SearchServlet\" method=\"get\">\n");
      out.write("                    <input type=\"text\" name=\"query\" placeholder=\"Search products...\">\n");
      out.write("                    <input type=\"submit\" value=\"Search\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <image class=\"banner\" src=\"images\\banner.jpg\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h2>About Us</h2>\n");
      out.write("                <p>Welcome to our online store! We offer a wide range of products for you to browse and purchase.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>&copy; 2024 Your E-commerce Store</p>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
