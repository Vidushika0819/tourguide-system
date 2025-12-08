<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update Guide Details</title>
		
		<link rel="stylesheet" type="text/css" href="css/style.css">
		
	</head>

	<body>
	
		<div class="update-card">
		    <h1>Update Guide Details</h1>
		    <a href="getalldetails">Back to Dash board</a>
		</div>
	
		<%
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String email= request.getParameter("email");
			String phone= request.getParameter("phone");
			String address=request.getParameter("address");
		%>


	    <form action="update" method="post" onsubmit="return validateForm()">
	    
	    	<label>Guide ID:</label>
	        <input type="text" name="id" value="<%=id%>" readonly><br><br>
	        
	        <label>Guide Name:</label>
	        <input type="text" name="name" value="<%=name%>" id="name" /><br><br>
	
	        <label>Email:</label>
	        <input type="text" name="email" value="<%=email%>" id="email" /><br><br>
	
	        <label>Phone :</label>
	        <input type="text" name="phone" value="<%=phone%>" id="phone" /><br><br>
			
		    <label>Address:</label>
	        <input type="text" name="address" value="<%=address%>" id="address" /><br><br>
			
			<input type="submit" value="Update Tour Details">
	    </form>
		 
	</body>
</html>