import java.util.Scanner;

public class CM_SumProductReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your number:");
		a=in.nextInt();
		System.out.println("Sum ="+sumNum(a));
		System.out.println("Product ="+productNum(a));
		System.out.println("Reverse number :"+reverseNum(a));
			
	}
	public static int sumNum(int n) {
		int sum;
		int n1=0;
		sum=0;
		while (n>0) {
			n1=n%10;
			n=n/10;			
			sum+=n1;
//			System.out.println("n:"+n+"|n1:"+n1+"|sum:"+sum);
			}
		return sum;
	}
	public static int productNum(int n) {
		int n1=0;
		int product=1;
		while(n!=0) {
			n1=n%10;
			n=n/10;
			product *=n1;
		}return product;
	}
	public static int reverseNum(int n) {
		int n1=0;
		while(n!=0) {
			n1=n1*10+n%10;
			n=n/10;
//			System.out.println("n:"+n+"|n1:"+n1);
		}
		return n1;
	}
}
