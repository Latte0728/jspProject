package study2.mapping2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TestReInterface {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException; 
	// 예외 처리 못함, 그래서 예외처리가 나오면 이 페이지를 부른 애한테 떠넘김
		
}
