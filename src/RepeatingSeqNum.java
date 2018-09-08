import java.util.HashMap;


public class RepeatingSeqNum {

	public static void main(String[] args) {
		
		int[] ar={1,2,1,2,3,4,3,3,1};
		HashMap<Integer, Integer> mp= new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
		    count=0;
		    for(int j=0;j<ar.length;j++)
		    {
		        if(ar[i]==ar[j]){
		        count++;                
		        }
		    }
	
		    mp.put(ar[i], count);
		}
	
		System.out.println("Each number has repeated" +mp);

	}

}
