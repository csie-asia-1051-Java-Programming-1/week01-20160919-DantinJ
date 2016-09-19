package hw;
import java.util.Scanner;
public class hw03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		a = Math.round(a);
		b = Math.round(b);
		c = Math.round(c);
		d = Math.round(d);
		e = Math.round(e);
		f = Math.round(f);
		System.out.println(Math.min(a,(Math.min(b,(Math.min(c,(Math.min(d,(Math.min(e,f))))))))));
		
	}

}
