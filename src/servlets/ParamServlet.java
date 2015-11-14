package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import excecao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Aluno;


@WebServlet(value="/Cadastro")
public class ParamServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		int matricula = 0;
		String nome = null;
		
		try{
			matricula = Integer.parseInt(request.getParameter("matricula"));
		}catch (NumberFormatException e){
			throw new MatriculaInvalidaException();
		}
		
		
		
		
		
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
