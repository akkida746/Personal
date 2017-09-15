import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CoinChange {
	
	static HashSet<ArrayList<Integer>> combinations = new HashSet<ArrayList<Integer>>();

	public static void main(String[] args) {

		int sum = 4;
		int coinIndex= 0;
		int[] coins = {1,2,3};
		List<int[]> tempList = new ArrayList<int[]>();
		List<int[]> combinations = new ArrayList<int[]>();
		
		countChange(coins, combinations, tempList, sum, coinIndex);
	}
	
	private static void countChange(int[] coins, List<int[]> combinations, List<int[]> tempList, int sum, int coinIndex){
		
		int[] arr = new int[sum];
		arr[0] = coins[coinIndex];
		tempList.add(arr);
		addSameNummber(tempList, sum, coins[coinIndex]);
		
		if(coinIndex > 0){
			for(int i=0; i<combinations.size(); i++){
				
				int[] tempArr = addNumberToArr(combinations.get(i), sum, coins[coinIndex]);
				tempList.add(tempArr);
				
				for(int j=0; j<sum; j++){
					for(int k=0; k<sum; k++){
						
					}
				}
			}
		}
		else{
			combinations = tempList;
			countChange(coins, combinations, new ArrayList<int[]>(), sum, ++coinIndex);
		}	
		
	}
	
	private static void addSameNummber(List<int[]> tempList, int sum, int num){
		
		int[] arr = new int[sum];
		int total = 0;
		int index = 0;
		
		// add same number equals to required sum
		while(true){
			if((total + num) <= sum){
				total += num;
				arr[index] = num;
				index++;
			}
			else 
				break;
		}
		
		tempList.add(arr);
	}
	
	private static int[] addNumberToArr(int[] arr, int sum, int num){
		
		int[] tempArr = new int[sum];
		int total = 0;
		int index = 0;
		int count = 0;
		
		for(int i=0; i<arr.length && total<=sum; i++){
			
			tempArr[i] = arr[i];
			
			if(arr[i] == 0){
				
				total += num;
				if(total <= sum){
					tempArr[i] = num;
				}
			}
		}
		
		return arr;
	}

}
