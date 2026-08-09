class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=1, maxCount=1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)) {
                int start = nums[i];
                count=1;
                while(set.contains(start+1)){
                    count++;
                    start++;
                    if(count>maxCount) maxCount=count;
                }
            }
        }
        return maxCount;
        
    }
}
