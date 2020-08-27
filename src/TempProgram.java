import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TempProgram{
	public static void readInt()
	{ 
		ArrayList<Integer> al=new ArrayList<Integer>();
		boolean error=false;
		int x=0;
		for(int i=0;i<5;i++) {
		do
		{
			try
			{
				Scanner KB=new Scanner(System.in);
				System.out.print("Enter integer : ");
				x=KB.nextInt();
				al.add(x);
				error=false;
			}
			catch(InputMismatchException e)
			{
				// accept integer only.
				System.out.println("Invalid Input..Pls Input Integer Only..");
				error=true;
			}
		}
		while(error);

	}
		System.out.println(al);
	}
	public static void main(String[] args) {
		
readInt();
		
	}

}
 