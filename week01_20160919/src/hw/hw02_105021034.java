package hw;
import java.util.Random;
import java.util.Scanner;
public class hw02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random r = new Random();
		int n = scn.nextInt();
		for(int a=0;a<n;a++)
		{
			System.out.print(r.nextInt(n)+1);
		}
	}

}
