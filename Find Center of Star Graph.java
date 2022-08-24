class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        
        for(int[] e:edges)
        {
            map.put(e[0],map.getOrDefault(e[0],0)+1);
            map.put(e[1],map.getOrDefault(e[1],0)+1);
            if(map.get(e[0])==n)
            {
                return e[0];
            }
            if(map.get(e[1])==n)
            {
                return e[1];
            }
        }
        
        return -1;
    }
}
