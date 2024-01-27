<%@include file="ad.jsp" %>
<h1 class="text-center" style="margin-top: 15px">Change Password</h1>
<hr>
<div style="margin-left: 100px;margin-top: 50px">
    <form method="post" action="Changepassword1.jsp">
    <p>New_password:<input type="text" name="t1" id="txt1" style="margin-left: 25px"></p>
    <p>Old_password:<input type="text" name="t2" id="txt2" style="margin-left: 32px"></p>
    <p>Confirm_password:<input type="text" name="t3" id="txt3"></p>
    
    <p><button type="submit">Submit</button></p>
    </form>
</div>
<%@include file="ad2.jsp" %>