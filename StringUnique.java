package te;

import java.util.HashMap;

//Program to find if String has all unique characters.

public class StringUnique {

	//Just used map for future enhancement.. Not required though
	public  static boolean findIfUnique(String inputString) {
		
		int count = 0 ;
		HashMap <String, Integer> mp = new HashMap<String, Integer>();
		
		
		for(int i = 0 ; i < inputString.length(); i ++) {
			
			for(int j = i+1 ; j<inputString.length(); j++) {
			
				if(inputString.charAt(i) == inputString.charAt(j))
					mp.put(inputString.charAt(i)+"", count++);
			}
			count = 0;
		}
		
		
		if(mp.size() == 0)
			return true;
		else
			return false;
		
	}
	
	//Finding if string is used without using any data structure. 
public  static boolean findIfUniqueWithoutDS(String inputString) {
		
		int count = 0 ;
		
		
		for(int i = 0 ; i < inputString.length(); i ++) {
			
			for(int j = i+1 ; j<inputString.length(); j++) {
			
				if(inputString.charAt(i) == inputString.charAt(j)) {
					count++;
					break;
				}
				
			}
			
		}
		
		
		if(count == 0 )
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "abcdefg";
		boolean unique = findIfUnique(inputString);
		System.out.println("Is String characters are unique? :"+unique);
		
		
		boolean unique1 = findIfUniqueWithoutDS(inputString);
		System.out.println("Is String characters are unique wo DS? :"+unique1);
	}

}
