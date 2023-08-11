package sixthDay;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(UnitTest.class);
		System.out.println("Total test cases are "+ result.getRunCount());
		System.out.println("Total failed test cases are "+ result.getFailureCount());
		
		for(Failure fail:result.getFailures()) {
			System.out.println(fail.getException());
		}
		

	}

}
