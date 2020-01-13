package functional;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @Purpose : this program performs the 2-d Array for different data types.
 *
 */
public class ArrayTwo {
	Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraytwo o1 = new arraytwo();
		o1.process();
	}

	public void process() {
		System.out.println("enter the number of rows  ");
		int m = s1.nextInt();
		System.out.println("enter the number of columns");
		int n = s1.nextInt();
		int option1 = 0;
		do {
			System.out.println("1.integer");
			System.out.println("2.Double");
			System.out.println("3.boolean");
			System.out.println("enter the option to be performed ");
			int option = s1.nextInt();
			switch (option) {
			case 1:
				integer(m, n);
				break;

			case 2:
				Double(m, n);
				break;

			case 3:
				Boolean(m, n);
				break;

			default:

				System.out.println("enter the correct operation to be performed");
			}

			System.out.println("1.countinue");
			System.out.println("2.exit");
			System.out.println("enter the option to be performed ");
			option1 = s1.nextInt();

		} while (option1 == 1);
	}

	public void integer(int m, int n) {
		int arr[][] = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s1.nextInt();
			}
		}
		show(m, n, arr);
	}

	public void Double(int m, int n) {
		double[][] arrd = new double[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrd[i][j] = s1.nextInt();
			}
		}
		show2(m, n, arrd);
	}

	public void Boolean(int m, int n) {
		System.out.println("enter eiter trur or false");
		boolean arrb[][] = new boolean[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arrb[i][j] = s1.nextBoolean();
			}
		}
		show1(m, n, arrb);
	}

	public void show(int m, int n, int[][] arr) {

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void show2(int m, int n, double[][] arr) {

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void show1(int m, int n, boolean[][] arr) {
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(" ");
		}
	}
}
