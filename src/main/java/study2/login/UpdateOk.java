package study2.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study2.login.LoginDAO;
import study2.login.LoginVO;

public class UpdateOk implements LoginInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid")==null ? "" : request.getParameter("mid");
		String pwd = request.getParameter("pwd")==null ? "" : request.getParameter("pwd");
		String name = request.getParameter("name")==null ? "" : request.getParameter("name");
		
		LoginDAO dao = new LoginDAO();
		
		// 비밀번호 체크하기..
		LoginVO vo = dao.getLoginCheck(mid, pwd);
		
		
		if(vo.getMid() == null) {
			request.setAttribute("msg", "비밀번호 오류~~ 비밀번호를 확인하세요.");
			request.setAttribute("url", request.getContextPath()+"/update.lo");
		}
		else {
			
			vo = new LoginVO(); //vo를 LoginVO();로 생성하겠다 선언
			vo.setMid(mid);
			vo.setName(name);
		
			dao.setUpdateOk(vo);
		
			HttpSession session = request.getSession(); // 이름이 바뀌었으니 세션에 담아서 
			session.setAttribute("sName", name);// 저장
			
			request.setAttribute("msg", mid+"님 정보가 수정되었습니다."); // mid+"님 정보가 수정되었습니다. 메시지 저장
			request.setAttribute("url", request.getContextPath()+"/memberMain.lo"); // "/memberMain.lo" url 메시지 저장 
		}
	}

}
