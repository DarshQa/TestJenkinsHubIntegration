
public class Twomaxnum 
{
	 public static void main(String a[]){
	        int num[] = {5,34,78,2};
	        Twomaxnum tmn = new Twomaxnum();
	        tmn.printTwoMaxNumbers(num);
	    }
	  public void printTwoMaxNumbers(int[] nums){
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(int n: nums){
	            if(maxOne < n){
	                maxTwo = maxOne;
	                maxOne =n;
	            } 
	            else if(maxTwo < n){
	                maxTwo = n;
	            }
	        }
	        System.out.println("First Max Number: "+maxOne);
	        System.out.println("Second Max Number: "+maxTwo);
	    }
	     
	   

}
