

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		String name = request.getParameter("uname");
		System.out.println(request.getParameter("uname"));
		System.out.println(request.getParameter("pass"));
		Service se = new Service();
		String res = se.validate(request.getParameter("uname"),request.getParameter("pass"));
		System.out.println(res);
		
		if(res.equalsIgnoreCase("SUCCESS")){
			HttpSession session = request.getSession(true);
			session.setAttribute("uname", name);
			request.setAttribute("user", name);
			RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");  
			rd.forward(request, response);
		}
		else {
			String result = "Invalid Username or Password";
			request.setAttribute("result",result );
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			rd.forward(request, response);
		}
		
	}

}
