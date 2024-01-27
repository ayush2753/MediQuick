package org.apache.jsp.medical;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Editmedical_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>Edit and Save</h1>\n");

    String email=request.getParameter("H1");
    if(email==null)
    {
        
      out.write("\n");
      out.write("        <h3><a href=\"Showmedical.jsp\">Select record</a></h3>\n");
      out.write("        ");

    }
    else
    {
        Class.forName("com.mysql.jdbc.Driver");
    
        //Create conection
        String dbpath="jdbc:mysql://localhost:3306/mediquick";
        String dbuser="root";
        String dbpass="";

        Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);

        //Create sql command
        String sql="select * from medicaldata where email=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, email);
        //Fetch data
        ResultSet r1=p1.executeQuery();

        if(r1.next())
        {
            String a,b,c,d,e,f;
            a=r1.getString("name");
            b=r1.getString("owner_name");
            c=r1.getString("license_number");
            d=r1.getString("address");
            e=r1.getString("contact");
            f=r1.getString("email");
            

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"Editmedical1.jsp\">\n");
      out.write("    <p>Name <input value=\"");
      out.print( a );
      out.write("\" type=\"text\" name=\"t1\" id=\"txt1\" /></p>\n");
      out.write("    <p>Owner_name <input value=\"");
      out.print( b );
      out.write("\" type=\"text\" name=\"t2\" id=\"txt2\" /></p>\n");
      out.write("    <p>license_number <input value=\"");
      out.print( c );
      out.write("\" type=\"text\" name=\"t3\" id=\"txt3\" /></p>\n");
      out.write("    <p>address <input value=\"");
      out.print( d );
      out.write("\" type=\"text\" name=\"t4\" id=\"txt4\" /></p>\n");
      out.write("    <p>Contact <input value=\"");
      out.print( e );
      out.write("\" type=\"text\" name=\"t5\" id=\"txt5\" /></p>\n");
      out.write("    <p>Email<input readonly value=\"");
      out.print( f );
      out.write("\" type=\"text\" name=\"t6\" id=\"txt6\" /></p>\n");
      out.write("    \n");
      out.write("    <button type=\"submit\" id=\"btn\">Save </button> \n");
      out.write("</form>\n");

        }//end of if
        else
        {
            
      out.write("\n");
      out.write("            <h3>Error : No data found</h3>\n");
      out.write("            ");

        }
    }//end of if        }

      out.write("\n");
      out.write("<h3><a href=\"Showmedical.jsp\">Back</a></h3>");
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
