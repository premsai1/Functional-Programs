package functional;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : In thisroots of the given equation wil be displayed.
 * 
 */

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadratic o1 = new Quadratic();
		o1.process();

	}

	public void process() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the a value ");
		int a = s1.nextInt();
		System.out.println("enter the b value ");
		int b = s1.nextInt();
		System.out.println("enter the c value ");
		int c = s1.nextInt();

		double delta = b * b - 4 * a * c;
		System.out.println(" delta is " + delta);
		double Root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double Root2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println(" the root are " + Root1 + " " + Root2);
	}

}
