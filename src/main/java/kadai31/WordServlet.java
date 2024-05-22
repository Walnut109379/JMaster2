package kadai31;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WordServlet
 */
@WebServlet("/wordservlet")
public class WordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	List<WordBean> words = new ArrayList<>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = null;
		action = request.getParameter("ACTION");

		//単語登録
		if (action.equals("regist")) {
			String eng = request.getParameter("ENG");
			String jpn = request.getParameter("JPN");

			WordBean bean = new WordBean(eng, jpn);

			HttpSession session = request.getSession();
			@SuppressWarnings("unchecked")
			List<WordBean> words = (List<WordBean>) session.getAttribute("BEAN");
			if (words == null) {
				words = new ArrayList<>();
			}

			words.add(bean);

			session.setAttribute("BEAN", words);

			RequestDispatcher rd = request.getRequestDispatcher("/kadai31/listword.jsp");
			rd.forward(request, response);

			//単語検索	
		} else if (action.equals("search")) {

			String key = request.getParameter("KEY");

		}

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
