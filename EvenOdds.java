import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is for tetsing git 
		int a[]= {10,5,22,43,27,4,81,19,6,10};
		System.out.println(Arrays.toString(a));
		 ArrayList<Integer> l = new ArrayList<>();
		 for (int id: a) {
	            l.add(id);
	        }
		 System.out.println(l);
		evenodd(l);

	}

	private static void evenodd(ArrayList<Integer> l) {
		
	     int length=l.size();
	     int count=0;
	     for (int i=0;i<length;i++) {
	    	 
	    	 int k=l.get(i);
	    	 if ( k%2 ==0 ) {
	    		 continue;
	    	 }
	    	 else {
	    		
	    		 l.remove(i);
	    		 //System.out.println(l);
	    		 l.add(k);
	    		 i=i-1;
	    		 
	    	 }
	    	 count=count+1;
	    	
	    	 if ( count==length+1)
	    		 break;
	     }
	     
	     System.out.println(l);
		//this is for tetsing in git 
	     }
		
	}


