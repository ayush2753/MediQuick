<html>
<head>
<!--    <link href="static/bootstrap-5.3.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="static/bootstrap-5.3.2-dist/js/bootstrap.bundle.js"></script>-->
<link href="static/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<script src="static/css/bootstrap.min.css"></script>
<style>
	body{
/*		margin: 0;
		padding: 0;*/
                background-image: url(https://img.freepik.com/free-photo/multi-colored-pills-spill-abstract-pattern-addiction-generative-ai_188544-46287.jpg?size=626&ext=jpg&ga=GA1.1.946628634.1693244006&semt=ais);
                background-size: cover;
                background-repeat: no-repeat;
/*                */
/*                https://c4.wallpaperflare.com/wallpaper/228/923/753/3d-pills-white-background-wallpaper-preview.jpg*/
	}
        
/*	.cimg{
		height: 80vh;
		margin: 15px;
	}
	.about{
		text-align: center;
		font-size: 42px;
		font-family: 'Bitter', serif;
		font-weight: 500;
		margin-top: 50px;
	}*/

	

</style>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bitter:wght@500&family=Caveat&family=Josefin+Sans:ital,wght@0,200;1,200&family=Libre+Baskerville&display=swap" rel="stylesheet">
<link href="./bootstrap-5.3.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<title>WELCOME</title>
</head>

<body>
	<nav class="navbar navbar-expand-lg bg-info">
		<div class="container-fluid">
			<a class="navbar-brand" href="#" style="font-size: 22px;">MediQuick</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent" style="padding-left: 65vh;">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
                                            <a class="nav-link" href="index.jsp" aria-current="page" href="#" style="color: black;font-size: 18px;">Home</a>
					</li>
					<li class="nav-item">
                                            <a class="nav-link" href="med.jsp" style="color: black;font-size: 18px;">Medicines</a>
					</li>
					
					<li class="nav-item">
                                            <a class="nav-link" href="Login.jsp" aria-disabled="true" style="color: black;font-size: 18px;">SignIn</a>
					</li>
				</ul>
                            
                              
                            
                            <form method="post" action="med.jsp" style="font-size: large;" >
        <p>
            <img src="static/images/search-line.png">
            <input type="text" placeholder="Search Medicine" style="border-radius:5px;margin-top: 25px" name="s1" onchange="find_med(this.value)" />
            
        </p>
        
</form>
        
			</div>
		</div>
	</nav>
    
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
<span id="s1"></span>

