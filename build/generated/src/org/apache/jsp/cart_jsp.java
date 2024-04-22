package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Shopping Cart</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f2f2f2; /* Light Gray */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #333; /* Dark Gray */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart-items {\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cart-item {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .item-info {\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .item-actions {\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .total-price {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            text-align: right;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .checkout-button {\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #337ab7; /* Bootstrap Blue */\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .checkout-button:hover {\n");
      out.write("            background-color: #286090; /* Darker Blue */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Shopping Cart</h2>\n");
      out.write("        <ul class=\"cart-items\">\n");
      out.write("            <!-- Iterate over cart items and display -->\n");
      out.write("            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cartItems}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"item\">\n");
      out.write("                <li class=\"cart-item\">\n");
      out.write("                    <div class=\"item-info\">\n");
      out.write("                        <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>\n");
      out.write("                        <br>\n");
      out.write("                        Quantity: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        Price: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item-actions\">\n");
      out.write("                        <form action=\"removeFromCart\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"itemId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <input type=\"submit\" value=\"Remove\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </c:forEach>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"total-price\">\n");
      out.write("            Total: $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <a href=\"checkout\" class=\"checkout-button\">Checkout</a>\n");
      out.write("    </div>\n");
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
