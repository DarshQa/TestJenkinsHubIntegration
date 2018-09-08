
public class SwapWithoutTemp {

	public static void main(String[] args) 
	{
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  //  0 to 4(exclusive)
        a = a.substring(b.length());  // from 3rd index
        System.out.println("After : " + a + " " + b);
      
	}

}
