import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={-8, -8, -3, 8};
	    int target=5;
	    
		System.out.println(minimumLength(a,target));
	}
	static int minimumLength(int a[],int k){
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int mini=2147483647;
	    int sum=0;
	    for(int i=0;i<a.length;i++){
	        sum+=a[i];
	        if(sum==k){
	           int curr=i+1;
	            mini=Math.min(mini,curr);
	        }
	        int requiredsum=sum-k;
	        
	        if(map.containsKey(requiredsum)){
	            int foundid=map.get(requiredsum);
	            int currentloc=i;
	            mini=Math.min(mini,currentloc-foundid);
	        }
	        map.put(sum,i);
	       
	             // int key=map.getKey(a[i],i);
	              //mini=Math.min(mini,key);
	        
	    }
	       if(mini>=Integer.MAX_VALUE) return -1;
	        
	  
	    return mini;
	}
}


