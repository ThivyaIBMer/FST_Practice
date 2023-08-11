package fourthDay;
import java.sql.*;

public class SQLProgram {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Password1");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee1");
			//System.out.println(rs.next());
			while(rs.next()) {
				System.out.println(rs.getInt("EmpId")+" "+rs.getString("firstname")+" "+rs.getString(3));
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			}
			con.close();
		}
		catch(Exception e) {
System.out.println(e);
		}

	}

}
