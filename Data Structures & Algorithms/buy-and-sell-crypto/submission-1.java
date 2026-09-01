class Solution {
    public int maxProfit(int[] nums) {
        int profit=0,maxProfit=0, l=0,r=0;

        while(r<nums.length){
            if(nums[r]<nums[l]){
                l=r;
            }
            else{
                profit = nums[r]-nums[l];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
            r++;
        }
        

        return maxProfit;
    }
}
