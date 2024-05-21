package db.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.model.IBean;
import db.model.UserDeleteBean;
import db.model.UserDeleteExecBean;
import db.model.UserInsertBean;
import db.model.UserInsertExecBean;
import db.model.UserListBean;
import db.model.UserUpdateBean;
import db.model.UserUpdateExecBean;

/**
 * Servlet implementation class ControlServlet
 */
@WebServlet("/control")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControlServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");
		String page = "/db/error.jsp";
		IBean bean = null;

		try {
			if (action.equals("list")) {
				bean = new UserListBean();
			} else if (action.equals("insert")) {
				bean = new UserInsertBean();
			} else if (action.equals("insert_exec")) {
				bean = new UserInsertExecBean();
			} else if (action.equals("update")) {
				bean = new UserUpdateBean();
			} else if (action.equals("update_exec")) {
				bean = new UserUpdateExecBean();
			} else if (action.equals("delete")) {
				bean = new UserDeleteBean();
			} else if (action.equals("delete_exec")) {
				bean = new UserDeleteExecBean();
			}

			if (bean != null) {
				page = bean.execute(request);
			}
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
		}

		RequestDispatcher rd = request.getRequestDispatcher(page);
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
