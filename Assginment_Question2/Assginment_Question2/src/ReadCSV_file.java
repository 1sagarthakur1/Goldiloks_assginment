import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class ReadCSV_file {
	public static void main(String[] args) throws Exception{
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CSV.txt"));
		bufferedWriter.write("Sagar,thakur,21,Bhopal,Student");
		bufferedWriter.newLine();
		bufferedWriter.write("Mohit,sahu,23,Berasia,Student");
		bufferedWriter.newLine();
		bufferedWriter.write("Rohan,thakur,54,Bhopal,Teacher");
		bufferedWriter.newLine();
		bufferedWriter.write("Sonu,kumar,89,chandighar,Student");
		bufferedWriter.flush();
		bufferedWriter.close();
		System.out.println("done");
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("CSV.txt"));
		
		String string = bufferedReader.readLine();
		
		while(string != null) {
			String[] arr = string.split(",");
			System.out.println(Arrays.toString(arr));
			string = bufferedReader.readLine();
		}
	}
}
