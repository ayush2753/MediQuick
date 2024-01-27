<%@include file="ad.jsp" %>
<%@page import="java.sql.*" %>
<h1>Edit Details</h1>
<h1>Medical Home</h1>
<% 
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
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("../auth_error.jsp");
            }
            
            
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../auth_error.jsp");
        }
    }
%>

<%
    //Receive form data
    String name,owner_name,license_number,address,contact,email,password,confirm;
    name=request.getParameter("t1");
    owner_name=request.getParameter("t2");
    license_number=request.getParameter("t3");
    address=request.getParameter("t4");
    contact=request.getParameter("t5");
    email=request.getParameter("t6");
    password=request.getParameter("t7");
    confirm=request.getParameter("t8");
    
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="update medicaldata set name=?,owner_name=?,license_number=?, address=?, contact=? where email=?";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Replace ? with data
    p1.setString(6 ,email);
    p1.setString(1, name);
    p1.setString(2, owner_name);
    p1.setString(3, license_number);
    p1.setString(4, address);
    p1.setString(5, contact);
    
   
    
    //send data to table
    int a=p1.executeUpdate();
    String msg="";
    if(a==1)
    {
        msg="Data is saved successfully";
    }
    else
    {
        msg="Error : cannot save data";
    }
    
%>
<h3><a href="Showmedical.jsp">Continue</a></h3>
<%@include file="ad2.jsp" %>