import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "abhdhknxkjankzj";
		String result = "";
		int index = 0;
		ArrayList<Character> list = new ArrayList<Character>();
		
		for(int i=0; index<str.length();){
			
			list.add(str.charAt(i));
			
			for(int j=i+1;j<str.length(); j++)
				
				if(list.contains(str.charAt(j))){
					
					index += list.indexOf(str.charAt(j));
					
					String subStr = (String) str.subSequence(i, j);
					
					if(subStr.length() > result.length())
						result = subStr;	
					
					break;
				}
				else
					list.add(str.charAt(j));
			
			list.clear();
			i = ++index;
		}
		
		System.out.println("Result = " + result);

	}

}
