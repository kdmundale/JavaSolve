import java.util.Scanner;

public class ReplaceString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter string.");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(s);
		
		System.out.println("Enter portion of string you want to replace:");
		Scanner input2 = new Scanner(System.in);
		String s2 = input2.nextLine();
		
		System.out.println("Enter what you want to replace it with:");
		Scanner input3 = new Scanner(System.in);
		String s3 = input3.nextLine();
		System.out.println("Replace: "+s2+ "\nWith: "+ s3);
		
		String res = replace(s, s2, s3);
		System.out.println(res);
	}
	
	public static String replace(String a, String b, String c) {
		
		String result = a.replace(b, c);
		assertTrue(result.contains(c));
		assertFalse(result.contains(b));
		return result;
	}

	private static void assertFalse(boolean contains) {
		if(contains == true) {
			System.out.println("fail");
		}
	}

	private static void assertTrue(boolean contains) {
		if(contains == false) {
			System.out.println("fail");
		}
	}

}
