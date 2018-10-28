<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="login.css">

</head>
<body>
	<form action="login.jsp" class="logAs">
    <button class="button">Login as Candidate</button>
	</form>
	<div class="loginbox">
	<img src="admin5.png" class="avatar">
	<header>
		<h1>Administrator Login</h1>

	</header>
	<form action="adminVerify" method="post">
		<label class="lb"><p> User Name</p></label>
		<input type="text" name="a_uname" placeholder="Enter the Name">
		
		<label class="lb"><p>Password</p></label>
		<input type="password" name="a_upass" class="lb" placeholder="Enter the Password"></input>
		
		<input type="submit" name="submit" value="Login">
		
	</form>
</div>
</body>
</html>