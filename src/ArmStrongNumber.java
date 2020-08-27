
public class ArmStrongNumber {
	static boolean isArmstrong(int num) {
		boolean flag=false;
		int sum=0;
	int temp=num;
		while(temp!=0) {
			sum+=Math.pow(temp%10,3);
			temp/=10;
		}
		if(sum==num)
			flag=true;
		return flag;
	}

	public static void main(String[] args) {
           int count=0;
		for(int i=1;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+"  ");
				count++;	
		}
		}
		System.out.println("Total armstrong numbers is="+count);
	}

}
