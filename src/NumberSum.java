
public class NumberSum 
{
	
	 public static void main(String a[]){
	    	NumberSum mns = new NumberSum();
	        System.out.println("Sum is: "+mns.getNumberSum(12));
	    }
	 
	int sum = 0;
    
    public int getNumberSum(int number)
    {
       while(number!=0)
        {
        	int num=number%10;
            sum += num;
            number=number/10;
        }
        return sum;
    }
     
}
