import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentregister")
public class studentregister extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	String Name = req.getParameter("Name");
	String Contact = req.getParameter("Contact");
	String DOB = req.getParameter("DOB");
	String Email = req.getParameter("Email");
	String Gender = req.getParameter("Gender");
	String Branch = req.getParameter("Branch");
	String semister = req.getParameter("semister");
	String USN = req.getParameter("USN");
	String Address = req.getParameter("Address");
	String Username = req.getParameter("Username");
	String Password = req.getParameter("Password");
	String confirmpassword = req.getParameter("confirmpassword");
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","root");
		Statement st = con.createStatement();
		
		
		st.executeUpdate("insert into student values('"+Name+"','"+Contact+"','"+DOB+"','"+Email+"','"+Gender+"','"+Branch+"','"+semister+"','"+USN+"','"+Address+"','"+Username+"','"+Password+"','"+confirmpassword+"')");
			
			resp.sendRedirect("index.jsp");
			
	
		
		
}
catch(Exception e){
	System.out.println(e);

}
}
}
