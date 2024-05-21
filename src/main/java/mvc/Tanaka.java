package mvc;

import javax.servlet.http.HttpServletRequest;

public class Tanaka implements CET {
	public String calc(HttpServletRequest request) throws CETException {
		try {
			//リクエスト・パラメータを取得
			int x = Integer.parseInt(request.getParameter("data1"));
			int y = Integer.parseInt(request.getParameter("data2"));

			int result = x + y;

			//加算結果をJSPで表示できる準備
			request.setAttribute("result", result);

			return "/mvc/honma.jsp";
		} catch (NumberFormatException e) {
			throw new CETException("数値以外が入力されてるポ！");
		}
	}
}
