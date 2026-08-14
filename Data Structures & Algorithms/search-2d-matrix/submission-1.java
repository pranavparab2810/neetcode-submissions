class Solution {
    public boolean searchMatrix(int[][] nums, int target) {

        int m = nums.length;
        int n = nums[0].length;

        int start = 0;
        int end = (m*n)-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            int row = mid/n;
            int column = mid%n;

            if(nums[row][column] == target){
                return true;
            }
            else if(nums[row][column] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return false;
        
    }
}
