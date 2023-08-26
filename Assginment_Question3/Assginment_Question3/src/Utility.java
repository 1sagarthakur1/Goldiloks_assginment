import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	public static Connection tackeConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver class name is not right");
		}
		
        String url = "jdbc:mysql://localhost:3306/SB";
        
        try {
		     Connection	connection = DriverManager.getConnection(url, "root", "root");
		    
		     conn = connection; 
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed");
		}
		return conn;
		
	}
}
