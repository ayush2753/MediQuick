<%@page import="java.sql.*"%>

<%
    
    Class.forName("com.mysql.jdbc.Driver");
    String dbpath="jdbc:mysql://localhost:3306/mediquick";
    String dbuser="root";
    String dbpass="";
    Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
              
    String med_name=request.getParameter("q");
    
    if(med_name!=null)
    {
        
        String s2="select * from medicine_with_medical where med_name LIKE '%" +med_name+ "%'";
        PreparedStatement p2=cn.prepareStatement(s2);
        
        ResultSet r2=p2.executeQuery();

        while(r2.next())
        {
            String a,b,c,e,f,h,j,k;
            a=r2.getString("med_name");
            j=r2.getString("name");
            k=r2.getString("owner_name");
            e=r2.getString("address");
            f=r2.getString("contact");
            h=r2.getString("med_type");
            b=r2.getString("unit_price");
            c=r2.getString("email_medical");



            %>
    <div class="card justify-content-center" style="width: 18rem;margin-top: 25px;border: 5px solid #1ba2f6;">
        <div class="card-body">
          <h5 class="card-title text-center"><%= a %></h5>
          <hr>
          <p class="card-text">
            <ol>
                <li style="text-align: left"> Name: <%= j %></li>
                <li style="text-align: left"> Unit Price: <%= b %></li>
                <li style="text-align: left"> Medical Email: <%= c %></li>
                <li style="text-align: left"> Owner Name: <%= k %></li>
                <li style="text-align: left"> Address: <%= e %></li>
                <li style="text-align: left"> Contact: <%= f %></li>
                <li style="text-align: left"> Medicine Type: <%= h %></li>
            </ol>
          </p>
          
        </div>
    </div>
<!--  <div class="row">
    <div class="col-12 col-sm-8 col-md-6 col-lg-4">
      <div class="card">
         <img class="card-img" src="https://img.freepik.com/free-photo/top-view-variety-medicine-tablets_23-2148529769.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=sph" alt="medicines">
        <div class="card-img-overlay text-white d-flex flex-column justify-content-center">
          <h4 class="card-title"><%= a%></h4>
            
          
        </div>
      </div>
    </div>
  </div>-->

<!--          <div class="row col-3">
        <div class="card text-dark bg-light mb-3 " style="max-width: 20rem; min-height: 400px; margin-top: 10px; display:flex">
            <div class="card-header " style="text-align: center;"><%= a %></div>
        <div class="card-body">
          
          
        </div>
      </div>      
            </div>-->
            <%
               }//end of while
            
            
        }//end of if
%>
