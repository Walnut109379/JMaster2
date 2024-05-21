package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	//接続情報の設定
	private static final String URL = "jdbc:postgresql:canon_db"; //接続するDB
	private static final String USER = "postgres"; //ユーザ名
	private static final String PASS = "himitu"; //パスワード

	protected Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");

		Connection con = DriverManager.getConnection(URL, USER, PASS);

		return con;
	}
}
