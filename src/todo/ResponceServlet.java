package todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponceServlet
 */
@WebServlet("/hogei")
public class ResponceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int counter = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResponceServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String naiyou = request.getParameter("naiyou");
		String important = request.getParameter("important");
		counter++;
		out.println("<!DOCTYPE>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta cherset=\"UTP-8\"/>");
		out.println("<title>S2A215笹川光基</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>ToDoアプリケーション</h1>");
		out.println("<h2>出力画面</h2>");
		out.println("<br>あなたは、" + counter + "人目の訪問者です");
		out.println("<p>重要度：" + important + "</p>");
		out.println("<p>内容：" + naiyou + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
