class Solution {
    public int maxProfit(int[] nums) {
        int profit=0,maxProfit=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                profit = nums[j] - nums[i];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
