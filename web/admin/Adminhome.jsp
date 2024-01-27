<%@page import="java.sql.*" %>
<%@include file="ad.jsp" %>
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


<h1 class="text-center" style="margin-top: 5px">Admin Home</h1>
<hr>
<div style="margin-left:150px " class="d-flex">
    <div class="col-4">
        <div class="card" style="width: 18rem;">
            <img src="https://img.freepik.com/free-vector/man-look-graphic-chart-business-analytics-concept-big-data-processing-icon_39422-761.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=sph" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Medical Registration</h5>
              <p class="card-text">Click on register now for instant registration.</p>
              <a href="Medicalregistration.jsp" class="btn btn-primary">Register now</a>
            </div>
        </div>
    </div>
    <div class="col-4">
        <div class="card" style="width: 18rem;">
            <img src="https://img.freepik.com/free-photo/computer-security-with-login-password-padlock_107791-16191.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=ais" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Change Password</h5>
              <p class="card-text">Change password for protection of your admin profile.</p>
              <a href="Changepassword.jsp" class="btn btn-primary">Change now</a>
            </div>
        </div>
    </div>
    <div class="col-4">
        <div class="card" style="width: 18rem;">
            <img src="https://img.freepik.com/free-vector/businessman-running-escape-exit_74855-6275.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=sph" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Logout</h5>
              <p class="card-text">Head back to login page.</p>
              <a href="../Login.jsp" class="btn btn-primary">Logout Now</a>
            </div>
        </div>
    </div>


</div>

<h1 class="text-center">Admin Profile</h1>
<div style="margin-left: 25px">
    <%
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from admindata where email=?";
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    p1.setString(1,e1);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    
    if(r1.next())
    {
        String a,b,c,d;
        a=r1.getString("name");
        b=r1.getString("address");
        c=r1.getString("contact");
        d=r1.getString("email");
        
        %>
        
        <p>
           Name: <%= a %><br/>
           Address : <%= b %><br/>
           Contact :<%= c %><br/>
           Email: <%= d %><br/>
            
            
        </p>
        
        <form method="post" action="Editprofile.jsp">
            <input type="hidden" name="H1" value="<%= d%>" />
            <button type="submit"><img src="../static/images/edit-box-fill.png"></button> 
        </form>
        
        <%
    }
    
%>
</div>
<%@include file="ad2.jsp" %>

