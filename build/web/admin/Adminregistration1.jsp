<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>

<h1>Admin Registration</h1>
<% 
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
%>

<% 
    //receive form data
    
    String name,address,contact,email,password,confirm;

    name=request.getParameter("t1");
    address=request.getParameter("t2");
    contact=request.getParameter("t3");
    email=request.getParameter("t4");
    password=request.getParameter("t5");
    confirm=request.getParameter("t6");
    
    
    //load class with mysql_connection with java
        Class.forName("com.mysql.jdbc.Driver");
     
    // create connections
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    Connection cn= DriverManager.getConnection(dbpath,dbuser,dbpass);
    
    
    String sql = "insert into admindata values(?,?,?,?)";
    String s1 = "insert into logindata values(?,?,?)";
    
    //create statement 
    PreparedStatement p1=cn.prepareStatement(sql);
    PreparedStatement p2=cn.prepareStatement(s1);
    
    //replace ? with data
    p1.setString(1, name);
    p1.setString(2, address);
    p1.setString(3, contact);
    p1.setString(4, email);
    
    p2.setString(1, email);
    p2.setString(2, password);
    p2.setString(3, "admin");
    
    //send datatables
    int a=p1.executeUpdate();
    String msg="";
    if(a==1)
    {
        msg="data is saved successfully";
    }
    else
    {
        msg="Error: cannot save data";
    }
    int b=p2.executeUpdate();
    String msga="";
    if(b==1)
    {
        msga="data is saved successfully";
    }
    else
    {
        msga="Error: cannot save data";
    }
            
 %>
 
 <h3><%=msg %></h3>
 <h3><a href="Medicalregistration.jsp">MEDICAL REGISTRATION</a></h3>
    <h3><a href="Showmedical.jsp">show data</a></h3>
<%@include file="ad2.jsp" %>
 
 
    
    
    
    
    
    
    
    
    
    
