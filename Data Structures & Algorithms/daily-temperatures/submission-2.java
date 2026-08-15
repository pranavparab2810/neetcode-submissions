class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int[] res = new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--){
            if(!st.isEmpty()){
                while(!st.isEmpty() && temperatures[i] >= st.peek()[0]){
                    st.pop();
                }
            }

            if(!st.isEmpty()){
                res[i] = st.peek()[1]-i;
            }
            else{
                res[i]=0;
            }
            st.push(new int[] {temperatures[i],i});
        }
        return res;
    }
}
