package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		// servlet에서 세션을 생성하는 방법
		// HttpSession session = request.getSession();
		
		HttpSession session = request.getSession();
		
		// setAttribute()메서드 사용법은 이전과 동일
		session.setAttribute("id", request.getParameter("id"));
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/04_loginAction.jsp");
		dis.forward(request, response);
		
			
	}

}


