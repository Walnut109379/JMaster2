package kadai30;

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

/**
 * Servlet implementation class FortuneServlet
 */
@WebServlet("/fortuneservlet")
public class FortuneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FortuneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();

		List<String> c = new ArrayList<>();
		c.add("赤");
		c.add("黄");
		c.add("白");

		List<String> i = new ArrayList<>();
		i.add("タオル");
		i.add("かばん");
		i.add("腕時計");

		String month = request.getParameter("month");

		int r1 = rand1.nextInt(3);
		String color = c.get(r1);

		int r2 = rand2.nextInt(3);
		String item = i.get(r2);

		int r3 = rand3.nextInt(11);
		int rank = r3 + 1;

		FortuneBean bean = new FortuneBean(month, color, item, rank);

		request.setAttribute("bean", bean);

		RequestDispatcher rd = request.getRequestDispatcher("/kadai30/fortune.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
