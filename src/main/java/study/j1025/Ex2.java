package study.j1025;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;

@WebServlet("/Ex2")
public class Ex2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");	
		PrintWriter out = response.getWriter();
		
		for(int i =1; i<6; i++) {
			
		}
		
		for(int i =1; i<=10; i++) {
			out.println(i+"단<br/>");
			
			
		
			for(int j =1; j<=10; j++) {
			
			
				out.println(i+"*"+j+"="+i*j +"<br/>");
			
			}
			out.println("<br/>");
							
			
		}
		
		out.println("<input type='button' value='다시시작' onclick='location.reload()' />");
	}
}