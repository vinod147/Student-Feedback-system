import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import feed.Query;

 @WebServlet("/verify")
public class verify extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String psw = req.getParameter("psw");
		if(uname.equalsIgnoreCase("admin")&& psw.equalsIgnoreCase("admin")){
			resp.sendRedirect("admin.jsp");
		}
		else{
			Query q = new Query();
			int x = q.checkLogin(uname,psw);
			if(x==1){
				resp.sendRedirect("feedback.jsp");
			}
			else{
				resp.sendRedirect("error.jsp");
			}
		}
		
			
	}

}
