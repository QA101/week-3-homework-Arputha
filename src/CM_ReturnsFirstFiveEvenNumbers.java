import java.util.Arrays;
import java.util.Scanner;

public class CM_ReturnsFirstFiveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter your number : ");
		a=in.nextInt();
		System.out.println(Arrays.toString(evenArray(a)));
	}
	
	private static int[] evenArray(int a) {
		int[] arr=new int[5];
		if(a%2!=0) {
			a+=1;
		}
		for ( int i=0;i<5;i++) {
			arr[i]=a+i*2;
		}
		return arr;
	}

}
