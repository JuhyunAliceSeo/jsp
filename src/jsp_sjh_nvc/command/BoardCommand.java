package jsp_sjh_nvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardCommand {
	//인터페이스므로 메소드 선언만 가능하다. 구현은 자손이 한다.
	void execute(HttpServletRequest request, HttpServletResponse response);
	
}
