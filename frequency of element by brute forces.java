public class Main
{
	public static void main(String[] args) {
	    int query=1;
	    int[]  arry={1,1,1,2,3,4,4,9,7,8,9,9,0,9};
	    int freq=0;
	    for(int i=0;i<arry.length;i++){
	        if(arry[i]==query){
	            freq++;
	        }
	    }
		System.out.println("frequency of the query "+query+" is "+freq);
	}
}
