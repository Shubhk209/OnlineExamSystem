<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>
	
	<form action="adminLogin.jsp" class="logAs">
    <button class="button">Login as Admin</button>
</form>
	
	<div class="loginbox">
	<img src="cand2.png" class="avatar">
	<header>
		<h1>Candidate Login</h1>

	</header>
	<form action="login" method="post">
		<label class="lb"><p> User Name</p></label>
		<input type="text" name="uname" placeholder="Enter the Name" style="color: white">
		
		<label class="lb"><p>Password</p></label>
		<input type="password" name="upass" class="lb" placeholder="Enter the Password"></input>
		
		<input type="submit" name="submit" value="Login">
		
		<a href="regUser.jsp">Register Now!</a>
	</form>
	</div>
</body>
</html>