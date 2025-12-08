<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	    <title>Add New Tour Guide</title>
	
		<link rel="stylesheet" type="text/css" href="css/style.css">
		    
	</head>
	
	<body>
	
		<div class="form-card">
		    <h1>Add New Tour Guide</h1>
		    <form action="insert" method="post">
	
		    </form>
		    <a href="getalldetails">Back to Dash board</a>
		</div>

	    <form action="insert" method="post" onsubmit="return validateForm()">
	    
	        <label>Guide Name:</label>
	        <input type="text" name="name" id="name"  /><br><br>
	
	        <label>email:</label>
	        <input type="text" name="email" id="email" /><br><br>
	
	        <label>Phone:</label>
	        <input type="text" name="phone"  id="phone" /><br><br>
			
	        <label>Address:</label>
	        <input type="text" name="address"  id="address" /><br><br>
	        
	        <input type="submit" value="Add Tour Details">
	        
	    </form>
	
		<script src="javascript/jsvalidation"></script>

	</body>
</html>