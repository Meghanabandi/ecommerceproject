<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1"/>
<title> Bootstrap Container Example</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
<style type="text/css">
	
	.container
	{
	background-color:pink;
	}
	.container-fluid
	{
	background-color:violet;
	}
</style>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#"><img src="facebook.png" width="25" height="25"></a>

 <!-- Toggler/collapsibe Button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="collapsibleNavbar">
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      
      <a class="nav-link" href="#">
	<font color="white"><span class="glyphicon glyphicon-home"></span></font>Home
      </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Register</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">About Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">ContactUs</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">SiteMap</a>
    </li>
  </ul>
  </div>

</nav>

<div class="container">
	<h4>Container Implementation</h4>
</div>

<div class="container-fluid">
	<h4>Container Fluid Implementation</h4>
</div>

</body>
</html>
