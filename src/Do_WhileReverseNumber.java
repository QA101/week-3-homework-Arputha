import java.util.Scanner;

public class Do_WhileReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter your Number :");
		a=in.nextInt();
		System.out.println("Reverse Number : "+reverseNum(a));
	}
	private static int reverseNum(int n) {
		int n1=0;
		do {
			n1=n1*10+n%10;
			n=n/10;
		}while(n!=0);
		return n1;
	}

}
