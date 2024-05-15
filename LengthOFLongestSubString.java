package roman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class longestStubString {
   
	public static void main(String[] args) {
		String s = "abcabcbb";
		String s2= "bbbbb";
		String s3= "pwwkew";
		String s4 =	"aab";
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s2));
		System.out.println(lengthOfLongestSubstring(s3));
		System.out.println(lengthOfLongestSubstring(s4));
	}
	
	
	public static int lengthOfLongestSubstring(String s) {
        
    	
        
    	int start=0, current =0, maior=0;
        
        List<Character> lista = new ArrayList<>();
        List<Character> biggest = new ArrayList<>();
        
        while (current<s.length()) {
        	Set<Character> set = new HashSet<>(lista);
        	char c = s.charAt(current);
        	if (set.add(c)) {
        	lista.add(c);
        	
        	       	
        	}else {
        		lista.remove(start);
        	   	current--;	
        	}
        	
        	if ((lista.size()>maior)) {
        		maior=lista.size();
        		biggest.clear();
        		biggest.addAll(lista);
        	}
        	
        	
        	current++;
        }
        System.out.println("Essa: "+biggest);
		return maior;
    }
}

//
//3. Longest Substring Without Repeating Characters

//Given a string s, find the length of the longest 
//substring
// without repeating characters.
//
// 
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
// 
//
//Constraints:
//
//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.