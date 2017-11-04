import java.util.Scanner;

public class CM_MinMaxOfTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		Scanner in=new Scanner(System.in);
		System.out.print("Number 1 =");
		a=in.nextDouble();
		System.out.print("Number 2 =");
		b=in.nextDouble();
		System.out.println("Minmum number is "+minNum(a,b));
		System.out.println("Maximum number is "+maxNum(a,b));
	}
	private static double minNum(double num1, double num2) {
		double minnum=Math.min(num1,num2);
		
		return minnum;
	}
	private static double maxNum(double num1,double num2) {
		double maxnum;
		if(num1>num2) {
			maxnum=num1;
		}
		else {
			maxnum=num2;					
		}	
		return maxnum;
	}

}
