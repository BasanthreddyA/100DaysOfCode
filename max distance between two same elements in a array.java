// problem :: Maximum distance between two occurrences of same element in array
//code link : https://practice.geeksforgeeks.org/problems/max-distance-between-same-elements/1
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Brurtte forec Apporach
	 /*  int d=0;
	    int arr[]={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length;j++){
	            if(arr[i]==arr[j]){
	                if(Math.abs(i-j)>d){
	                    d=Math.abs(i-j);
	                }
	            }
	        }
	    }
	    System.out.println(d);*/
	    
	    
	    // By using Hashing
	    int arr[]={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
	    HashMap<Integer,Integer> h=new HashMap<>();
	   int max=0;
	    for(int i=0;i<arr.length;i++){
	        if(!h.containsKey(arr[i])){
	            h.put(arr[i],i);
	        }else{
	            max=Math.max(max,i-h.get(arr[i]));
	        }
	    }
	    System.out.println(max);
		
	}
}
