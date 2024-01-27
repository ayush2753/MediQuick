package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<h1>MEDIQUICK</h1>\n");
      out.write("<h1>Admin Registration</h1>\n");
 
    String e1="",ut="";
    session =request.getSession(false);
    
    if(session == null)
    {
        response.sendRedirect("auth_error.jsp");
        
    }
    else
    {
        try{
            
            e1=session.getAttribute("email").toString();
            ut=session.getAttribute("usertype").toString();
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("auth_error.jsp");
            }
            
            
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("auth_error.jsp");
        }
    }

      out.write("\n");
      out.write("<h1>Admin Home</h1>\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"Adminregistration1.jsp\">\n");
      out.write("    <p>Name:<input type=\"text\" name=\"t1\" id=\"text1\"/></p>\n");
      out.write("    <p>Address:<input type=\"text\" name=\"t2\" id=\"text2\"/></p>\n");
      out.write("    <p>Contact:<input type=\"text\" name=\"t3\" id=\"text3\"/></p>\n");
      out.write("    <p>Email:<input type=\"email\" name=\"t4\" id=\"text4\"/></p>\n");
      out.write("    <p>Password:<input type=\"password\" name=\"t5\" id=\"text5\"/></p>\n");
      out.write("    <p>Re-type Password<input type=\"password\" name=\"t6\" id=\"text6\"/></p>\n");
      out.write("    <p><button type=\"submit\" name=\"b1\" id=\"btn1\">Register</button></p>\n");
      out.write("</form>");
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
