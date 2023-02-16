 public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
        Map<Integer,Integer> mp=new HashMap<>();
        int maxi=Integer.MIN_VALUE,sum=0;
        
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            
            if(sum==K){
                maxi=Math.max(maxi,i+1);
            }
            
            int required=sum-K;
            
            if(mp.containsKey(required)){
                
                maxi=Math.max(maxi,(i-mp.get(required)));
            }
            if(!mp.containsKey(sum)){
            mp.put(sum,i);
            }
            
        }
        
        if(maxi==Integer.MIN_VALUE){
            return 0;
        }
   
        return maxi;
    }
    
    
}


