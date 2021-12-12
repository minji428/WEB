package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join") // 웹 서비스 접근 경로 :    IP:포트번호:프로젝트명/서블릿 경로
					 //                Ex)       localhost:8080/12_jsp_basic/Join
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	// get형식으로 요청이 왔을때 doGet메서드가 호출 된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request,response);
	}
	
	// post형식으로 요청이 왔을때 doPost메서드가 호출 된다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	// get , post형식으로  요청되어도 아래의 메서드가 실행이 된다.
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 페이지 이동방식									//WebContent의 경로 부터 작성
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/01_join.jsp"); // 패키지명/jsp파일명
		dis.forward(request, response);
		
	}
	
	
}





