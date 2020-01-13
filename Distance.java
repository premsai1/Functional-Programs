package functional;

import java.util.Scanner;
/**
 * @author Premsai Manthani
 * @Purpose : In this distance will be calculated with math.power function.
 *
 */
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance o1 = new Distance();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the x coordinate");
		int x = s1.nextInt();

		System.out.println("enter the y coordinate");
		int y = s1.nextInt();
		int a = (x * x) + (y * y);
		System.out.println(" " + a);
		double dis = Math.pow(a, 0.5);
		System.out.println("the distance from origin to point" + x + " " + y + " =" + dis);

	}

}
