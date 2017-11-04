import java.util.Arrays;
import java.util.Scanner;

public class CM_FirstTenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your Number:");
		a=in.nextInt();
		System.out.println(Arrays.toString(oddArray(a)));
	}
		private static int[] oddArray(int a) {
			int [] array=new int [10];
			if(a%2==0) {
				a+=1;
			}
			for(int i=0;i<10;i++) {
				array[i]=a+i*2;
			}
		
			return array;
	}

}
