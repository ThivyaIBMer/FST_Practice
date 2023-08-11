package secondDay;

public class LoopingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find factorial of a number
		/*int fact=1;
		int num=3;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		//find max num in an array
		int arr[]= {23,45,5,34,9};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
		//count total number of odd and even numbers in an array
	/*	
		int val[]= {1,2,3,4,5,6,7};
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<val.length;i++) {
			if(val[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println(oddCount);
		System.out.println(evenCount);*/
		
				

	}

}
