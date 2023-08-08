package jsp_sjh_nvc.command;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_sjh_nvc.board.BoardDao;
import jsp_sjh_nvc.dto.BoardDto;

public class BoardReplyViewCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("BoardReplyViewCommand entry..");
		
		String bid = request.getParameter("bid");
		
		BoardDao boardDao = new BoardDao();
		BoardDto dto = boardDao.reply_view(bid);
		
		request.setAttribute("reply_view", dto);
	   }
}
