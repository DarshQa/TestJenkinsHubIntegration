
public class Sample 
{      //Counting the number of digits in a number
 /*   public static void main(String[] args) {

        int count = 0, num = 3452;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }*/
  //sum of natural numbers, i.e 1+2+,,100
    public static void main(String[] args) {

        int num = 4, sum = 0;

        for(int i = 1; i <= num; i++)
        {
            // sum = sum + i;
            sum += i;
        }
        
        /*while(i <= num)
        {
            sum += i;
            i++;
        }*/

        System.out.println("Sum = " + sum);
    }

}
