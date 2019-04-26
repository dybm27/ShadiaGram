package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDao;
import model.Usuario;

/**
 * Servlet implementation class LoginControllerServlet
 */
@WebServlet("/LoginControllerServlet")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userEmail = request.getParameter("user-email");
		String contrase�a = request.getParameter("pass");
		
		UsuarioDao uDao=new UsuarioDao();
		
		Usuario usuario=uDao.buscarPorParametro("usuario", userEmail);
		Usuario email=uDao.buscarPorParametro("email", userEmail);
		
		if(usuario!=null) {
			if(contrase�a.equals(usuario.getPass())) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", usuario);
				request.setAttribute("mensaje", "oks :(");
				RequestDispatcher rd= request.getRequestDispatcher("inicio.jsp");
				rd.forward(request, response);
			}else {
				request.setAttribute("mensaje", "Contrase�a erronea");
				RequestDispatcher rd= request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
			
		}else if(email!=null){
			if(contrase�a.equals(email.getPass())) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", usuario);
				request.setAttribute("mensaje", "oks :(");
				RequestDispatcher rd= request.getRequestDispatcher("inicio.jsp");
				rd.forward(request, response);
			}else {
				request.setAttribute("mensaje", "Contrase�a erronea");
				RequestDispatcher rd= request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		}else {
			request.setAttribute("mensaje", "usuario no existe");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		//doGet(request, response);
	}

}
