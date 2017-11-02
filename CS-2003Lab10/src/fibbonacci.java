
public class fibbonacci {
	/*
	The Fibonacci Sequence is a series of numbers where a number is found by adding up the two numbers before it
	0, 1, 1, 2, 3, 5, 8, 13, 21…
	For numbers in the sequence less than 2 billion, find the sum of the odd-valued terms
	*/
	private long num1 = 0;
	private long num2 = 1;
	public void maxOddnum() {
		long fibSum = 0;
		for(long i = 0;i < 2000000000; i = num1+num2) {
			if((num1+num2)%2!=0) {
				fibSum = num1+num2;
			}
			System.out.printf("%d%n%d%n",num1,num2);
			num1 = num1 +num2;
			num2 = num1 +num2;
			
		}	
		System.out.println(fibSum + " is the value of all the odd valued terms");
	}
	public static void main(String...strings) {
		fibbonacci fib = new fibbonacci();
		fib.maxOddnum();
	}
}
