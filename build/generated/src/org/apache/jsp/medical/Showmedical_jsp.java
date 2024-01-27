package org.apache.jsp.medical;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Showmedical_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>MEDIQUICK</h1>\n");
      out.write("<h1>Register user</h1>\n");

    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from medicaldata";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    while(r1.next())
    {
        String a,b,c,d,e,f;
        a=r1.getString("name");
        b=r1.getString("owner_name");
        c=r1.getString("license_number");
        d=r1.getString("address");
        e=r1.getString("contact");
        f=r1.getString("email");
        
      out.write("\n");
      out.write("        <h3>");
      out.print( f );
      out.write("</h3>\n");
      out.write("        <p>\n");
      out.write("            name: ");
      out.print( a );
      out.write("<br/>\n");
      out.write("            owner_name : ");
      out.print( b );
      out.write("<br/>\n");
      out.write("            license_number:");
      out.print( c );
      out.write("<br/>\n");
      out.write("            address : ");
      out.print( d );
      out.write("<br/>\n");
      out.write("            Contact : ");
      out.print( e );
      out.write("<br/>\n");
      out.write("       \n");
      out.write("        </p>\n");
      out.write("        <form method=\"post\" action=\"Editmedical.jsp\">\n");
      out.write("            <input type=\"hidden\" name=\"H1\" value=\"");
      out.print( f );
      out.write("\" />\n");
      out.write("            <input type=\"submit\" name=\"B1\" value=\"Edit\" />\n");
      out.write("        </form>\n");
      out.write("        <form method=\"post\" action=\"Deletemedical.jsp\">\n");
      out.write("            <input type=\"hidden\" name=\"H1\" value=\"");
      out.print( f );
      out.write("\" />\n");
      out.write("            <input type=\"submit\" name=\"B1\" value=\"Delete\" />\n");
      out.write("        </form>\n");
      out.write("        ");

    }

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
