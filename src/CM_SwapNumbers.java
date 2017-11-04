import java.util.Scanner;

public class CM_SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		 Scanner in = new Scanner(System.in);
		 System.out.print("a = ");
		 a=in.nextInt();
		 System.out.print("b = ");
		 b=in.nextInt();
		 System.out.println("After Swapping,");
		 System.out.println(swap(a,b));
		 

	}
	public static String swap(int n1, int n2) {
		String print=" ";
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		print="a = "+n1+ "\n" + "b = "+n2;
		
		return print;
	}

}
