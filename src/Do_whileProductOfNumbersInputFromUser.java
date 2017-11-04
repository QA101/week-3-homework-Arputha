import java.util.Scanner;

public class Do_whileProductOfNumbersInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1;
		int a, n;
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers to be Multiplied?");
		n=in.nextInt();
		
		
		do {
			in=new Scanner(System.in);
			a=in.nextInt();
		
			product*= a;
			n=n-1;
			
		}while(n>=1);
			System.out.print(product);	


	}

}
