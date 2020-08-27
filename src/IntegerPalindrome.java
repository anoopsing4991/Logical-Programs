
public class IntegerPalindrome {
	static boolean isPalindrome(long num) {
		boolean flag =false;
		long rev=0;
		long temp=num;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp/=10;
		}
		if(rev==num)
			flag=true;
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isPalindrome(123321))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}

}
