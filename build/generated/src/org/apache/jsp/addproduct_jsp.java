package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /* styles.css */\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    background-color: #f4f4f4;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    width: 100%;\n");
      out.write("    max-width: 800px;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    background-color: #fff;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("    margin-top: 5px;\n");
      out.write("    margin-left: 2px;\n");
      out.write("    margin-right: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("select,\n");
      out.write("textarea,\n");
      out.write("input[type=\"number\"],\n");
      out.write("input[type=\"file\"],\n");
      out.write("button {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-md-6 {\n");
      out.write("    width: 50%;\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".text-center {\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger {\n");
      out.write("    background-color: #dc3545;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger:hover {\n");
      out.write("    background-color: #c82333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-success {\n");
      out.write("    background-color: #28a745;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-success:hover {\n");
      out.write("    background-color: #218838;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<div class=\"row\"\n");
      out.write("\t\t\tstyle=\"margin-top: 5px; margin-left: 2px; margin-right: 2px;\">\n");
      out.write("\t\t\t<form action=\"./AddProductSrv\" method=\"post\">\n");
      out.write("\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Product Name</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Product Name\" name=\"name\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"producttype\">Product Type</label> <select name=\"type\"\n");
      out.write("\t\t\t\t\t\t\tid=\"producttype\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"mobile\">MOBILE</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"tv\">TV</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"camera\">CAMERA</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"laptop\">LAPTOP</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"tablet\">TABLET</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"speaker\">SPEAKER</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"other\">Some Other Appliances</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"last_name\">Product Description</label>\n");
      out.write("\t\t\t\t\t<textarea name=\"info\" class=\"form-control\" id=\"last_name\" required></textarea>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Unit Price</label> <input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Unit Price\" name=\"price\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Stock Quantity</label> <input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Stock Quantity\" name=\"quantity\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Product Image</label> <input type=\"file\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Select Image\" name=\"image\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\" style=\"margin-bottom: 2px;\">\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Add Product</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
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
