import java.util.Scanner;

public class WhileloopProductOfuserInputNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int product=1;
		int n;
		Scanner in=new Scanner(System.in);
		while(a<=5) {
		System.out.print(" ");
		n= in.nextInt();
		product *=n;
		a++;
		}
		System.out.print("Product = "+product);

	}

}
