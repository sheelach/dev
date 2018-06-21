import java.util.Scanner;

public class factorial {
	public static int factorial(int num)
	{
		if (num <=1)
		{
			return 1;
		}
		else
		{
			return num * factorial(num -1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 double sum = 0.0;
		 for(int n=1;n<=10;n++)
		 {
		 int t = factorial(n);
		 System.out.println(t);
	}
	}

}
