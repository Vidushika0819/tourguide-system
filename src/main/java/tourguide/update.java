package tourguide;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id= request.getParameter("id");
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address=request.getParameter("address");
		
		boolean isTrue;
		isTrue = guidecontroler.updatedata (id,name,email,phone,address);
		
		if(isTrue==true) {
			
			List<guidemodle> guideDetails = guidecontroler.getById(id);
			request.setAttribute("StoreDetails", guideDetails);
			
			String alertMessage = "Data Update Successful";
			response.getWriter().println("<script>alert('"+alertMessage+"'); window.location.href='getalldetails'</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request,response);
		}
	}

}