import hsa.*;

public class DecimaltoBinary
{
    public static void main (String [] args)
    {
	Console c = new Console();
	int number = c.readInt();
	int remainder = 0;
	int answer = number;
	String pattern = "";
	c.print("Enter a number in decimal: ");
	
	while(true)
	{
	    remainder = answer % 2;
	    answer = answer / 2;
	    pattern = remainder + pattern;
	    if (answer ==0){
		break;
	    }
	}
	//return(pattern);
	c.println(pattern);
    }
}

