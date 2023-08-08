package jsp_sjh_nvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_sjh_nvc.board.BoardDao;

public class BoardDeleteCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardDeleteCommand entry..");
		
		String bid = request.getParameter("bid");
		
		BoardDao boardDao = new BoardDao();
		boardDao.delete(bid);
	   }
}

