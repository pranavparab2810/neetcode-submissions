class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
		
		for(String word : strs) {
			int length = word.length();
			sb.append(length).append("#").append(word);
		}
		
		return sb.toString();
        

    }

    public List<String> decode(String encoded_string) {
        int i=0;
		List<String> words = new ArrayList<String>();
		
		while(i<encoded_string.length()-1){
			int j=i;
			StringBuilder sb = new StringBuilder();
			while(encoded_string.charAt(j) != '#') {
				sb.append(encoded_string.charAt(j));
				j++;
			}
			int length = Integer.parseInt(sb.toString());
			int start = i+sb.length()+1;
			int end = i+sb.length()+length+1;
			words.add(encoded_string.substring(start,end));
			i=end;
		}
		
		
		return words;
    }
}
