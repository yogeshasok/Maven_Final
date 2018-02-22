

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResetServlet
 */
public class ResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		HttpSession session = request.getSession(true);
		Service se =new Service();
		String res = "";
		if(request.getParameter("newpass").equals(request.getParameter("newrepass"))){
		String res = se.reset(request.getParameter("uname"),request.getParameter("oldpass"),request.getParameter("newpass"));
		if(res.equalsIgnoreCase("SUCCESS")){
			 res = "SUCCESS";
			request.setAttribute("res", res);
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			rd.forward(request, response);
		}
		
	}
		else{
			String res = "Password does not match";
			request.setAttribute("res", res);
			RequestDispatcher rd=request.getRequestDispatcher("/ResetPass.jsp");  
			rd.forward(request, response);
		}
	}

}
