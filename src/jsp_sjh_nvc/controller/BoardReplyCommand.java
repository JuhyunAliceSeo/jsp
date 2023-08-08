package jsp_sjh_nvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_sjh_nvc.board.BoardDao;
import jsp_sjh_nvc.command.BoardCommand;
import jsp_sjh_nvc.dto.BoardDto;

public class BoardReplyCommand implements BoardCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("BoardReplyCommand entry..");
		
		 String bname = request.getParameter("bname");
	      String btitle = request.getParameter("btitle");
	      String bcontent = request.getParameter("bcontent");
	      
	      String bid = request.getParameter("bid");
	      String bgroup = request.getParameter("bgroup");
	      String bstep = request.getParameter("bstep");
	      String bindent = request.getParameter("bindent");
	      
	      BoardDao boardDao = new BoardDao();
	      
	      boardDao.reply(bid, bname, btitle, bcontent, bgroup, bstep, bindent);

	}

}
