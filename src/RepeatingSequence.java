import java.util.HashMap;


public class RepeatingSequence 
{
	public static void main(String[] args) { 
		String st="I am am not the one who is thinking I one thing at time";
//		String st="qrepjaljfaljqrepjljlajqrep"
		String[] ar = st.split(" ");
		
		
		HashMap<String, Integer> mp= new HashMap<String, Integer>();
		int count=0;
	
		for(int i=0;i<ar.length;i++){
		    count=0;
	
		    for(int j=0;j<ar.length;j++){
		        if(ar[i].equals(ar[j])){
		        count++;                
		        }
		    }
	
		    mp.put(ar[i], count);
		}
	
		System.out.println(mp);
	}

}
