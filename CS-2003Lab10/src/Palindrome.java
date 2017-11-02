
public class Palindrome {
	public boolean isaPalindrome(String expr) {
		if(expr.length() == 0) { System.out.println("This number is a palindrome");return true;}
		else if(expr.length() == 1) {System.out.println("This number is a palindrome"); return true;}
		else if(expr.charAt(0) != expr.charAt(expr.length()-1)) {
			return false;}
		else return isaPalindrome(expr.substring(1, expr.length()-1));
			
	}
}
