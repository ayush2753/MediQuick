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
<h1 style="text-align: center;margin-top: 25px">Medical Home</h1>
<hr>
<div style="margin-left: 175px;margin-top: 80px">
    <div style="margin-left: 50px">
    <div class="row">
    <div class="col-3">
        <div class="card" style="width: 20rem;border: 5px solid #dee2e6">
          <div class="card-body">
            <h5 class="card-title">Add Medicine</h5>
           
            <p class="card-text">Whether you are seeking insights on specific medications, exploring treatment options, or simply looking to enhance your overall well-being, we've got you covered.</p>
            <a href="Addmedicine.jsp" class="card-link">Add now</a>
            
          </div>
        </div>
    </div>
    <div class="col-3">
        <div class="card" style="width: 22rem;margin-left: 20px;border: 5px solid #dee2e6">
          <div class="card-body">
            <h5 class="card-title">Show Medicine</h5>
           
            <p class="card-text">At Mediquick, we understand that students play a pivotal role in shaping the future. Our Student Hub is designed to be your go-to resource for all things related to student life, education, and personal development.</p>
            <a href="Showmedicine.jsp" class="card-link">See Here</a>
            
          </div>
        </div>
    </div>
    <div class="col-3">
        <div class="card" style="width: 22rem;padding-bottom: 25px;margin-left: 75px;border: 5px solid #dee2e6">
          <div class="card-body">
            <h5 class="card-title">Logout</h5>
           
            <p class="card-text">When a user logs out, they are effectively ending their access to the platform and ensuring that their account or information is not accessible to unauthorized individuals.</p>
            <a href="../logout.jsp" class="card-link">Click here</a>
            
          </div>
        </div>
    </div>
    
</div>
</div>
</div>

<%@include file="ad2.jsp" %>