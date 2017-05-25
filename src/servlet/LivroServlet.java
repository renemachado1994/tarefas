package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Livro;

/**
 * Servlet implementation class LivroServlet
 */
@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Livro> biblioteca = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivroServlet() {
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
		
		String opcao = request.getParameter("opcao");
		String destino = "";

		
		switch (opcao) {
		case "Cadastrar":
			

			try {

				
				String titulo = request.getParameter("titulo");
				int paginas = Integer.parseInt(request.getParameter("paginas"));
				String autor = request.getParameter("autor");
				
				Livro livro = new Livro(titulo, autor, paginas);
				Random random = new Random();
				
				livro.setId(random.nextInt(500) + 1);
				biblioteca.add(livro);
				
	
				
				for(int i = 0; i < biblioteca.size(); i++) {
					System.out.println(biblioteca.get(i).getTitulo());
					System.out.println(biblioteca.get(i).getId());
					System.out.println(biblioteca.get(i).getAutor());
					System.out.println(biblioteca.get(i).getNumeroDePaginas());
				}
				request.setAttribute("caminho", biblioteca);
				destino = "exibirLivro.jsp";
				


			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				RequestDispatcher rd = request.getRequestDispatcher(destino);
				rd.forward(request, response);
			}
			break; 
		case "Listar":
			try{
				
				for(int i = 0; i < biblioteca.size(); i++) {
					System.out.println(biblioteca.get(i).getTitulo());
					System.out.println(biblioteca.get(i).getId());
					System.out.println(biblioteca.get(i).getAutor());
					System.out.println(biblioteca.get(i).getNumeroDePaginas());
				}
				
				//request.setAttribute("livro", biblioteca);
				
				//destino = "ListarLivros.jsp";
				
				request.setAttribute("caminho", biblioteca);
				destino = "exibirLivro.jsp";
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				
				request.getRequestDispatcher("ListarLivros.jsp").forward(request, response);
				
				RequestDispatcher rd = request.getRequestDispatcher(destino);
				rd.forward(request, response);
			}
			break; 

		}
		
		
	}

}
