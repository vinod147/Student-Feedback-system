package feed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbCon {
	Connection con = null;
	
	public Connection connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","root");
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}

}
