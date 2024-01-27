package org.apache.jsp.medical;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addmedicine_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
    String e1="",ut="";
    session =request.getSession(false);
    
    if(session == null)
    {
        response.sendRedirect("../auth_error.jsp");
        
    }
    else
    {
        try{
            
            e1=session.getAttribute("email").toString();
            ut=session.getAttribute("usertype").toString();
            if(ut.equalsIgnoreCase("medical")==false)
            {
                response.sendRedirect("../auth_error.jsp");
            }
            
            
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../auth_error.jsp");
        }
    }

      out.write("\n");
      out.write("<section class=\"vh-100\">\n");
      out.write("    <div class=\"container-fluid h-custom\">\n");
      out.write("      <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("        <div class=\"col-md-9 col-lg-6 col-xl-5\">\n");
      out.write("          <img src=\"https://img.freepik.com/free-vector/login-concept-illustration_114360-739.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=ais\"\n");
      out.write("            class=\"img-fluid\" alt=\"Sample image\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-8 col-lg-6 col-xl-4 offset-xl-1\">\n");
      out.write("          <form>\n");
      out.write("            <p style=\"font-size: 42px;\">MEDICO STREET</p>\n");
      out.write("            <p style=\"font-size: 32px;\">SIGN IN</p>\n");
      out.write("            <div class=\"form-outline mb-4\">\n");
      out.write("              <input type=\"email\" id=\"form3Example3\" class=\"form-control form-control-lg\"\n");
      out.write("                placeholder=\"Enter a valid email address\" />\n");
      out.write("              <label class=\"form-label\" for=\"form3Example3\">Email address</label>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("            \n");
      out.write("            <div class=\"form-outline mb-3\">\n");
      out.write("              <input type=\"password\" id=\"form3Example4\" class=\"form-control form-control-lg\"\n");
      out.write("                placeholder=\"Enter password\" />\n");
      out.write("              <label class=\"form-label\" for=\"form3Example4\">Password</label>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("            <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("             \n");
      out.write("              <div class=\"form-check mb-0\">\n");
      out.write("                <input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"form2Example3\" />\n");
      out.write("                <label class=\"form-check-label\" for=\"form2Example3\">\n");
      out.write("                  Remember me\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("              <a href=\"#!\" class=\"text-body\">Forgot password?</a>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("            <div class=\"text-center text-lg-start mt-4 pt-2\">\n");
      out.write("              <button type=\"button\" class=\"btn btn-primary btn-lg\"\n");
      out.write("                style=\"padding-left: 2.5rem; padding-right: 2.5rem;\">Login</button>\n");
      out.write("              <p class=\"small fw-bold mt-2 pt-1 mb-0\">Don't have an account? <a href=\"#!\"\n");
      out.write("                  class=\"link-danger\">Register</a></p>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </section>");
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
