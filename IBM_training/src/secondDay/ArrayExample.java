package secondDay;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNumber[]=new int[10];
		int studentsRoll[]= {1,4,6,7,11,14};
		System.out.println(studentsRoll[2]);
		//for loop
//		for(int i=0;i<studentsRoll.length;i++) {
//			System.out.println(studentsRoll[i]);
//		}
//		//while loop
//		int num=0;
//		while(num<studentsRoll.length) {
//			System.out.println(studentsRoll[num]);
//			num++;
//		}
		//doWhile
		int i=21;
		do {
			System.out.println(i);
			i++;
		}while(i<=20);
		
		int j=21;
		
		//dowhile with increment first
		do {
			j++;
			System.out.println(j);
		}while(j<=20);
		
		//for each
		
		for(int k:studentsRoll) {
			System.out.println(k);
		}

	}

}
