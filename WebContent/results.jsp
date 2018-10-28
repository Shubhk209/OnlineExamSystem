<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
  <head>
	<meta charset="utf-8">
	 <title>Results</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<!-- Le styles -->
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/stylesheet.css" rel="stylesheet">
	<link href="icon/font-awesome.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
	
	<!-- Le fav and touch icons -->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/apple-touch-icon-144-precomposed.html">
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/apple-touch-icon-114-precomposed.html">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/apple-touch-icon-72-precomposed.html">
	<link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-57-precomposed.html">
	<link rel="shortcut icon" href="img/favicon.png">
	<style>
		#content .inner_content .statistic {
    		padding: 3px 15px;
		}
		
		.report-widgets .widget {
    position: relative;
    padding: 12px 45px 16px 12px;
}
.widgets_area {
     padding: 1px;
}
</style>
</head>

  <body>
  <% 
	
	response.setHeader("Cache-control", "no-cache, no-store, must-revalidate"); //for http 1.1
	
	response.setHeader("Pragma", "no-cache");	//for http 1.0 or before
	
	response.setHeader("Expires", "0");	//for proxies
	
	if(session.getAttribute("username")==null){
		
		response.sendRedirect("adminLogin.jsp");
		
	}
	
	%>
	
  <header class="dark_turq"> <!-- Header start -->
       <a href="#" class="logo_image" style="margin-left: 0px;"><span >Admin Panel</a>

  
        <ul class="header_actions">
        	<form action="logout" method="get">
        	<input type="submit" class="btn blue" style="font-size:18px; padding:11px 18px;" value="Logout">
        	</form>
        </ul>
  
      </header>

    <div id="main_navigation" class="dark_navigation"> <!-- Main navigation start -->
       <div class="inner_navigation">
	<ul class="main">
	<li  class="" style="font-size:15px;"><a href="adminQset.jsp" id="nav" name="nav" class="">
		<i class="icon-reorder" style="font-size:15px;">
			</i><span style="font-size:15px;">Question Set</span></a></li>
	
	<li  class="active" style="font-size:15px;">
	<a href="results.html" id="nav" name="nav" class="">
	<i class="icon-reorder" style="font-size:15px;">
	</i><span style="font-size:15px;">Results</span></a></li>
	</ul>

</div>
    </div>  
		
	<div id="content"> <!-- Content start -->
		
		<div class="widgets_area">
			
			<div class="row-fluid">
				<div class="span12">

					<div class="well turq">
                            <div class="well-header">
                                <h5 style="font-size:16px">  </h5>
                            </div>
							
							
                             <div class="well-content">
					<form method="post">		
					<table class="table table-striped table-bordered table-hover datatable">
                        <thead>
						
                            <tr>
                                
								<td>Name</td>
								
								<td>Email</td>
								<td>Collage Name</td>
								
								<td>Marks Obtained</td>
								<td>Total Marks</td>
								</tr>
                        	</thead>
             <% 
             Connection con=null;
             Statement st=null;
             ResultSet rs=null;
             try{
            	 Class.forName("com.mysql.jdbc.Driver");
            	 	String url = "jdbc:mysql://localhost/onlinetestdb";       
            	    String username = "root";   
            	    String password = "root";
            	    
            	    con= DriverManager.getConnection(url,username,password);
            	    st=con.createStatement();
            	    
            	   	String query="select full_name,email,collage_name,marks_obtained,total_marks from reg_table s inner join login_table m on s.reg_id=m.reg_id inner join result_table t on t.login_id=m.login_id;";
            		rs=st.executeQuery(query);
            	    while(rs.next())
            	    {
            	 %> 
            	 	 <tr>
            	 	 <td><%= rs.getString("full_name") %></td>
    				<td><%=  rs.getString("email") %></td>
    				<td><%=  rs.getString("collage_name") %></td>
    				<td><%=  rs.getInt("marks_obtained") %></td>
    				<td><%=  rs.getString("total_marks") %></td>
    				</tr>
    				<% 
    					}
    				%>
            			</table>
                	<%
                	rs.close();
                	st.close();
                	con.close();
             			}catch(Exception e){
             				e.printStackTrace();
             			}
                	
              		%>
              		</form>
                	
                	
                	
                	</div>
                </div>
			   </div>
			</div><br>
		</div>
	
        
 
	
        

   
   
      <!-- Le javascript
    ================================================== -->
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
		<script src="js/jquery-1.10.2.js"></script>   
		<script src="js/jquery-ui-1.10.3.js"></script>
		<script src="js/bootstrap.js"></script>
		
		<script src="js/library/jquery.collapsible.min.js"></script>
		<script src="js/library/jquery.mCustomScrollbar.min.js"></script>
		
		<script src="js/library/jquery.sparkline.min.js"></script>
		<script src="js/library/chosen.jquery.min.js"></script>
		
		
		
		
		
		<script src="js/library/bootstrap-timepicker.js"></script>
		<script src="js/library/bootstrap-datepicker.js"></script>
		
	
		<script src="js/flatpoint_core.js"></script>
		<script src="js/library/jquery.dataTables.js"></script>
		<script src="js/datatables.js"></script>
		<script src="js/forms_advanced.js"></script>
		
		
		<script src="js/forms.js"></script>


  </body>
</html>
