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
          background-color: #CDD1D4;
          margin: 10% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
          border: 1px solid #888;
          width: 40%; /* Could be more or less, depending on screen size */
      }
</style>

    <title>Hello, world!</title>
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
     
       <h4>Instruction Must be followed</h4> 
       <ol>
        <li>Total Number of question : 10.</li>
        <li>Time alloted : 15.</li>
        <li>Each question carry 1 marks, no negative marks.</li>
        <li>Do Not refresh the page</li>	
      </ol> 
		

      <form action="request-page">
        <input type="checkbox" required="required">&nbsp &nbsp<strong>I agree</strong> <br>
  
        <input type="submit" class="btn btn-info" value="Submit">
      </form>

      </div>
      
  </div>
   
  </body>

  
</html>