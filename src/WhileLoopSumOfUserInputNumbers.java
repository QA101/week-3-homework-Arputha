import java.util.Scanner;

public class WhileLoopSumOfUserInputNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int n ,total;
		Scanner in = new Scanner(System.in);
		total=0;
	while(a<=5) {
		
		System.out.print(" ");
		n=in.nextInt();
		total +=n;
		
		a++;
		
	}
	System.out.print("="+total);

	}

}
