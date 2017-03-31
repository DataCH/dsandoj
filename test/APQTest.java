package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class APQTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.put("k", "test1"));
		System.out.println(map.put("k", "test2"));

		map = new LinkedHashMap<String, String>();
		System.out.println(map.put("k2", "test1"));
		System.out.println(map.put("k2", "test2"));

		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

	}

}
