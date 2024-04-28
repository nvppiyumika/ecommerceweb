package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("        .header {\r\n");
      out.write("            background-color: #004d66;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .shop{\r\n");
      out.write("            text-align: left;   \r\n");
      out.write("        }\r\n");
      out.write("        .shop h2{\r\n");
      out.write("            font-weight: bold; \r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            line-height:0;\r\n");
      out.write("            padding-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu {\r\n");
      out.write("            text-align: right;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu a {\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            background-color: #004d66;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .menu a:hover {\r\n");
      out.write("            background-color: #e6f9ff;\r\n");
      out.write("            color: #004d66;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            \r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"shop\">\r\n");
      out.write("            <h2>iShopLK</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"menu\">\r\n");
      out.write("                ");
      out.print(session.getAttribute( "user"));
      out.write("\r\n");
      out.write("                <a href=\"./cart.jsp\">Cart</a>\r\n");
      out.write("                <a href=\"./index.jsp\">Logout</a> \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <h1>Latest Products</h1>\r\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Footer</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Add your footer styles here */\r\n");
      out.write("        .footer {\r\n");
      out.write("            display: flex; /* Use flexbox */\r\n");
      out.write("            justify-content: space-between; /* Align items to both ends */\r\n");
      out.write("            background-color: #004d66;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .adminlogo {\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            width: 40px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <p>&copy; 2024 Your E-commerce Store</p>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"adminlogin.jsp\"><img class=\"adminlogo\" src=\"images\\user_8484093.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
