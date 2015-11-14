package serrvlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Usuario;


@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try{
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		int idade = Integer.parseInt(request.getParameter("idade"));
		UsuarioDao uDao = new UsuarioDao();
		Usuario u = new Usuario(nome, email, idade);
		uDAO.registra(u);
		
		response.sendRedirect("sucesso.html");
		
		}catch (Exception ex){
				response.sendRedirect("cadastrofalhou.html");
		 	}
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
