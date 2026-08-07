class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hm = new HashMap<>();
        
        List<Integer>[] count = new List[nums.length+1];
        
        for(int i=0;i<count.length;i++){
            count[i] = new ArrayList<>();
        }

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        	
        	count[entry.getValue()].add(entry.getKey());
            
        }
        
        int[] res = new int[k];
        int index=0;
        for(int i = count.length-1; i>0 && index<k;i--) {
        	for(int n : count[i]) {
        		res[index++] = n;
        		if(index==k) {
        			return res;
        		}
        	}
        }

        return res;


        
    }
}
