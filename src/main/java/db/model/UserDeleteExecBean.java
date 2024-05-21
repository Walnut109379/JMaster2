package db.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import db.bean.User;
import db.dao.DAOException;
import db.dao.UserDAO;

public class UserDeleteExecBean implements IBean {

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

		boolean check = dao.delete(id);

		if (check == false) {
			throw new DAOException("削除に失敗しました");
		}

		List<User> list = dao.findAll();

		request.setAttribute("list", list);

		return "/db/user_list.jsp";

	}
}
