<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>

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

<h1>medical registration</h1>

<% 
    //receive form data
    
    String name,owner_name,license_no,address,contact,email,password,confirm;

    name=request.getParameter("t1");
    owner_name=request.getParameter("t2");
    license_no=request.getParameter("t3");
    address=request.getParameter("t4");
    contact=request.getParameter("t5");
    email=request.getParameter("t6");
    password=request.getParameter("t7");
    confirm=request.getParameter("t8");
    
    
    //load class with mysql_connection with java
        Class.forName("com.mysql.jdbc.Driver");
     
    // create connections
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    Connection cn= DriverManager.getConnection(dbpath,dbuser,dbpass);
    
    
    String sql = "insert into medicaldata values(?,?,?,?,?,?)";
    String s1 = "insert into logindata values(?,?,?)";
    
    //create statement 
    PreparedStatement p1=cn.prepareStatement(sql);
    PreparedStatement p2=cn.prepareStatement(s1);
    
    //replace ? with data
    p1.setString(1, name);
    p1.setString(2, owner_name);
    p1.setString(3, license_no);
    p1.setString(4, address);
    p1.setString(5, contact);
    p1.setString(6, email);
    p2.setString(1, email);
    p2.setString(2, password);
    p2.setString(3, "medical");
    
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
 <h3><a href="Showmedical.jsp">SHOW RECORD</a></h3>
 <%@include file="ad2.jsp" %>
 
 
    
    
    
    
    
    
    
    
    
    
