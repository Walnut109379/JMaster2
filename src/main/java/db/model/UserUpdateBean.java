package db.model;

import javax.servlet.http.HttpServletRequest;

import db.bean.User;
import db.dao.DAOException;
import db.dao.UserDAO;

public class UserUpdateBean implements IBean {

	@Override
	public String execute(HttpServletRequest request) throws DAOException {
		// TODO 自動生成されたメソッド・スタブ

		//リクエストパラメータを取得
		String id = request.getParameter("id");

		//UserDAOのインスタンスを生成
		UserDAO dao = new UserDAO();

		User u = dao.findById(id);

		if (u == null) {
			throw new DAOException("指定したIDのユーザが見つかりません");
		}

		request.setAttribute("user", u);

		return "/db/user_update.jsp";
	}

}
