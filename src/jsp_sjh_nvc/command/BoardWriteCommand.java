package jsp_sjh_nvc.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp_sjh_nvc.board.BoardDao;
import jsp_sjh_nvc.dto.BoardDto;

public class BoardWriteCommand implements BoardCommand {
	
	  @Override
	   public void execute(HttpServletRequest request, HttpServletResponse response) {
	   
	      System.out.println("BwriteCommand entry.."); //디버깅을 위한 코드
	      
	      String bname = request.getParameter("bname"); 
	      String btitle = request.getParameter("btitle"); 
	      String bcontent = request.getParameter("bcontent"); 
	                  
	      BoardDao boardDao = new BoardDao();
	           
	      boardDao.write(bname,btitle,bcontent);
	       
	   }
	}