package thirdDay;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cc=new HashSet<String>();
		cc.add("mango");
		cc.add("apple");
		cc.add("mango");
		cc.add("banan");
		System.out.println(cc);
		
		HashSet<Integer> in=new HashSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		System.out.println(in);
		
		Iterator<Integer> itr=in.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
