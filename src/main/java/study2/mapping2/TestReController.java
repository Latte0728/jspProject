package study2.mapping2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("*.re")
public class TestReController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestReInterface command = null;
		String viewPage = "/WEB-INF/study2/mapping2";
		
		String uri = request.getRequestURI();
		String com = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		
		if(com.equals("/test5")) {
			viewPage += "/test5.jsp";
		}
		else if(com.equals("/test5_2")) {
			viewPage += "/test5_2.jsp";
		}
		else if(com.equals("/test5_3")) {
			viewPage += "/test5_3.jsp";
		}
		else if(com.equals("/test5_4")) {
			command = new Test5_4Command();// 구현 객체 생성 코드
			command.execute(request, response); //구현 객체 실행 코드 
			viewPage += "/test5.jsp"; 
		}
		else if(com.equals("/test5_5")) {
			command = new Test5_5Command();// 구현 객체 생성 코드
			command.execute(request, response); //구현 객체 실행 코드 
			viewPage += "/test5_5.jsp"; 
		}
		else if(com.equals("/test5_6")) {
			command = new Test5_6Command();// 구현 객체 생성 코드
			command.execute(request, response); //구현 객체 실행 코드 
			//viewPage += "/test5.jsp";
			viewPage = "/include/message.jsp"; // 메시지는 += 하면 안됨 경로 못따라감, 그래서 메시지는 = 로 사용하기
		}
		
		request.getRequestDispatcher(viewPage).forward(request, response);
	}
}
