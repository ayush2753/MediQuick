<%@ page import="java.sql.*" %>
<%
    String email,password,btn1;
    email=request.getParameter("t1");
    password=request.getParameter("t2");
    btn1=request.getParameter("b1");
    
    if(btn1==null)
   {
       response.sendRedirect("loginerror.jsp");
       
   }
   else
   {
       Class.forName("com.mysql.jdbc.Driver");
       String dbpath="jdbc:mysql://localhost:3306/mediquick";
       String dbuser="root";
       String dbpass="";
       
       
       Connection cn=DriverManager.getConnection(dbpath,dbuser,dbpass);
       String s1="select * from logindata where email=? and password=?";
       PreparedStatement p1=cn.prepareStatement(s1);
       p1.setString(1, email);
       p1.setString(2, password);
       ResultSet r1=p1.executeQuery();
       if(r1.next())
       {
           String ut=r1.getString("usertype");
           session = request.getSession(true); 
            // create session:if does not exist otherwise use existing
           
           session.setAttribute("email", email);
           session.setAttribute("usertype", ut);
           
           
           
           if(ut.equalsIgnoreCase("admin"))
           {
               response.sendRedirect("admin/Adminhome.jsp");
           }
           else if(ut.equalsIgnoreCase("medical"))
           {
               response.sendRedirect("medical/Medicalhome.jsp");
           }
               
       }
       else
       {
           response.sendRedirect("loginerror.jsp");
       }
          
   }
%>
<a href="Adminhome.jsp">Admin home</a>
