package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class RegistroControllerServlet
 */
@WebServlet("/RegistroControllerServlet")
public class RegistroControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroControllerServlet() {
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
		
		String nomUsuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String fechaN = request.getParameter("fechaN");
		String pais = request.getParameter("pais");
		String contraseña = request.getParameter("pass");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fNac=null;
		try {
			fNac = sdf.parse(fechaN);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!nomUsuario.isEmpty()&&!email.isEmpty()&&!contraseña.isEmpty()) {
			UsuarioDao uDao = new UsuarioDao();
			
			Usuario res1 = uDao.buscarPorParametro("usuario",nomUsuario);
			Usuario res2 = uDao.buscarPorParametro("email",email);
			if (res1 == null && res2 == null) {
				
				Usuario usuario = new Usuario();
				
				usuario.setUsuario(nomUsuario);
				usuario.setEmail(email);
				usuario.setNombre(nombre);
				usuario.setApellido(apellido);
				usuario.setFechanacimiento(fNac);
				usuario.setPais(pais);
				usuario.setPass(contraseña);
				
				uDao.insertar(usuario);
				
				request.getSession().setAttribute("usuario", usuario);
				request.setAttribute("mensaje", "Registrado correctamente :)");
				RequestDispatcher rd = request.getRequestDispatcher("inicio.jsp");
				rd.forward(request, response);

			} else {
				request.setAttribute("mensaje", "Usuario o email ya existe");
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		}else {
			request.setAttribute("mensaje", "Llene campos obligatoris");
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		
		//doGet(request, response);
	}

}
