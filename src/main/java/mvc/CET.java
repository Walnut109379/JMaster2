package mvc;

import javax.servlet.http.HttpServletRequest;

public interface CET {
	public abstract String calc(HttpServletRequest request) throws CETException;
}
