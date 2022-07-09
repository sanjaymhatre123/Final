package Academy.TestCasepack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HSM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "vinod");
		hm.put(1, "aakash");
		hm.put(2, "Vijay");
		
		
		System.out.println(hm);
		Set hms = hm.entrySet();
		
		System.out.println(hms);
		
		Iterator it = hms.iterator();
		
		while (it.hasNext())
		{
			Map.Entry mp= (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
		
		
		
	}

}
