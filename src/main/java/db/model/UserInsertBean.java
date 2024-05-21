package db.model;

import javax.servlet.http.HttpServletRequest;

import db.dao.DAOException;

public class UserInsertBean implements IBean {

	@Override
	public String execute(HttpServletRequest request) throws DAOException {
		// TODO 自動生成されたメソッド・スタブ

		return "/db/user_insert.jsp";
	}

}