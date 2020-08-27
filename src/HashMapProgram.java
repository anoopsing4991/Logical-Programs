import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<String, Integer> hs=new ConcurrentHashMap<String,Integer>();
		hs.put("anoop", 5);
		hs.put("manoj",7);
		hs.put("alok",4);
		hs.put("kishan",9);
		Iterator<Entry<String, Integer>> it = hs.entrySet().iterator();
		// iterating every set of entry in the HashMap. 
		while (it.hasNext()) {
			Map.Entry<String,Integer> set = (Map.Entry<String,Integer>) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		hs.put("raj", 10);
		
	}
	}
}
