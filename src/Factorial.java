
public class Factorial {

	static long fact(int n) {
		long fac=1;
		if(n<0)
		{
			System.out.print("factorial of negative number is not possible");
			
		}
		else if(n==0 || n==1)
			return 1;
		else {
			for(int i=2;i<=n;i++)
				fac=fac*i;
		}
		return fac;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(-1));

	}

}
