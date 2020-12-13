package utilities;
import java.sql.*;

public class ConnectionUtil {
	
public static Connection getConnection() throws SQLException {
		
		try {
			//Lets Tomcat see where the driver is
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = /*"jdbc:postgresql://127.0.0.1:5432/trivia";;//System.getenv("project1_aws_dbString");
		String username = "postgres";//System.getenv("dbUserName");
		String password = "Bangladesh88";//System.getenv("dbPassword"); 
		
		return DriverManager.getConnection(url, username, password);
		
	}

}
