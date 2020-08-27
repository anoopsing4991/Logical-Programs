import java.util.HashMap;
import java.util.Map;

public class TempTest {
	public static int secondLargest(int arr[]) {
		int first,second;
		first=second=Integer.MIN_VALUE;
		//5,8,4
		for(int i:arr) {
			if(i>first) {
				second=first;
				first=i;
				
			}
			else if(i>second && i!=first) {
				second=i;
			}
		}
		return second;
	}
	
	public static boolean isValid(String str) {
		 boolean flag=false;
		char [] arr=str.toCharArray();
		int ln=str.length();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:arr) {
			System.out.println(c);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c,map.get(c)+1);
			}
		}
		if(map.get('{')==map.get('}')) {
			flag=true;
		}
		System.out.println(map);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondLargest(new int[] {5,8,9,7,6,3,4,10}));

	}

}
