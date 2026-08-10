class Solution {
    public int maxArea(int[] nums) {
        int l=0, r=nums.length-1;
        int holdingCapacity =0, maxHoldingCapacity =0;
        while(l<r){
            holdingCapacity = (nums[l] <= nums[r] ) ?  nums[l]*(r-l) : nums[r]*(r-l);
            maxHoldingCapacity = holdingCapacity>maxHoldingCapacity ? holdingCapacity : maxHoldingCapacity;
            if(nums[l]<=nums[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxHoldingCapacity;
        
        
    }
}
