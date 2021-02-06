package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Usuario usuario = new Usuario();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoUsuario(request, response);
		} else {
			response.sendRedirect("index.html");
		}

	}

	// Listar contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("lista.jsp");
		
		
	}

	// Novo usuário
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// teste de recebimento dos dados do formulario
		
		
		//setar as variáveis usuario
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setTelefone(request.getParameter("telefone"));
		
		System.out.println(usuario.getNome());
		
		
		
	}
	 


}
