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
          margin: 2% auto 2% auto; /* 5% from the top, 15% from the bottom and centered */
          border: 1px solid #888;
          width: 90%; /* Could be more or less, depending on screen size */
      }
</style>
<script>
  function startTimer(duration, display) {
    var start = Date.now(),
        diff,
        minutes,
        seconds;
    function timer() {
        // get the number of seconds that have elapsed since 
        // startTimer() was called
        diff = duration - (((Date.now() - start) / 1000) | 0);

        // does the same job as parseInt truncates the float
        minutes = (diff / 60) | 0;
        seconds = (diff % 60) | 0;

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds; 

        if (diff <= 0) {
            // add one second so that the count down starts at the full duration
			// example 10:00 not 09:59
            start = Date.now() + 1000;
        }
    };
    // we don't want to wait a full second before the timer starts
    timer();
    setInterval(timer, 1000);
}

window.onload = function () {
    var fiveMinutes = 60 * 15, //set time for the timer
        display = document.querySelector('#time');
    startTimer(fiveMinutes, display);
   
};







</script>

    <title>Test</title>
  </head>
  <body style="background-color: #3283D3">
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
     
     
      <div ><span style="font-size: 20px;">Username: ${username}</span><p class="float-right"><span id="time" ></span> minutes!</div></p><hr>
      <div>

        <form action="testSubmit" method="post">
          <div class="form-group">
            <label><strong>Q1. Which one of the following is not a prime number?</strong></label><br>
            <input type="radio" name="q1" value="A" >A. 31 &nbsp
            <input type="radio" name="q1" value="B">B. 61 &nbsp
            <input type="radio" name="q1" value="C">C. 71 &nbsp
            <input type="radio" name="q1" value="D">D. 91 &nbsp
          	<input type="hidden" name="q1_c" value="D" >
          	<input type=reset>
          </div><br>
           
           <div class="form-group">
            <label><strong>Q2. Which of the following is a prime number ? 
            </strong></label><br>
            <input type="radio" name="q2" value="A">A. 27 &nbsp
            <input type="radio" name="q2" value="B">B. 57 &nbsp
            <input type="radio" name="q2" value="C">C. 77 &nbsp
            <input type="radio" name="q2" value="D">D. 89 &nbsp
          	<input type="hidden" name="q2_c" value="D" >
          	<input type=reset>
          </div><br>
           
           <div class="form-group">
            <label><strong>Q3. Find the correctly spelled words?</strong></label><br>
            <input type="radio" name="q3" value="A">A. Foreign &nbsp
            <input type="radio" name="q3" value="B">B. Foreine &nbsp
            <input type="radio" name="q3" value="C">C. Fariegn &nbsp
            <input type="radio" name="q3" value="D">D. Forein &nbsp
          	<input type="hidden" name="q3_c" value="A" >
          	<input type=reset>
          </div><br>
           
           <div class="form-group">
           <label><strong>Q4. Find the correctly spelled words?</strong></label><br>
            <input type="radio" name="q4" value="A">A. Afidavit &nbsp
            <input type="radio" name="q4" value="B">B. Affidavit &nbsp
            <input type="radio" name="q4" value="C">C. Affidevit &nbsp
            <input type="radio" name="q4" value="D">D. Affedavit &nbsp
         	<input type="hidden" name="q4_c" value="B" >
          	<input type=reset>
          </div><br>
          
          <div class="form-group">
            <label><strong>Q5.Look at this series: 36, 34, 30, 28, 24, ... What number should come next?</strong></label><br>
            <input type="radio" name="q5" value="A">A. 20 &nbsp
            <input type="radio" name="q5" value="B">B. 22 &nbsp
            <input type="radio" name="q5" value="C">C. 23 &nbsp
            <input type="radio" name="q5" value="D">D. 26 &nbsp
         	<input type="hidden" name="q5_c" value="B" >
          	<input type=reset>
          </div><br>
          
           <div class="form-group">
            <label><strong>Q6. Look at this series: 22, 21, 23, 22, 24, 23, ... What number should come next?</strong></label><br>
            <input type="radio" name="q6" value="A">A. 22 &nbsp
            <input type="radio" name="q6" value="B">B. 24 &nbsp
            <input type="radio" name="q6" value="C">C. 25 &nbsp
            <input type="radio" name="q6" value="D">D. 26 &nbsp
         	<input type="hidden" name="q6_c" value="C" >
          	<input type=reset>
          </div><br>
          
           <div class="form-group">
            <label><strong>Q7. How long is an IPv6 address?</strong></label><br>
            <input type="radio" name="q7" value="A">A. 32 bits &nbsp
            <input type="radio" name="q7" value="B"> Option B. 128 bytes &nbsp
            <input type="radio" name="q7" value="C"> Option C. 64 bits &nbsp
            <input type="radio" name="q7" value="D"> Option D.128 bits  &nbsp
          	<input type="hidden" name="q7_c" value="D" >
          	<input type=reset>
          </div><br>
          
           <div class="form-group">
            <label><strong>Q8. Which WLAN IEEE specification allows up to 54Mbps at 2.4GHz? </strong></label><br>
            <input type="radio" name="q8" value="A">A. a &nbsp
            <input type="radio" name="q8" value="B">B. b &nbsp
            <input type="radio" name="q8" value="C">C. g &nbsp
            <input type="radio" name="q8" value="D">D. n &nbsp
          	<input type="hidden" name="q8_c" value="C" >
          	<input type=reset>
          </div><br>
          
           <div class="form-group">
            <label><strong>Q9. Which is a valid keyword in java?</strong></label><br>
            <input type="radio" name="q9" value="A">A. interface &nbsp
            <input type="radio" name="q9" value="B">B. string &nbsp
            <input type="radio" name="q9" value="C">C. Float &nbsp
            <input type="radio" name="q9" value="D">D. unsigned &nbsp
          	<input type="hidden" name="q9_c" value="A" >
          	<input type=reset>
          </div><br>
          
           <div class="form-group">
            <label><strong>Q10. Which is a reserved word in the Java programming language?</strong></label><br>
            <input type="radio" name="q10" value="A"> A. method &nbsp
            <input type="radio" name="q10" value="B"> B. native &nbsp
            <input type="radio" name="q10" value="C"> C. subclasses &nbsp
			<input type="radio" name="q10" value="D"> D. reference &nbsp
          	<input type="hidden" name="q10_c" value="B" >
          	<input type=reset>
          	</div><br>
          		
          <input type="submit" name="Submit" class="btn btn-info" value="Submit">

        </form>
        
      </div>
  </div>
   
  </body>

  
</html>