class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]> nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        int pivot = low;

        int result = binarySearch(nums,0,pivot-1, target);
        if(result!=-1){
            return result;
        }

        return binarySearch(nums,pivot,nums.length-1, target);
        
    }

    private static int binarySearch(int[] nums,int low,int high, int target){
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}
