<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>
<%
String e1="",ut="";
//open existring session
    session=request.getSession(false);
    if(session==null)
    {
        response.sendRedirect("../autherror.jsp");
    }
    else
    {
        try
        {
            e1=session.getAttribute("email").toString();
            ut=session.getAttribute("usertype").toString();
            if(ut.equalsIgnoreCase("admin")==false)
            {
                response.sendRedirect("../autherror.jsp");
            }
        }
        catch(NullPointerException e)
        {
            response.sendRedirect("../autherror.jsp");
        }
    }
%>
<h1 class="text-center" style="margin-top: 15px ">Edit Details</h1>
<hr>
<%
    String email=request.getParameter("H1");
    if(email==null)
        
    {
        %>
        <h3><a href="Adminhome.jsp">Select record</a></h3>
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
        String sql="select * from admindata where email=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, email);
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


<div style="margin-left: 100px;margin-top: 50px">
    <form method="post" action="Editprofile1.jsp">
    <p>Name <input value="<%= a %>" type="text" name="t1" id="txt1" style="margin-left: 25px" /></p>
    <p>Address <input value="<%= b %>" type="text" name="t2" id="txt2" style="margin-left: 10px" /></p>
    <p>Contact<input value="<%= c %>" type="text" name="t3" id="txt3" style="margin-left: 15px" /></p>
    <p>Email<input readonly value="<%= d %>" type="text" name="t4" id="txt4" style="margin-left: 30px"/></p>
    <button type="submit" id="btn">Save </button> 
</form>
</div>
<%
        }//end of if r1.next
        else
        {
            %>
            <h3>Error : No data found</h3>
            <%
        }
    }//end of if in which we sent request to edit       }
%>

<%@include file="ad2.jsp" %>