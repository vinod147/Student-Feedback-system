package feed;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query{
	Connection con = null;
	Statement st = null;
	public int checkLogin(String uname,String psw){
		int x = 0;
		try{
			con = new DbCon().connect();
			st = con.createStatement();
			ResultSet res = st.executeQuery("select * from student where Username='"+uname+"' and Password='"+psw+"'");
			if(res.next()){
				x =1;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return x;
	}
	
}
	
