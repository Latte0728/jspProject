package study2.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study.database.LoginDAO;
import study.database.LoginVO;

@SuppressWarnings("serial")
@WebServlet("*.lo") //맨 마지막에 lo가 있으면 무조건 데려옴
public class LoginController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginInterface command = null;
		String viewPage = "/WEB-INF/study2/login";
		
		String com = request.getRequestURI();
		com = com.substring(com.lastIndexOf("/"), com.lastIndexOf("."));
		
		if(com.equals("/login")) {
			viewPage += "/login.jsp";
		}
		else if(com.equals("/loginOk")) {
			command = new LoginOkCommand();
			command.execute(request, response);			
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("/logout")) {
			command = new LogoutCommand();
			command.execute(request, response);			
			viewPage = "/include/message.jsp";
		}
		
		else if(com.equals("/join")) {
			viewPage += "/join.jsp";
		}
		else if(com.equals("/joinOk")) {
			command = new JoinOkCommand();
			command.execute(request, response);			
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("/memberMain")) {
//			command = new MemberMainCommand();
//			command.execute(request, response);			
			viewPage += "/memberMain.jsp";
			// 누적으로 보내야됨(위에 내용이 적힘)
		}
		else if(com.equals("/memberSearch")) {
			command = new MemberSearchCommand();
			command.execute(request, response);			
			viewPage += "/memberSearch.jsp";
			// 누적으로 보내야됨(위에 내용이 적힘)
		}
		else if(com.equals("/memberList")) {
			command = new MemberList();
			command.execute(request, response);			
			viewPage += "/memberList.jsp";
			// 누적으로 보내야됨(위에 내용이 적힘)
		}
		else if(com.equals("/update")) {
			viewPage += "/update.jsp";
			// 누적으로 보내야됨(위에 내용이 적힘)
		}
		else if(com.equals("/updateOk")) {
			command = new UpdateOk();
			command.execute(request, response);
			
			viewPage = "/include/message.jsp";
			// 누적으로 보내야됨(위에 내용이 적힘)
		}
		request.getRequestDispatcher(viewPage).forward(request, response); 
		// 이거 없으면 화면에 못 뿌려줌
	}
}
