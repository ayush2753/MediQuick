<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>
<h1>MEDIQUICK</h1>
<h1>delete</h1>
<h1>Medical Home</h1>
<p><a href="logout.jsp">Logout</a></p>
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
    String email=request.getParameter("H1");
    if(email==null)
    {
        %>
        <h3><a href="Showmedical.jsp">Select record</a></h3>
        <%
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
            
%>


<form method="post" action="Deletemedical1.jsp">
    <p>Name <input value="<%= a %>" type="text" name="t1" id="txt1" /></p>
    <p>Owner_name <input value="<%= b %>" type="text" name="t2" id="txt2" /></p>
    <p>license_number <input value="<%= c %>" type="text" name="t3" id="txt3" /></p>
    <p>address <input value="<%= d %>" type="text" name="t4" id="txt4" /></p>
    <p>Contact <input value="<%= e %>" type="text" name="t5" id="txt5" /></p>
    <p>Email<input readonly value="<%= f %>" type="text" name="t6" id="txt6" /></p>
    
    <button type="submit" id="btn">DELETE </button> 
</form>
<%
        }//end of if
        else
        {
            %>
            <h3>Error : No data found</h3>
            <%
        }
    }//end of if        }
%>
<h3><a href="Showmedical.jsp">Back</a></h3>
<%@include file="ad2.jsp" %>