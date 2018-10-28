<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <style>
      body {font-family: Arial, Helvetica, sans-serif;}
      .container {
          padding: 16px;
      }
      .modal-content {
          background-color: #fefefe;
          margin: 15% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
          border: 1px solid #888;
          width: 40%; /* Could be more or less, depending on screen size */
      }
</style>

    <title>Paper Code Verification</title>
  </head>
  <body style="background-color: #3283D3">
	<% 
	
	
	response.setHeader("Cache-Control", "no-code,no-store, must-revalidate");		//for http 1.1
	
	
	response.setHeader("Pragma", "no-cache");		//for http 1.0
	
	
	response.setHeader("Expires", "0");		// for proxies
	
	if (session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
	
	%>
	
	
	
	
	<form class="modal-content animate" action="verify">
    <div class="container">
      <div class="form-group">
        <label><strong>Welcome ${username}, Please Enter Paper Code</strong></label>
        <input type="text" name="paper_code" class="form-control" required="" placeholder="Paper Code">
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </form>
   
  </body>

  
</html>