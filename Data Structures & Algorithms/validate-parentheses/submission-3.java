class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;

        Stack<Character> st = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!st.isEmpty() && st.peek()== map.get(c)){
                    st.pop();
                }
                else{
                    return false;
                }

            }
            else{
                st.push(c);
            }
        }

        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        //         st.push(s.charAt(i));
        //     } else if (st.isEmpty() && (s.charAt(i) == '}' || s.charAt(i) == ']'
        //         || s.charAt(i) == ')')) {
        //             return false;
        //     } else if (!st.isEmpty() && (st.peek() == '{' && s.charAt(i) == '}')
        //         || (st.peek() == '[' && s.charAt(i) == ']')
        //         || (st.peek() == '(' && s.charAt(i) == ')')) {
        //         st.pop();
        //     } else {
        //         return false;
        //     }
        // }

        return st.isEmpty();
    }
}
