<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Tour Guide Details</title>

	<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
	<body>
		<h1> Guide Table</h1>
		
		<a href="create.jsp" class="add-button">Add New Tour Guide</a>

		<div class="search-container">
		  <input type="text" id="searchInput" placeholder="Search...">
		</div>

		<p id="noResultsMessage" style="display:none;">
		  No results found.
		</p>

		<table>
			<tr>
				<th>Guide ID</th>
				<th>Guide Name</th>
				<th>Guide Email</th>
				<th>Guide Phone</th>
				<th>Guide Address</th>
				<th>Action</th>
			</tr>

	<c:if test="${empty allguide}">
	  <tr>
	    <td colspan="6">No data found.</td>
	  </tr>
	</c:if>

			<c:forEach var="guide" items="${allguide}">
			
				<tr>
					<td>${guide.id}</td>
					<td>${guide.name}</td>
					<td>${guide.email}</td>
					<td>${guide.phone}</td>
					<td>${guide.address}</td>
					
					
					<td>


						<a href="updates.jsp?id=${guide.id}&name=${guide.name}&email=${guide.email}&phone=${guide.phone}&address=${guide.address}">
							<button>Update</button>
						</a>
						<br>

						<form action="delete" method="post" onsubmit="return confirmDelete();">
						  <input type="hidden" name="id" value="${guide.id}"/>
						  <button type="submit">Delete</button>
						</form>
						
					</td>
				</tr>
			
			</c:forEach>
			
		</table>
		
		<script src="javascript/searchFilter.js"></script>
		
	</body>
</html>