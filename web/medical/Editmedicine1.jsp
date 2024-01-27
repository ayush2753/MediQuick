<%@include file="ad.jsp" %>
<%@page import="java.sql.*" %>
<h1>Edit and Save</h1>
<h1>Medicine Warehouse</h1>

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
%>

<%
    //Receive form data
    String med_id,med_name,med_type,company,lno,unit_price;
    med_id=request.getParameter("t1");
    med_name=request.getParameter("t2");
    med_type=request.getParameter("t3");
    company=request.getParameter("t4");
    lno=request.getParameter("t5");
    unit_price=request.getParameter("t6");
  
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="update medicinedata set med_name=?,med_type=?,company=?, lno=?, unit_price=?  where med_id=?";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Replace ? with data
    p1.setString(1, med_name);
    p1.setString(2 ,med_type);
    
    p1.setString(3, company);
    p1.setString(4, lno);
    p1.setString(5, unit_price);
    p1.setString(6, med_id);
   
    
   
    
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
<h3><a href="Showmedicine.jsp">Continue</a></h3>
<%@include file="ad2.jsp" %>