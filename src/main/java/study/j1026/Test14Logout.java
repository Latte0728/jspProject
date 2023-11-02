package study.j1026;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/1026/test14Logout")
public class Test14Logout extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name")==null ? "" : request.getParameter("name");
		
		 // 로그 아웃에 필요한 여러가지 로직들을 처리한다. (DB처리 내용, 각종 세션 정보에 대한 처리 등등)
   
		// 처리가 완료되면 '처리 완료(로그 아웃)'메시지 출력 후 시작 화면으로 이동시켜준다.
		
	   //  response.sendRedirect() 이용 방법
//	PrintWriter out = response.getWriter();	
//	out.println("<script>");	
//	out.println("alert('"+name+"님 로그아웃 되었습니다.')");	
//	out.println("location.href='"+request.getContextPath()+"/study/1026/test14.jsp';");	
//	out.println("</script>");	
	
	
	
		// RequestDispatcher 이용하는 방법
		request.setAttribute("name", name);
		String viewPage = "/study/1026/test14Msg.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}