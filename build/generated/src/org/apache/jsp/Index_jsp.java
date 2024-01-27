package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/a1.jsp");
    _jspx_dependants.add("/a2.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                                            <a class=\"nav-link\" href=\"index.jsp\" aria-current=\"page\" href=\"#\" style=\"color: black;font-size: 18px;\">HOME</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"med.jsp\" style=\"color: black;font-size: 18px;\">MEDICALS</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"Login.jsp\" aria-disabled=\"true\" style=\"color: black;font-size: 18px;\">SIGNIN</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("                            \n");
      out.write("                              \n");
      out.write("                            \n");
      out.write("                            <form method=\"post\" action=\"med.jsp\" style=\"font-size: large;\" >\n");
      out.write("        <p>\n");
      out.write("            <a href=\"med.jsp\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-search\" viewBox=\"0 0 16 16\">\n");
      out.write("  <path d=\"M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z\"/>\n");
      out.write("</svg></a>\n");
      out.write("            <input type=\"text\" placeholder=\"Search Medicine\" style=\"border-radius:5px;margin-top: 25px\" name=\"s1\" onchange=\"find_med(this.value)\"/>\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <span id=\"s1\"></span>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div id=\"carouselExampleIndicators\" class=\"carousel slide\">\r\n");
      out.write("\t\t<div class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("\t\t\t<button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t<div class=\"carousel-item active\">\r\n");
      out.write("\t\t\t\t<img src=\"https://browntape.com/wp-content/uploads/2021/02/E-Pharmacy-Blog-Featured-Image1-3-e1612969722859.png\" class=\"d-block w-100 cimg\" alt=\"...\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t<img src=\"https://assets.truemeds.in/Images/dwebbanner1.jpeg\" class=\"d-block w-100 cimg\" alt=\"...\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t<img src=\"https://jungleworks.com/wp-content/uploads/2021/03/shutterstock_1825864397-1024x634.png\" class=\"d-block w-100 cimg\" alt=\"...\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\r\n");
      out.write("\t\t\t<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t<span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\r\n");
      out.write("\t\t\t<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t<span class=\"visually-hidden\">Next</span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"about\">\r\n");
      out.write("\t<p>ABOUT US</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t<p class=\"text\" style=\"font-size: 28px;\">We at medico street ensures about the best medical stores near you.\r\n");
      out.write("\t\t\t\t\tNow buying medicine from travelling for long hours or in a insignificant time has become easy with the help of medico street.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p class=\"text\" style=\"font-size: 28px;\">\r\n");
      out.write("\t\t\t\t\tWe at medico street has the medical stores near you where you can check if your desired medicine is available or not.\r\n");
      out.write("\t\t\t\t\tAt discounted price and at your doorstep.\r\n");
      out.write("\t\t\t\t</p>\t \r\n");
      out.write("\t\t\t\t<p class=\"text\" style=\"font-size: 28px;\">\r\n");
      out.write("\t\t\t\t\tSo, hence the name suggest medical of streets to throughout the city is now available just on one tap.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t<img src=\"https://i.pinimg.com/736x/1a/e0/b4/1ae0b4df902c5d32cbf4e61c73f38c38.jpg\" width=\"500px\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container px-4 py-5\" id=\"hanging-icons\">\r\n");
      out.write("\t<h2 class=\"pb-2 border-bottom\">FEATURES</h2>\r\n");
      out.write("\t<div class=\"row g-4 py-5 row-cols-1 row-cols-lg-3\">\r\n");
      out.write("\t\t<div class=\"col d-flex align-items-start\">\r\n");
      out.write("\t\t\t<div class=\"icon-square text-body-emphasis bg-body-secondary d-inline-flex align-items-center justify-content-center fs-4 flex-shrink-0 me-3\">\r\n");
      out.write("\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-truck\" viewBox=\"0 0 16 16\">\r\n");
      out.write("\t\t\t\t\t<path d=\"M0 3.5A1.5 1.5 0 0 1 1.5 2h9A1.5 1.5 0 0 1 12 3.5V5h1.02a1.5 1.5 0 0 1 1.17.563l1.481 1.85a1.5 1.5 0 0 1 .329.938V10.5a1.5 1.5 0 0 1-1.5 1.5H14a2 2 0 1 1-4 0H5a2 2 0 1 1-3.998-.085A1.5 1.5 0 0 1 0 10.5v-7zm1.294 7.456A1.999 1.999 0 0 1 4.732 11h5.536a2.01 2.01 0 0 1 .732-.732V3.5a.5.5 0 0 0-.5-.5h-9a.5.5 0 0 0-.5.5v7a.5.5 0 0 0 .294.456zM12 10a2 2 0 0 1 1.732 1h.768a.5.5 0 0 0 .5-.5V8.35a.5.5 0 0 0-.11-.312l-1.48-1.85A.5.5 0 0 0 13.02 6H12v4zm-9 1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm9 0a1 1 0 1 0 0 2 1 1 0 0 0 0-2z\"/>\r\n");
      out.write("\t\t\t\t</svg>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3 class=\"fs-2 text-body-emphasis\">Fast-delivery</h3>\r\n");
      out.write("\t\t\t\t<p>Wait for your medicines is for no long durations now. Order and receive the fastest delivery at your doorstep. </p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col d-flex align-items-start\">\r\n");
      out.write("\t\t\t<div class=\"icon-square text-body-emphasis bg-body-secondary d-inline-flex align-items-center justify-content-center fs-4 flex-shrink-0 me-3\">\r\n");
      out.write("\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-wallet2\" viewBox=\"0 0 16 16\">\r\n");
      out.write("\t\t\t\t\t<path d=\"M12.136.326A1.5 1.5 0 0 1 14 1.78V3h.5A1.5 1.5 0 0 1 16 4.5v9a1.5 1.5 0 0 1-1.5 1.5h-13A1.5 1.5 0 0 1 0 13.5v-9a1.5 1.5 0 0 1 1.432-1.499L12.136.326zM5.562 3H13V1.78a.5.5 0 0 0-.621-.484L5.562 3zM1.5 4a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5h-13z\"/>\r\n");
      out.write("\t\t\t\t</svg>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3 class=\"fs-2 text-body-emphasis\">Discount</h3>\r\n");
      out.write("\t\t\t\t<p>Find Medicines at the cheapest rate so far... we ensure you for the discount at your medicine purchase everytime you purchase from us.</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col d-flex align-items-start\">\r\n");
      out.write("\t\t\t<div class=\"icon-square text-body-emphasis bg-body-secondary d-inline-flex align-items-center justify-content-center fs-4 flex-shrink-0 me-3\">\r\n");
      out.write("\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"25\" height=\"25\" fill=\"currentColor\" class=\"bi bi-heart-pulse\" viewBox=\"0 0 16 16\">\r\n");
      out.write("\t\t\t\t\t<path d=\"m8 2.748-.717-.737C5.6.281 2.514.878 1.4 3.053.918 3.995.78 5.323 1.508 7H.43c-2.128-5.697 4.165-8.83 7.394-5.857.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17c3.23-2.974 9.522.159 7.394 5.856h-1.078c.728-1.677.59-3.005.108-3.947C13.486.878 10.4.28 8.717 2.01L8 2.748ZM2.212 10h1.315C4.593 11.183 6.05 12.458 8 13.795c1.949-1.337 3.407-2.612 4.473-3.795h1.315c-1.265 1.566-3.14 3.25-5.788 5-2.648-1.75-4.523-3.434-5.788-5Z\"/>\r\n");
      out.write("\t\t\t\t\t<path d=\"M10.464 3.314a.5.5 0 0 0-.945.049L7.921 8.956 6.464 5.314a.5.5 0 0 0-.88-.091L3.732 8H.5a.5.5 0 0 0 0 1H4a.5.5 0 0 0 .416-.223l1.473-2.209 1.647 4.118a.5.5 0 0 0 .945-.049l1.598-5.593 1.457 3.642A.5.5 0 0 0 12 9h3.5a.5.5 0 0 0 0-1h-3.162l-1.874-4.686Z\"/>\r\n");
      out.write("\t\t\t\t</svg>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h3 class=\"fs-2 text-body-emphasis\">Service</h3>\r\n");
      out.write("\t\t\t\t<p>Experience our hospitality for free.By making purchase of the most of the medicine at the minimal price,quality assured at Medico street....</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\n");
      out.write("  <footer class=\"py-3 my-4\">\n");
      out.write("    <ul class=\"nav justify-content-center border-bottom pb-3 mb-3\">\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">Home</a></li>\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">MEDICALS</a></li>\n");
      out.write("      <li class=\"nav-item\"><a href=\"#\" class=\"nav-link px-2 text-body-secondary\">SIGNIN</a></li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <p class=\"text-center text-body-secondary\">© 2023 MEDICO STREET</p>\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("\t\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
