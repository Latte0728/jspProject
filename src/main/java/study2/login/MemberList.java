package study2.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study2.login.LoginDAO;
import study2.login.LoginVO;

public class MemberList implements LoginInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid")==null ? "" : request.getParameter("mid");
	  	
	  	LoginDAO dao = new LoginDAO();
	  	
	  	LoginVO vo = dao.getLoginSearch(mid);
	  	
	  	request.setAttribute("vo", vo);
	  	
//	  	String viewPage = "/study/database/memberList.jsp";
//	  	RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
//	  	dispatcher.forward(request, response);  	
	}

}
