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
<h1 class="text-center">Stores</h1>
<hr>
<%
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from medicaldata";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    while(r1.next())
    {
        String a,b,c,d,e,f;
        a=r1.getString("name");
        b=r1.getString("owner_name");
        c=r1.getString("license_number");
        d=r1.getString("address");
        e=r1.getString("contact");
        f=r1.getString("email");
        %>
        <h3><%= f %></h3>
        <p>
            name: <%= a %><br/>
            owner_name : <%= b %><br/>
            license_number:<%= c %><br/>
            address : <%= d %><br/>
            Contact : <%= e %><br/>
       
        </p>
<!--        <table>
            <tr>
                <td>
                    <form method="post" action="Editmedical.jsp">
            <input type="hidden" name="H1" value="<%= f %>" />
            <input type="submit" name="B1" value="Edit" />
        </form>
                </td>
            </tr>
            <tr>
                <td>
                   <form method="post" action="Deletemedical.jsp">
                    <input type="hidden" name="H1" value="<%= f %>" />
                    <input type="submit" name="B1" value="Delete" />
                    </form>
                </td>
            </tr>
        
        
        </table>-->
        <table>
     <tr>
         <td>
             <form method="post" action="Editmedical.jsp">
     <input type="hidden" name="h1" value="<%= e %>"/>
     <button type="submit"><img src="../static/images/edit-box-fill.png"></button>     
 </form>
         </td>
         <td>
             <form method="post" action="Deletemedical.jsp">
         <input type="hidden" name="h1" value="<%= e %>"/>
         <button type="submit"><img src="../static/images/delete-bin-fill.png"></button>        
     </form>
         </td>
         
     </tr>
 </table>
        <%
    }
%>
<%@include file="ad2.jsp" %>