import hsa.*;

public class ConvertBinaryToDecimal {
    public static void main(String args[]) {
	Console c = new Console();
	int sum = 0;
	
	c.println("Enter the binary code: ");
	String binary = c.readLine();;
	
	String code = Unit5Exercise6.reversal(binary);
	
	for (int i = 0; i < code.length(); i++) {
	    if (code.charAt(i) == '1') {
		sum = sum + (int)(Math.pow(2,i));
	    }
	}
	c.println(sum);
    }
}
