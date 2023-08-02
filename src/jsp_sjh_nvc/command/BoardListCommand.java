package jsp_sjh_nvc.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_sjh_nvc.board.BoardDao;
import jsp_sjh_nvc.dto.BoardDto;

public class BoardListCommand implements BoardCommand {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDao boardDao = new BoardDao();
		
		List<BoardDto> dtos = boardDao.list();
		
		request.setAttribute("list", dtos);
	}
	
	
}
