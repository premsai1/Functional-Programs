package functional;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : In this the windchill temperature will be calucalated.
 * 
 */

public class Windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windchill o1 = new Windchill();
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the temperature in between 50 ");
		int temp = s1.nextInt();
		System.out.println("enter the wind speed in between 3 and 120 ");
		int velocity = s1.nextInt();
		if (temp < 50 && (velocity > 3 && velocity < 120)) {
			o1.process(temp, velocity);

		} else {
			System.out.println("enter the correct values");
		}

	}

	public void process(int temp, int velocity) {
		double ef = windcaluclate(temp, velocity);
		System.out.println("the effective temperature will be " + ef);
	}

	public double windcaluclate(int t, int v) {
		double w = (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16));

		return w;

	}
}
