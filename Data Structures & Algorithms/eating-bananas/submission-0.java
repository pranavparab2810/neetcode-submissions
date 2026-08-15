class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minimum = 1;
		int maximum = Arrays.stream(piles).max().getAsInt();
		int res =0;
		while(minimum <= maximum) {
			double totalHours = 0;
			int average = minimum + (maximum - minimum)/2;
			
			for(int pile : piles) {
				totalHours = totalHours + Math.ceil((double)pile/average);
			}
			
			if(totalHours <= h ) {
				 res = average;
				maximum = average -1;
				
			}
			else {
				minimum = average+1;
			}
		}
		
		
		
		return res;
    }
}
