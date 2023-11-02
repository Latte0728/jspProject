package study.j1030;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/j1030/logout")
public class Logout extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String mid = request.getParameter("mid");
		
		// mid 회원에 대한 세선/DB 처리할 내용들을 모두 처리한 후 로그아웃 되었다는 메시지를 띄울 수 있도록 한다.
		
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('"+mid+ "님 로그아웃되셨습니다.');");
		out.println("location.href = '"+request.getContextPath()+ "/study/1030/login.jsp';");
		out.println("</script>");
	}		
}	