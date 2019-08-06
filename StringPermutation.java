package te;

import java.util.HashMap;
import java.util.Iterator;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.


public class StringPermutation {

	
	public static boolean findpermutation(String input1, String input2) {
		
		
		boolean flag = false;
		
		int len1 = input1.length();

		int len2 = input2.length();
		
		
		HashMap <String, Integer> mp = new HashMap<String, Integer>();
		HashMap <String, Integer> mp1 = new HashMap<String, Integer>();
		
		int count = 1 ; int count1 = 1 ;
		if(len1 == len2) {
			
			
			for(int i = 0 ; i < len1 ; i ++) {
				
				for(int j = i +1 ; j < len1 ; j++) {
					
					if(input1.charAt(i) == input1.charAt(j)) {
						count++;
					}
					
					
					if(input2.charAt(i) == input2.charAt(j)) {
						count1++;
					}
					
					
				}
				mp.put(input1.charAt(i)+"", count);
				mp1.put(input2.charAt(i)+"", count1);
				count = 1;
				count1 = 1;
				
			}
		}
			
			
			if(mp.size() == mp1.size()) {
				
				for( String key : mp.keySet()){
					if(mp.get(key).equals(mp1.get(key))) {
						
								flag = true;
						
					}
				}
				
			}
	
		
		return flag;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input1 = "aabbccddeeffgghh";
		String input2 = "hhggbbaacdcdeffe";
		
		System.out.println("Input Strings are:"+input1 + ",  "+input2);
		
		boolean isPermutation = findpermutation(input1, input2);
		System.out.println("Is string is permutation of other?"+isPermutation);

	}

}
