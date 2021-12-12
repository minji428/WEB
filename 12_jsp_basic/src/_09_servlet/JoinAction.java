package _09_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinAction")
public class JoinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String id    = request.getParameter("id");
		String pw    = request.getParameter("pw");
		String name  = request.getParameter("name");
		String email = request.getParameter("email");
		
		String[] arr = request.getParameterValues("hobby");
		
		String hobby = "";
		for (int i = 0; i < arr.length; i++) {
			hobby += arr[i];
			if (i != arr.length-1) {
				hobby += ",";
			}
		}
		
		// request.setAttribute("속성이름" , 데이터);
		// setAttribute()메서드를 이용해서 자바의 데이터를 화면으로 전달한다.
		request.setAttribute("mdto", new MemberDTO(id, pw, name, email, hobby));
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/02_joinAction.jsp");
		dis.forward(request, response);
		
	}
	
	
	
	
}
