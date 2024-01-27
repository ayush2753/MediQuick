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
<section class="vh-150">
    <div class="container-fluid h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-md-9 col-lg-6 col-xl-5">
          <img src="https://img.freepik.com/free-vector/pharmacy-paper-bag-medicine_603843-3825.jpg?size=626&ext=jpg&ga=GA1.2.946628634.1693244006&semt=sph"
            class="img-fluid" alt="Sample image">
        </div>
        <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
            <form method="post" action="Addmedicine1.jsp">
            
            <p style="font-size: 32px;margin-bottom: 20px">MEDICINE REGISTRATION</p>
            <hr>
            <div class="form-outline mb-4">
              <input type="email" id="form3Example3" class="form-control form-control-lg"
                     placeholder="Enter a valid email address" name="t6" />
<!--              <label class="form-label" for="form3Example3">Email address</label>-->
            </div>
  
            
            

            <div class="form-outline mb-4">
              <input type="text" id="form3Example4" class="form-control form-control-lg"
                placeholder="Enter name of medicine" name="t1" />
<!--              <label class="form-label" for="form3Example4">Medicine name</label>-->
            </div>

            <div class="form-outline mb-4">
              <input type="text" id="form3Example4" class="form-control form-control-lg"
                placeholder="Enter type of medicine" name="t2" />
<!--              <label class="form-label" for="form3Example4">medicine type</label>-->
            </div>

            <div class="form-outline mb-4">
              <input type="text" id="form3Example3" class="form-control form-control-lg"
                     placeholder="Enter company name" name="t3" />
<!--              <label class="form-label" for="form3Example3">Email address</label>-->
            </div>
  
            
            

            <div class="form-outline mb-4">
              <input type="text" id="form3Example4" class="form-control form-control-lg"
                placeholder="licence_number" name="t4" />
<!--              <label class="form-label" for="form3Example4">Medicine name</label>-->
            </div>

            <div class="form-outline mb-4">
              <input type="text" id="form3Example4" class="form-control form-control-lg"
                placeholder="Unit Price" name="t5" />
<!--              <label class="form-label" for="form3Example4">medicine type</label>-->
            </div>
  
            
  
            <div class="text-center text-lg-start mt-4 pt-2">
              <button type="submit" class="btn btn-primary btn-lg"
                style="padding-left: 2.5rem; padding-right: 2.5rem;">Register</button>
              
            </div>
  
          </form>
        </div>
      </div>
    </div>
    
  </section>

<%@include file="ad2.jsp" %>