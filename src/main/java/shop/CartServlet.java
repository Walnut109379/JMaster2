package shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SamplServlet01
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String fruit = request.getParameter("fruit");

		//セッションオブジェクトを取得
		HttpSession session = request.getSession(true);

		List<String> cart = (List<String>) session.getAttribute("CART");

		//セッションオブジェクトにデータを取得
		Integer count = (Integer) session.getAttribute("CART");

		if (cart == null) {
			cart = new ArrayList<>();
		}

		cart.add(fruit);

		//		if (count > 10) {
		//			count = 0;
		//		}

		session.setAttribute("CART", cart);

		//webブラウザへのお知らせ情報の設定
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>買い物かご</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>買い物かご</h1>");
		out.println("<hr>");
		out.println("<a href='/jmaster/shop/shop.html'>戻る</a><br>");
		out.println("カートの中身：<br>");

		for (String f : cart) {
			out.println("・" + f + "<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
