package thirdDay;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "first");
		map.put(1, "firstReplace");
		map.put(2, "Second");
		map.put(3, "third");
		map.put(4, "failed");
		map.put(5, "failed");
		int passcount=0;
		System.out.println(map);
		
		Set<Integer> roll=map.keySet();
		for(int key:roll) {
			if(!map.get(key).equals("failed")){
			passcount++;
			
			}
			System.out.println("passcount is "+passcount);
			System.out.println(key);
			System.out.println("Key is "+key+" value is "+map.get(key));
		}
		

	}

}
