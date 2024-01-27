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

<h1 class="text-center">Medical Registration</h1>
<hr>
<div style="margin-top: 50px;margin-left: 100px">
    <form method="post" action="Medicalregistration1.jsp">
        <p>Name:<input type="text" name="t1" id="text1" style="margin-left: 100px"/></p>
    <p>Owner_name:<input type="text" name="t2" id="text2" style="margin-left: 47px"/></p>
    <p>License_no:<input type="text" name="t3" id="text3" style="margin-left: 65px"/></p>
    <p>Address:<input type="text" name="t4" id="text4" style="margin-left: 85px"/></p>
    <p>Contact:<input type="text" name="t5" id="text5" style="margin-left: 85px"/></p>
    <p>Email:<input type="email" name="t6" id="text6" style="margin-left: 102px"/></p>
    <p>password:<input type="password" name="t7" id="text7" style="margin-left: 75px"/></p>
    <p>Confirm password:<input type="password" name="t8" id="text8" style="margin-left: 15px"/></p>
    <p><button type="submit" name="b1" id="btn1">Register</button></p>
</form>
</div>
<%@include file="ad2.jsp" %>