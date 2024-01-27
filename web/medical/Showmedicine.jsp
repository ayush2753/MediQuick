<%@include file="ad.jsp" %>
<%@page import="java.sql.*"%>
<h1 style="text-align: center">Warehouse</h1>
<hr>
<div style="margin-left: 25px">
    

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
    //load driver for mysql-connetivity with java
    Class.forName("com.mysql.jdbc.Driver");
    
    //Create conection
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
    
    //Create sql command
    String sql="select * from medicinedata";
    
    //create statement
    PreparedStatement p1=cn.prepareStatement(sql);
   
    
    //Fetch data
    ResultSet r1=p1.executeQuery();
    
    while(r1.next())
    {
        String a,b,c,d,e,f;
        a=r1.getString("med_id");
        b=r1.getString("med_name");
        c=r1.getString("med_type");
        d=r1.getString("company");
        e=r1.getString("lno");
        f=r1.getString("unit_price");
        
      
       
        %>
        <h3><%= a %></h3>
        
        <p>
            med_name: <%= b %><br/>
            med_type : <%= c %><br/>
            company:<%= d %><br/>
            license_no : <%= e %><br/>
            unit_price : <%= f %><br/>
            
            
       
        </p>
        
        <table>
     <tr>
         <td>
             <form method="post" action="Editmedicine.jsp">
     <input type="hidden" name="H1" value="<%= a %>"/>
     <button type="submit"><img src="../static/images/edit-box-fill.png"></button>     
 </form>
         </td>
         <td>
             <form method="post" action="Deletemedicine.jsp">
         <input type="hidden" name="H1" value="<%= a %>"/>
         <button type="submit"><img src="../static/images/delete-bin-fill.png"></button>        
     </form>
         </td>
         
     </tr>
 </table>
                    <hr>
        <%
    }
%>
</div>
<%@include file="ad2.jsp" %>