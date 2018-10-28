<!doctype html>
<html>
  <head>
  <title>Test Submitted</title>
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
          background-color: #CDD1D4;
          margin: 10% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
          border: 1px solid #888;
          width: 40%; /* Could be more or less, depending on screen size */
      		}
		</style>
	</head>
  
  <body style="background-color: #3283D3">
  
	<% 
	
	response.setHeader("Cache-control", "no-cache, no-store, must-revalidate"); //for http 1.1
	
	response.setHeader("Pragma", "no-cache");	//for http 1.0 or before
	
	response.setHeader("Expires", "0");	//for proxies
	
	if(session.getAttribute("username")==null){
		
		response.sendRedirect("login.jsp");
		
	}
	
	%>
  <div class="modal-content animate">
   <div class="container">
     
   <img src="img/1.png" alt="" width="300px;" align="middle">&nbsp&nbsp<span style="font-size: 30px;">Best Of Luck</span><br><br>

   <form action="logout" method="get">
   <input type="submit" name="logout" class="btn btn-primary" style="margin-left: 35%" value="Submit">
   </form>

      </div>
      
  </div>
   
  </body>
  </html>