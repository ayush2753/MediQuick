<%@include file="ad.jsp" %>
<section class="vh-100">
    <div class="container-fluid h-custom">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-md-9 col-lg-6 col-xl-5">
            <img src="static/images/people-digital-health_24908-57029-removebg-preview.png" class="img-fluid" alt="Sample image">
        </div>
          <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1" style="margin-top: -110px">
            <form method="post" action="checklogin.jsp">
            <p style="font-size: 42px;">Login Form</p>
            
            <div class="form-outline mb-4">
              <label class="form-label" for="form3Example3">Email address</label>
              <input type="email" id="form3Example3" class="form-control form-control-lg"
                     placeholder="Enter a valid email address" name="t1" />
              
            </div>
  
            
            <div class="form-outline mb-3">
              <label class="form-label" for="form3Example4">Password</label>
              <input type="password" id="form3Example4" class="form-control form-control-lg"
                     placeholder="Enter password" name="t2"/>
              
            </div>
  
            
  
            <div class="text-center text-lg-start mt-4 pt-2">
              <button type="submit" class="btn btn-primary btn-lg"
                      style="padding-left: 2.5rem; padding-right: 2.5rem;" name="b1">Login</button>
              
            </div>
  
          </form>
        </div>
      </div>
    </div>
    
  </section>

<%@include file="ad2.jsp" %>