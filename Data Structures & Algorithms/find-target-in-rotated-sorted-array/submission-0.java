class Solution {
    public int search(int[] nums, int target) {
        int breakpoint =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                breakpoint = i;
                break;
            }
        }

        int low1 = 0, high1 = breakpoint-1;
        int low2 = breakpoint, high2 = nums.length-1;

        while(low1<=high1){
            int mid = low1+(high1-low1)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                low1=mid+1;
            }
            else{
                high1 = mid -1;
            }
        }

        while(low2<=high2){
            int mid = low2+(high2-low2)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                low2=mid+1;
            }
            else{
                high2 = mid -1;
            }
        }


        return -1;
        
    }
}
