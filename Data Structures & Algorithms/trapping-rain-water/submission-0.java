class Solution {
    public int trap(int[] height) {

        int[] prefixMax = getPrefixMax(height);
        int[] suffixMax = getSuffixMax(height);

        int total =0;
        for(int i=0;i<height.length;i++){
            total = total + Math.min(prefixMax[i],suffixMax[i])-height[i];
        }
        return total;

        
    }

    private int[] getPrefixMax(int[] height){
        int[] prefixMax = new int[height.length];
        prefixMax[0]= height[0];
        for(int i=1;i<height.length;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }
        return prefixMax;
    }

    private int[] getSuffixMax(int[] height){
        int[] suffixMax = new int[height.length];
        suffixMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }
        return suffixMax;
    }
}
