<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>
<h1>MEDIQUICK</h1>
<h1>Edit and Save</h1>
<h1>Medicine warehouse</h1>

<% 
    String e1="",ut="";
    session=request.getSession(false);
    
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
    String med_id=request.getParameter("H1");
    if(med_id==null)
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
        String sql="select * from medicinedata where med_id=?";
        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, med_id);
        //Fetch data
        ResultSet r1=p1.executeQuery();

        if(r1.next())
        {
            String a,b,c,d,e,f;
            a=r1.getString("med_id");
            b=r1.getString("med_name");
            c=r1.getString("med_type");
            d=r1.getString("company");
            e=r1.getString("lno");
            f=r1.getString("unit_price");
            
            
%>


<form method="post" action="Editmedicine1.jsp">
    <p>med_id <input value="<%= a %>" type="text" name="t1" id="txt1" /></p>
    <p>med_name <input value="<%= b %>" type="text" name="t2" id="txt2" /></p>
    <p>med_type<input value="<%= c %>" type="text" name="t3" id="txt3" /></p>
    <p>company <input value="<%= d %>" type="text" name="t4" id="txt4" /></p>
    <p>license_number <input value="<%= e %>" type="text" name="t5" id="txt5" /></p>
    <p>unit_price<input readonly value="<%= f %>" type="text" name="t6" id="txt6" /></p>
    
    
    <button type="submit" id="btn">Save </button> 
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
<h3><a href="Showmedicine.jsp">Back</a></h3>
<%@include file="ad2.jsp" %>