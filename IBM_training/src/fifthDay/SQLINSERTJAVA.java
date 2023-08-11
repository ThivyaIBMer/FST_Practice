package fifthDay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLINSERTJAVA {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Password1");
			Statement stmt=con.createStatement();
			//String insertQuery="create table registration(Id integer,firstName varchar(20),lastName varchar(20),gender varchar(2), age integer)";
			String tabelValues="insert into registration values(1,'Priya','J','F',10)";
			int returnCount=stmt.executeUpdate(tabelValues);
			System.out.println(returnCount);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
