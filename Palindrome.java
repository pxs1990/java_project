package codingInterview;

public class Palindrome {
	public static boolean ispalindrome(String str) {
		char[] strArray= str.toCharArray();
				
		for (int i=0; i<=strArray.length-1;i++) {
			if (strArray[i]!=strArray[strArray.length-1-i]) {
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		System.out.println(ispalindrome("123212"));

	}
	
}

