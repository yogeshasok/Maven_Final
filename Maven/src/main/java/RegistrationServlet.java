

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//import com.fasterxml.jackson.databind.ObjectMapper;



//import com.google.gson.Gson;
//import com.google.gson.JsonIOException;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
//		ObjectMapper mapper = new ObjectMapper();
		String res = "";
		System.out.println(request.getParameter("uname"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("pass"));
		System.out.println(request.getParameter("repass"));
		Bean b = new Bean();
//		JSONObject json = new JSONObject();
		if(request.getParameter("pass").equals(request.getParameter("repass"))){
		b.setUname(request.getParameter("uname"));
		b.setEmail(request.getParameter("email"));
		b.setPass(request.getParameter("pass"));
//		mapper.writeValue(new File("data.json"), b);
//			json.put("uname",request.getParameter("uname") );
//			json.put("email", request.getParameter("email"));
//			json.put("pass",request.getParameter("pass") );
			
//		
		 res = storejson(b);
			
			request.setAttribute("msg", res);
			RequestDispatcher rd=request.getRequestDispatcher("/Registration.jsp");  
			rd.forward(request, response);
			System.out.println(res);
		
		}
		else {
			res = "Password does not match";
			request.setAttribute("msg", res);
			RequestDispatcher rd=request.getRequestDispatcher("/Registration.jsp");  
			rd.forward(request, response);
			System.out.println(res);
		}
		
	}
	
	public String storejson(Bean json) {
		
		Service se = new Service();
		
		return se.store(json);
		
		
		 
	}

}
