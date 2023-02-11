class Solution {
    
    public class Node{
        public int number;
        List<Integer> blueCities;
        List<Integer> redCitites;

        public Node(int number){
            this.number = number;
            blueCities = new ArrayList<>();
            redCitites = new ArrayList<>();
        }

    }
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
            Map<Integer, Node> hashMap = new HashMap<>() ;
            for(int i = 0;i<n;i++){
                hashMap.put(i,new Node(i));
            }
            for(int [] redEdge: redEdges){
                    hashMap.get(redEdge[0]).redCitites.add(redEdge[1]);
            }
            for(int [] blueEdge: blueEdges){
                hashMap.get(blueEdge[0]).blueCities.add(blueEdge[1]);
            }
            int [] ans = new int[n];
            Arrays.fill(ans,-1);
            boolean[][] visit = new boolean[n][2];
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] { 0, 0, -1 });
            ans[0] = 0;
            visit[0][1] = visit[0][0] = true;
    
            while (!q.isEmpty()) {
                int[] element = q.poll();
                int nodeNumber = element[0], steps = element[1], prevColor = element[2];
    
    
                for(Integer neighbor: hashMap.get(nodeNumber).redCitites){
                    if(!visit[neighbor][0] && prevColor!=0){
                        if(ans[neighbor] == -1) ans[neighbor] = 1 + steps;
                        visit[neighbor][0] = true;
                        q.offer(new int[]{neighbor,1+steps,0});
                    }
                }
                for(Integer neighbor: hashMap.get(nodeNumber).blueCities){
                    if(!visit[neighbor][1] && prevColor!=1){
                        if(ans[neighbor] == -1) ans[neighbor] = 1 + steps;
                        visit[neighbor][1] = true;
                        q.offer(new int[]{neighbor,1+steps,1});
                    }
                }
                
            }
            return ans;
        }

}