package study2.ajax2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInputCommand implements UserInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid")==null ? "" : request.getParameter("mid");
		// UserList.jsp의 아이디를 받음 let query에서 mid로 입력된 아이디를 저장하였다.
		// let query(상자)로 담은 mid(포장할 물건)를/을 request.getParameter("mid"); 라는 메서드(칼 또는 가위)를 이용하여
		// 제거한 후 mid 데이터 값을 꺼낸다.
		// String mid = request.getParameter("mid")==null ? ""
		// mid가 null일때는 ""(공백)으로 받고
		// mid가 null이 아닐 때는 
		// request.getParameter("mid");
		// mid로 받음
		
		String name = request.getParameter("name")==null ? "" : request.getParameter("name");
		// UserList.jsp의 성명을 받음 let query에서 name으로 입력된 성명을 저장하였다.
		// let query(상자)로 담은 name(포장할 물건)를/을 request.getParameter("name"); 라는 메서드(칼 또는 가위)를 이용하여
		// 제거한 후 name 데이터 값을 꺼낸다.
		
		int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
		// UserList.jsp의 나이를 받음 let query에서 age로 입력된 나이를 저장하였다.
		// let query(상자)로 담은 age(포장할 물건)를/을 request.getParameter("age"); 라는 메서드(칼 또는 가위)를 이용하여
	    // 제거한 후 age 데이터 값을 꺼낸다.
		
		String address = request.getParameter("address")==null ? "" : request.getParameter("address");
		// UserList.jsp의 주소(url)를 받음 let query에서 address로 입력된 주소(url)를 저장하였다.
		// let query(상자)로 담은 address(포장할 물건)를/을 request.getParameter("address"); 라는 메서드(칼 또는 가위)를 이용하여
		// 제거한 후 address 데이터 값을 꺼낸다.
		
		UserVO vo = new UserVO(); 
		// 연산자 new를 통해 UserVO();를 생성하여 vo(변수)를 user클래스의 인스턴스에 참조  
		
		vo.setMid(mid); // setMid(mid); : mid 데이터를 setMid 상자에 담아 저장 
		vo.setName(name); // setName(name); name 데이터를 setName 상자에 담아 저장
		vo.setAge(age); // setAge(age); age 데이터를  setAge 상자에 담아 저장
		vo.setAddress(address); // setAddress(address); address 데이터를 setAddress 상자에 담아 저장 
		
		UserDAO dao = new UserDAO(); 
		// servlet에서 DB로 작업 내용을 요청하는 과정
		
		String res = dao.getMidSearch(mid); 
		// DB(dao)에서 servlet으로 요청 결과값을 전달(반환)해주는 과정
		// 작업이 정상적으로 수행되었다면 반환할 때 1을 반환 
		// 작업이 비정상적으로 수행 즉, DB에서 어떤 문제로 인하여 servlet으로 데이터를 전달 하지 못하는 경우 0을 반환
		
		if(res.equals("0")) {
			response.getWriter().write("아이디가 중복되었습니다. 다시 가입하세요.");
		}
		// if(res.equals("0")) : DB에서 servlet으로 데이터가 넘어오지 않을 때 0을 반환 
		// 해석 : res가 0을 반환 받았다면 
		// response.getWriter().write("아이디가 중복되었습니다. 다시 가입하세요.");
		// "아이디가 중복되었습니다. 다시 가입하세요." 메시지 창 출력
		else { 
			res = dao.setUserInputOk(vo); // setUserInputOk이라는 그릇?? 또는 상자??에 vo를 받는다 
			if(res.equals("0")) response.getWriter().write("회원가입 실패~~. 다시 가입하세요.");
			// DB에서 servlet으로 데이터가 넘어오지 않을 때 0을 반환 
			// setUserInputOk(vo) = res 가 0을 반환 받았다면 \
			// response.getWriter().write("회원가입 실패~~. 다시 가입하세요.");
			// "회원가입 실패~~. 다시 가입하세요." 메시지 창 출력
			
			else response.getWriter().write(res); 
			// 작업이 정상적으로 수행되었다면 res(mid,name,age,address의 데이터)가 출력  
		}
	}

}