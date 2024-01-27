<%@page import="java.sql.*" %>


<script type="text/javascript">
function find_med(str)
{
	var xmlhttp;
	if (str.length==0)
  	{ 
  		document.getElementById("s1").innerHTML="";
  		return;
  	}
	if (window.XMLHttpRequest)
  	{// code for IE7+, Firefox, Chrome, Opera, Safari
  		xmlhttp=new XMLHttpRequest();
  	}
	else
  	{// code for IE6, IE5
  		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  	}
	
	xmlhttp.onreadystatechange=function()
  	{
  		if (xmlhttp.readyState==4 && xmlhttp.status==200)
    		{
    				document.getElementById("s1").innerHTML=xmlhttp.responseText;
    		}
  	}
	xmlhttp.open("GET","show.jsp?q="+str,true);
	xmlhttp.send();
}
</script>

<center><h1>Medico street</h1>

    <form method="post" action="" style="font-size: large;" >
    <p>
        Medicine name:<input type="text" placeholder="search" name="s1" onKeyup="find_med(this.value)"/>
        
    </p>
</form>
</center>
<span id="s1"></span>
