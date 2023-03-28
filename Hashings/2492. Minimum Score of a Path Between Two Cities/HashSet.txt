class Solution {
    public int minScore(int n, int[][] roads) {  
        // Sort the roads array based on the first element of each subarray
        Arrays.sort(roads, (a, b)->{
            return a[0] - b[0];
        });
        // Initialize a set to keep track of the cities visited in the path
        HashSet<Integer> set = new HashSet<>();
        // Add the first city and the second city in the first road to the set
        set.add(roads[0][0]);
        set.add(roads[0][1]);
        // Initialize the minimum distance to be the distance of the first road
        int min = roads[0][2];
        // Repeat the following loop 100 times
        for(int j = 0; j < 100; j++){
            // Loop through each road in the sorted roads array
            for(int i = 1; i < roads.length; i++){
                // If either of the cities in the road is in the set, then add the other city to the set
                if(set.contains(roads[i][0]) || set.contains(roads[i][1])){
                    // Update the minimum distance if the distance of the current road is smaller
                    min = Math.min(roads[i][2], min);
                    set.add(roads[i][0]);
                    set.add(roads[i][1]);
                }
            }
        }        
        // Return the minimum distance found
        return min;
    }
}