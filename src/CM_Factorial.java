import java.util.Scanner;

public class CM_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in =new Scanner(System.in);
		System.out.print("Number : ");
		a=in.nextInt();
		System.out.println("Factorial for "+a+" = "+factorial(a));

	}
	private static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	

}
