import java.util.Scanner;

public class Do_WhileSumOfNumbersInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a, n;
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers to be added?");
		n=in.nextInt();
		
		
		do {
			in=new Scanner(System.in);
			a=in.nextInt();
		
			sum += a;
			n=n-1;
			
		}while(n>=1);
			System.out.print( sum);	

	}

}
