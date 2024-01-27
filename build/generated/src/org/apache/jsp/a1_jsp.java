package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link href=\"static/bootstrap-5.3.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"static/bootstrap-5.3.2-dist/js/bootstrap.bundle.js\"></script>\n");
      out.write("<style>\n");
      out.write("\tbody{\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t}\n");
      out.write("\t.cimg{\n");
      out.write("\t\theight: 80vh;\n");
      out.write("\t\tmargin: 15px;\n");
      out.write("\t}\n");
      out.write("\t.about{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tfont-size: 42px;\n");
      out.write("\t\tfont-family: 'Bitter', serif;\n");
      out.write("\t\tfont-weight: 500;\n");
      out.write("\t\tmargin-top: 50px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Bitter:wght@500&family=Caveat&family=Josefin+Sans:ital,wght@0,200;1,200&family=Libre+Baskerville&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"./bootstrap-5.3.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<title>WELCOME</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg bg-info\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\" style=\"font-size: 22px;\">MEDICO STREET</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\" style=\"padding-left: 50vh;\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" aria-current=\"page\" href=\"#\" style=\"color: black;font-size: 18px;\">HOME</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\" style=\"color: black;font-size: 18px;\">MEDICALS</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\" aria-disabled=\"true\" style=\"color: black;font-size: 18px;\">SIGNIN</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("                           \n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"\" style=\"font-size: large;\" >\n");
      out.write("    <p>\n");
      out.write("        Medicine name:<input type=\"text\" placeholder=\"search\" name=\"s1\" onchange=\"find_med(this.value)\"/>\n");
      out.write("        \n");
      out.write("    </p>\n");
      out.write("</form>\n");
      out.write("                            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <span id=\"s1\"></span>\n");
      out.write("    \n");
      out.write("    ");
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
