package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		
		String page = null;
		if (id.equals("") || password.equals("")){
			page = "/view/error.jsp";
		}
		else{
			
			CustomerService customerservice = (CustomerService) CustomerService.getInstance(); 
			Customer customer = new Customer(id, password, name, gender, email);
			customerservice.addCustomer(customer);
			
			request.setAttribute("customer", customer);
			
			page = "/view/registerSuccess.jsp";
		}
		

		RequestDispatcher rdp = request.getRequestDispatcher(page);
		rdp.forward(request, response);
		
		
	}

}