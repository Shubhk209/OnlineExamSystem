<!DOCTYPE html>
<html>
<head>
	<title>Register Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="register.css">

</head>
<body>
	
	<div class="regBox">
	<img src="cand2.png" class="avatar">
	<header>
		<h1>Register</h1>

	</header>
	<form action="regUrl" method="post">
		<label class="lb"><p> Username</p></label>
		<input type="text" name="r_uname" placeholder="Enter the Name" required="required" >
		
		<label class="lb"><p>Password</p></label>
		<input type="password" name="r_upass" class="lb" placeholder="Enter the Password" required="required"></input>

		<label class="lb"><p> Fullname</p></label>
		<input type="text" name="r_fname" placeholder="Enter the Name" required="required">

		<label class="lb"><p>Email</p></label>
		<input type="email" name="r_email" class="lb" placeholder="Enter the Email" required="required">
		
		<label class="lb"><p>Collage Name</p></label>
		<input type="text" name="r_Cname" class="lb" placeholder="Enter the Email" required="required">
		

		<input type="submit" name="submit" value="Login">
		
		<a href="login.jsp">Back to Login Page</a>
	</form>
</div>
</body>
</html>