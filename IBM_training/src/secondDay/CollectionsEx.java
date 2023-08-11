package secondDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(2);
		System.out.println(arr);
		arr.add(1,33);
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		Scanner f=new Scanner(System.in);
		System.out.println("Enternow");
		String fruitNew=f.nextLine();
		
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add(fruitNew);
		fruits.add("mango");
		fruits.add("Apple");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		for(String fruit:fruits) {
			System.out.println(fruit);
		}

	}

}
