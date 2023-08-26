
public class Convert_String_binary {
	public static void main(String[] args) {
		
		
		 String s = "69";
		 decimalToBinary(Integer.parseInt(s));
		 
		 
		 String s1 = "1000101";
		 boinaryToDecimal(s1);
	}
	public static void boinaryToDecimal(String string){
		
		int p = 1;
		int num = 0;
		for(int i=string.length()-1;i>=0;i--) {
        	num = num + ((string.charAt(i)- '0')*p);
        	p = p+p;
        }
		System.out.println("The decimal number of "+string+" is "+num);
	}
	
	public static void decimalToBinary(int num){
        int value = num;
            String binary = "";
            while (value > 0){
                if (value % 2 == 1){
                	binary =  binary+ '1';
                }
                else {
                	binary = binary + '0';
                }
                value =  value / 2;
            }
            
            String oriBinary = "";
            
            for(int i=binary.length()-1;i>=0;i--) {
            	oriBinary = oriBinary + binary.charAt(i);
            }
            System.out.println("The binary number of "+num+" is "+ oriBinary);
    }
}
