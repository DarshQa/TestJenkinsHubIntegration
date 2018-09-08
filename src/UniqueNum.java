
public class UniqueNum 
{
	public static void main(String a[]){
        
        int[] nums = {5,2,7,2,4,7,8,2,3};
        
        for(int i=0;i<nums.length;i++)
        {
            boolean isDistinct = false;
            for(int j=0;j<i;j++)
            {
                if(nums[i] == nums[j])
                {
                    isDistinct = true;
                    break;
                }
            }
            if(isDistinct==false){
                System.out.print(nums[i]+" ");
            }
        }
        
        
    }

}
