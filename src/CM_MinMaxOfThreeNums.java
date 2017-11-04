import java.util.Scanner;

public class CM_MinMaxOfThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.print("Number 1: ");
		a=in.nextDouble();
		System.out.print("Number 2: ");
		b=in.nextDouble();
		System.out.print("Number 3: ");
		c=in.nextDouble();
		System.out.println("Minimum number is "+minNum(a,b,c));
		System.out.println("Maximum number is "+maxNum(a,b,c));
	}
	private static double minNum(double n1,double n2, double n3) {
		double minnum;
		if (n1<n2&&n1<n2) {
			minnum=n1;
		}
			else if(n2<n3) {
				minnum=n2;
				
		}
			else {
				minnum=n3;
			}
		return minnum;
	}
	private static double maxNum(double n1,double n2,double n3) {
		 
		 double maxnum=Math.max(n1,n2);
		 maxnum=Math.max(maxnum,n3);
		 //another simpleway 
		// maxnum=Math.max(Math.max(n1, n2),n3);
		
		return maxnum;
	}

}
