
public class StringPallindrome {
	static boolean isPalindrom(String str) {
		
		int ln=str.length();
		boolean flag=true;
		for(int i=0;i<ln/2;i++) {
			if(str.charAt(i)!=str.charAt(ln-i-1)) {
				flag=false;
			System.out.print("hello  ");
			    break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		if(isPalindrom("anooppoonaa"))
			System.out.println("It is a palindrome");
		else
			System.out.println("not a palindrome");
		
	}

}
