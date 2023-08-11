package secondDay;

public class StringManipulations {

	public static void main(String[] args) {

		String s1="Thivya";
		String s2="aj";
		String s3="Rathi";
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.contains("t"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		System.out.println(s1.substring(2,5));
		System.out.println(s2.substring(1));
		System.out.println(s2.endsWith("j"));
		System.out.println(s1.replace("a", "Ra"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));

		//reverse String
		String s="Malayalam";
		s=s.toLowerCase();
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		if(s.equals(t)) {
			System.out.println("it is palindrome");}
		else {
			System.out.println("it is not palindrome");
		}

	}

}
