package functional;

/**
 * @author Premsai Manthani
 * @Purpose : In this the sum of three arrays equals to zero will be checked.
 * 
 */
import java.util.Scanner;

public class SumOfThreeToZero {
	Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_of_threetozero o1 = new Sum_of_threetozero();
		o1.process();

	}

	public void process() {
		System.out.println("enter the no of elements to be inserted into the array");
		int limit = s1.nextInt();
		int a1[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			System.out.println("enter the " + i + "th element to be inserted");
			a1[i] = s1.nextInt();
		}
		// System.out.println(" hai");
		check(a1);
	}

	public void check(int[] a1) {
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				for (int k = j + 1; k < a1.length; k++) {
					if (a1[i] + a1[j] + a1[k] == 0) {
						System.out.println(" " + a1[i] + " " + a1[j] + " " + a1[k] + " =0");
						count++;
					}

				}
			}
		}
		if (count == 0) {
			System.out.println("the elements sum is not equals to zero");
		}
	}

}