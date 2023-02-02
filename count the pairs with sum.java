import java.util.HashMap;
import java.util.Map;
 
 class Main
{
    // Function to find a pair in an array with a given sum using hashing
    public static int findPair(int[] nums, int target)
    {
        int count=0;
        //HashMap is created
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            //checking the value present in the hashmap or not.
            if (map.containsKey(target - nums[i]))
            {
                count++;  //when the k value present in the map count will be incremented
            }
            map.put(nums[i], i);//when there is no value we rae going to insert values into HashMap from the array
        }
        return count;
     //finally number of pairs are retured
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2, 5,1 };
        int target = 10;
 
        System.out.println(findPair(nums, target));
    }
}
// TC: O(n),
//SC: O(n)




BRUTEFORCE APPORCH:https: 
// source code:  https://onlinegdb.com/9YXGHP3q-