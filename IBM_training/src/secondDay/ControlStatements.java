package secondDay;

public class ControlStatements {

	public static void main(String[] args) {

		//check if odd or even
		int num=11;

		if(num%2==0) {
			System.out.println("Given Number: " +num+ " is even");
		}
		else {
			System.out.println("Given Number: " +num+ " is odd");
		}

		//check if below num is divisible by 2, 3 or 5
		int number=3;

		if(number%2==0) {
			System.out.println(number+ " number is divisible by 2");
		}

		else if(number%3==0) {
			System.out.println(number+ " number is divisible by 3");
		}
		else if(number%5==0) {
			System.out.println(number+" number is divisible by 5");
		}
		else {
			System.out.println(number+ " number is not divisible by either 2,3 or 5");
		}
		 

	}

}
