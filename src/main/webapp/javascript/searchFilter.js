function filterTable() {

	  var input = document.getElementById("searchInput");
	  var filter = input.value.toUpperCase();
	  var table = document.querySelector("table");
	  var tr = table.getElementsByTagName("tr");
	  var noResultsMessage = document.getElementById("noResultsMessage");

	  var visibleRows = 0;

	  for (var i = 1; i < tr.length; i++) { // Skip header row
	    var td = tr[i].getElementsByTagName("td");
	    var rowMatches = false;

	  	for (var j = 0; j < td.length; j++) {
	      if (td[j]) {
	        var txtValue = td[j].textContent || td[j].innerText;
	        if (txtValue.toUpperCase().indexOf(filter) > -1) {
	          rowMatches = true;
	          break;
	        }
	      }
	    }

	    if (rowMatches) {
	      tr[i].style.display = "";
	      visibleRows++;
	    } else {
	      tr[i].style.display = "none";
	    }
	  }

	  // Show/hide entire table and message
	  if (visibleRows === 0) {
	    table.style.display = "none";
	    noResultsMessage.style.display = "block";
	  } else {
	    table.style.display = "table";
	    noResultsMessage.style.display = "none";
	  }
	}

	window.onload = function () {
	  document.getElementById("searchInput").addEventListener("input", filterTable);
	};

	
	
	function confirmDelete() {
	return confirm("Are you sure you want to delete this product?");
}