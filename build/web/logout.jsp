<% 
    session=request.getSession(false);
    if(session == null)
    {
        response.sendRedirect("Login.jsp");
        
    }
    else
    {
        try{
            session.removeAttribute("email");
            session.removeAttribute("usertype");
            session.invalidate();
            response.sendRedirect("Login.jsp");
            
            }
        catch(NullPointerException e)
        {
            response.sendRedirect("Login.jsp");
        }
    }
%>