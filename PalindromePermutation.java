package te;

/*
 * 
 * Program to find out if string is a permutation of palindrom
 * e.g. Input - tacocat 
 * outputs: True as permutations can be atcotac , taccoat
 * 
 * */


import java.util.HashMap;

public class PalindromePermutation {

	
	public static boolean findpermutation(String input) {
		
		
		HashMap <String, Integer> mp = new HashMap<String, Integer>();
		int len = input.length();
		
		boolean even = false;
		boolean pal = false;
		
		//Find out if string have even number of characters or odd
		if(len % 2 == 0) {
			even = true;
		}
		
		int count = 1 ;
		
		//Find the occurances of characters in string and store them in map as key - character and value - occurances pair

		for(int i = 0 ; i < len ; i ++) {
			
			for(int j = i +1 ; j < len ; j ++) {
			
				if(input.charAt(i) ==  input.charAt(j)) {
					count++;
				}
			
			}
			if(!mp.containsKey(input.charAt(i)+"")) {
				mp.put(input.charAt(i)+"", count);
				count = 1;
			}
			
		}
		
		
			count = 0;
			int count1 = 0;
			for(String key : mp.keySet()) {
				
				
				if(mp.get(key) >= 2) {
					
					count++;
					
				}
				
				if((mp.get(key) % 2) ==  1) {
					count1++;
					
				
				}
				
				
			}

			//If string is even, then all characters occurrences should be even to be a palindrome
			//If string is odd, then at least one character occurred to be odd number i.e. in 1, 3, 5 repetition. e,g. bab, baaab, aaa
			//if it is the case, set the flag true
			
			if(count >= 0  && count1 >= 0 && count1 %2 != 0)
				pal = true;
			
		
		
		
		
		
		return pal;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "tacocat";
		
		
		System.out.println("Input String :"+input );
		
		boolean isPermutation = findpermutation(input);
		System.out.println("Is string is permutation of palindrome?"+isPermutation);
		
	}

}
