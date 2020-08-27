import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anoop singh hello anoop good bye";
		char[] ch=s.replace(" ", "").toCharArray();
		HashMap<Character,Integer> hs=new LinkedHashMap<Character, Integer>();
		for(Character c:ch ) {
			if(!hs.containsKey(c)) {
				hs.put(c, 1);
			}else
			{
				hs.put(c, hs.get(c)+1);
			}
			
		}

		System.out.print(hs);
	}

}
