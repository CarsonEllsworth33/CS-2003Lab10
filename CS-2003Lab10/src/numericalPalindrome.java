

public class numericalPalindrome {
	private int fourDig1 = 0000;
	private int fourDig2 = 0000;
	private Palindrome palin = new Palindrome();
	private String numString;
	private int maxVal = 0;
	public int biggestPalindrome() {
		for(int i = 9999;i>=1000;i--) {
			fourDig1 = i;
			for(int j = 9999; j>=1000;j-- ) {
				fourDig2 = j;
				int product = fourDig1*fourDig2;
				numString = String.format("%d", product);
				if(palin.isaPalindrome(numString)) {
					System.out.printf("%d is the highest 4 digit product palindrome%n",product);
					maxVal = product;
					return maxVal;
				}
			}
		}//end of nested for loops
		
		return 1001;
	}
	public static void main(String... args) {
		numericalPalindrome numPal = new numericalPalindrome();
		System.out.println(numPal.biggestPalindrome());
	}
}

	
