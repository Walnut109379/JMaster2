package db.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import db.bean.User;
import db.dao.DAOException;
import db.dao.UserDAO;

public class UserListBean implements IBean {

	@Override
	public String execute(HttpServletRequest request) throws DAOException {
		// TODO 自動生成されたメソッド・スタブ

		//UserDAOのインスタンスを生成
		UserDAO dao = new UserDAO();

		List<User> list = dao.findAll();

		//リクエストスコープに記憶させる
		request.setAttribute("list", list);

		//表示するページを返す
		return "/db/user_list.jsp";
	}

}
