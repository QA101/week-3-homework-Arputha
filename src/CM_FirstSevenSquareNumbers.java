import java.util.Arrays;
import java.util.Scanner;

public class CM_FirstSevenSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter your number:");
		a=in.nextInt();
		System.out.println(Arrays.toString(perfectSquareFrom(a)));
	}
	private static boolean isPerfectSquare(int n) {
		int temp;
		temp=(int) Math.sqrt(n);
		if ( n== temp*temp) {
			return true;
		}
		else {
			return false;
		}
	}
	private static int[] perfectSquareFrom(int n) {
		int i=0, j=0;
		int[] a=new int[7];
		j=n;
		while(i < 7) {
			if(isPerfectSquare(j)) {
				a[i]=j;
				i+=1;
			}
		j+=1;
		}
		return a;
	}

}
