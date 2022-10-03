import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class feedback extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String fid = req.getParameter("fid");
		String comment = req.getParameter("comment");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","root");
			Statement st = con.createStatement();
			
			st.executeUpdate("insert into feedback values('"+fid+"','"+comment+"')");
			resp.sendRedirect("index.jsp");
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
