<%@include file="ad.jsp" %>

<h1 class="text-center">Admin Registration</h1>
<hr>
<% 
    String e1="",ut="";
    session =request.getSession(false);
    
    if(session == null)
    {
        response.sendRedirect("auth_error.jsp");
        
    }
    else
    {
        try{
            
            e1=session.getAttribute("email").toString();
            ut=session.getAttribute("usertype").toString();
            if(ut.equalsIgnoreCase("admin")==false)
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


<div style="margin-left: 100px;margin-top: 50px">
    <form method="post" action="Adminregistration1.jsp">
        <p>Name:<input type="text" name="t1" id="text1" style="margin-left: 105px"/></p>
    <p>Address:<input type="text" name="t2" id="text2" style="margin-left:  90px"/></p>
    <p>Contact:<input type="text" name="t3" id="text3" style="margin-left: 92px"/></p>
    <p>Email:<input type="email" name="t4" id="text4" style="margin-left: 110px"/></p>
    <p>Password:<input type="password" name="t5" id="text5" style="margin-left: 80px"/></p>
    <p>Re-type Password<input type="password" name="t6" id="text6" style="margin-left: 25px"/></p>
    <p><button type="submit" name="b1" id="btn1">Register</button></p>
</form>
</div>
<%@include file="ad2.jsp" %>