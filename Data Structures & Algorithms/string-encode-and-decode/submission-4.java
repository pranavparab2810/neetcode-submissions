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
			int delimiterIndex = encoded_string.indexOf('#', i);
			int length =    Integer.parseInt(encoded_string.substring(i,delimiterIndex));
			System.out.println(length);
			int start = delimiterIndex+1;
			int end = delimiterIndex+length+1;
			words.add(encoded_string.substring(start,end));
			i=end;
		}
		
		
		return words;
    }
}
