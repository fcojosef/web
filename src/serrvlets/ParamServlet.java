package serrvlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try{
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><ul>");
		out.println("<li>Param 1:" + request.getParameter("nome"));
		out.println("<li>Param 2:" + request.getParameter("senha"));
		out.println("</ul></body></html>");
		out.close();
		response.sendRedirect("sucesso.html");
		}catch (Exception ex){
				response.sendRedirect("cadastrofalhou.html");
		 	}
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
