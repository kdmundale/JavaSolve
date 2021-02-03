import java.util.Scanner;

public class Palindrome {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter string to check if it is a palindrome:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		System.out.println(isPal(s));
	}
	
	public static boolean isPal(String s) {
		
		boolean res=false;
		
		byte[] strAsByteArray = s.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		
		for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		
		if (new String(result).equals(s)) {
			System.out.println("BANG");
			res = true;
		}
		
		return res;
	}

}
