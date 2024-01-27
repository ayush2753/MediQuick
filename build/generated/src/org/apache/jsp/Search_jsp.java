package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function find_med(str)\n");
      out.write("{\n");
      out.write("\tvar xmlhttp;\n");
      out.write("\tif (str.length==0)\n");
      out.write("  \t{ \n");
      out.write("  \t\tdocument.getElementById(\"s1\").innerHTML=\"\";\n");
      out.write("  \t\treturn;\n");
      out.write("  \t}\n");
      out.write("\tif (window.XMLHttpRequest)\n");
      out.write("  \t{// code for IE7+, Firefox, Chrome, Opera, Safari\n");
      out.write("  \t\txmlhttp=new XMLHttpRequest();\n");
      out.write("  \t}\n");
      out.write("\telse\n");
      out.write("  \t{// code for IE6, IE5\n");
      out.write("  \t\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("  \t}\n");
      out.write("\t\n");
      out.write("\txmlhttp.onreadystatechange=function()\n");
      out.write("  \t{\n");
      out.write("  \t\tif (xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("    \t\t{\n");
      out.write("    \t\t\t\tdocument.getElementById(\"s1\").innerHTML=xmlhttp.responseText;\n");
      out.write("    \t\t}\n");
      out.write("  \t}\n");
      out.write("\txmlhttp.open(\"GET\",\"show.jsp?q=\"+str,true);\n");
      out.write("\txmlhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<center><h1>Medico street</h1>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"\" style=\"font-size: large;\" >\n");
      out.write("    <p>\n");
      out.write("        Medicine name:<input type=\"text\" placeholder=\"search\" name=\"s1\" onchange=\"find_med(this.value)\"/>\n");
      out.write("        <button type=\"submit\" name=\"b1\" id=\"btn1\" class=\"k1\">Search</button>\n");
      out.write("    </p>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("<span id=\"s1\"></span>\n");
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
