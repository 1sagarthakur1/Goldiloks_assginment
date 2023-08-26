import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Ram", 36);
		map.put("shyam", 60);
		
		System.out.println(map.get("shyam"));
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}
}
