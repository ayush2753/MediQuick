package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"static/scripts/jquery.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function(e){\n");
      out.write("\t\t\n");
      out.write("\t\tvar b=2;\n");
      out.write("\t\tvar c=2;\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#p1\").click(function(e){\n");
      out.write("\t\t\t$(\"#item\").slideToggle(2500)\n");
      out.write("\t\t\t});\n");
      out.write("\t\t$(\"#p2\").click(function(){\n");
      out.write("\t\t\tif(b==2)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$(\"#item2\").slideDown(); b=1;\n");
      out.write("\t\t\t\t$(\"#item3\").slideUp();c=2;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse if(b==1)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$(\"#item2\").slideUp(); b=2;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\t\n");
      out.write("\t\t$(\"#p3\").click(function(){\n");
      out.write("\t\t\tif(c==2)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$(\"#item3\").slideDown(); c=1;\n");
      out.write("\t\t\t\t$(\"#item2\").slideUp();b=2;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse if(c==1)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$(\"#item3\").slideUp(); c=2;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\t\n");
      out.write("\t\t\t\n");
      out.write("    });\t\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<link href=\"static/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("\t<title>WELCOME</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n");
      out.write("        <button class=\"navbar navbar-toggler\" id=\"p1\" >\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    \t</button>\n");
      out.write("       <div class=\"collapse navbar-collapse\"  id=\"item\">\n");
      out.write("    \t<ul class=\"navbar-nav text-center\">\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"style=\"color:#FFF\">HOME</a></li>\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"style=\"color:#FFF\">MEDICALS</a></li>\n");
      out.write("        <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"style=\"color:#FFF\">SIGNIN</a></li>\n");
      out.write("        </ul>\n");
      out.write("       </div>\n");
      out.write("\t</nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"row\" style=\"min-height:400px;\">\n");
      out.write("    \t<div class=\"col-9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>MEDIQUICK</h1>\n");
      out.write("<form method=\"post\" action=\"checklogin.jsp\">\n");
      out.write("    <p>Email:<input type=\"email\" name=\"t1\" id=\"text1\"/></p>\n");
      out.write("    <p>password:<input type=\"password\" name=\"t2\" id=\"text2\"/></p>\n");
      out.write("    \n");
      out.write("    <p><button type=\"submit\" name=\"b1\" id=\"btn1\">Login</button></p>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\"></div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div style=\"min-height:200px;\" class=\"container-fluid bg-dark\">\n");
      out.write("    \n");
      out.write("    </div>\n");
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
