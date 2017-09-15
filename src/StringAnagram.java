import java.util.HashMap;

public class StringAnagram {

	public static void main(String[] args) {

		String str = "akash";
		String anagram = "haska";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
				
		for(char key: map.keySet()){
			if(map.containsKey(key)){
				int charCount = map.get(key) + 1;				
				map.put(key, charCount);
			}
			else
				map.put(key, 0);
		}
		
		int sumStr = 0;
		int sumAnagram = 0;
		
		for(int i=0; i<str.length(); i++){
			char value =  str.charAt(i);
			int ascii = (int) value;
			sumStr += ascii;
		}
		
		System.out.println(sumStr);
		
		for(int i=0; i<anagram.length(); i++){
			char value =  anagram.charAt(i);
			int ascii = (int) value;
			sumAnagram += ascii;
		}
		
		System.out.println(sumAnagram);
		
	}

}
