import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try (Connection connection = Utility.tackeConnection()){
			PreparedStatement pStatement = connection.prepareStatement("Insert into test values(?,?)");
			
			try {
				System.out.print("Enter Emp Name : ");
				String nameString = scanner.next();
				pStatement.setString(1, nameString);
				
				
				System.out.print("Enter Emp age : ");
				int age = scanner.nextInt();
				pStatement.setInt(2, age);
				
				int i = pStatement.executeUpdate();
				if(i>0) {
					System.out.println("Employee insert successfully");
				}
				
			} catch (Exception e) {
				System.out.println("Please Enter write values");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
