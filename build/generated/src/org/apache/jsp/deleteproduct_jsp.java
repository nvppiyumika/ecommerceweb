package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Delete Product</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Delete Product</h1>\n");
      out.write("    <form action=\"DeleteProductServlet\" method=\"GET\">\n");
      out.write("        Enter Product ID to delete: <input type=\"text\" name=\"pid\" required>\n");
      out.write("        <input type=\"submit\" value=\"Delete\">\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    ");
 if (request.getParameter("deleted") != null) { 
      out.write("\n");
      out.write("        ");
 if (Boolean.parseBoolean(request.getParameter("deleted"))) { 
      out.write("\n");
      out.write("            <p>Product deleted successfully!</p>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <p>Error deleting product. Please try again.</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
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
