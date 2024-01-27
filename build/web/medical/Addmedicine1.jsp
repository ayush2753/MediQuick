<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>

<h1>Warehouse</h1>
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
    //receive form data
    
    String med_name,med_type,company,lno,unit_price;

    med_name=request.getParameter("t1");
    med_type=request.getParameter("t2");
    company=request.getParameter("t3");
    lno=request.getParameter("t4");
    unit_price=request.getParameter("t5");
    
    
    //load class with mysql_connection with java
        Class.forName("com.mysql.jdbc.Driver");
     
    // create connections
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    Connection cn= DriverManager.getConnection(dbpath,dbuser,dbpass);
    
    
    
    String sql = "insert into medicinedata values(0,?,?,?,?,?,?)";
    
    //create statement 
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //replace ? with data
    p1.setString(1, med_name);
    p1.setString(2, med_type);
    p1.setString(3, company);
    p1.setString(4, lno);
    p1.setDouble(5, Double.parseDouble(unit_price));
    
    p1.setString(6, e1);
    
    
    
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
 %>
 
 <h3><%=msg %></h3>
 <h3><a href="Showmedicine.jsp">SHOW DATA</a></h3>
 <%@include file="ad2.jsp" %>
 
    
    
    
    
    
    
    
    
    
    
