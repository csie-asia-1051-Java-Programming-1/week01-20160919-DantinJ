package hw;
import java.util.Scanner;
public class hw01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n值=");
		float n = scn.nextFloat();
		float a = n;
		int bit = 0;
		while(n>1)
		{
			n = n/2;
			bit = bit+1;
		}
		System.out.println((int)a+"種狀態需要"+bit+"個位元");
	}

}
