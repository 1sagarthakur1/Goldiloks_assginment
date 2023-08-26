import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetData {
	public static void main(String[] args) {
		
		try (Connection connection = Utility.tackeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("select * from test");
			ResultSet resultset = pStatement.executeQuery();
			
			while(resultset.next()) {
				String name = resultset.getString("emp_name");
				int age = resultset.getInt("emp_age");
				System.out.println(name);
				System.out.println(age);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
