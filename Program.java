package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be entered? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		double[] firstSemester = new double[n];
		double[] secondSemester = new double[n];
		double[] sum = new double[n];
		double[] avg = new double[n];
		
		for (int i=0; i < n; i++) {
			System.out.println("Enter name, first and second grade of " + (i + 1) +"st student: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			firstSemester[i] = sc.nextDouble();
			secondSemester[i] = sc.nextDouble();
			sum[i] = firstSemester[i] + secondSemester[i];
		}
		
		System.out.println("Students approved:");
		for (int i=0; i<avg.length; i++) {
			avg[i] = sum[i] / 2.0;
			if (avg[i] >= 6.0) {
				System.out.println(names[i]);
			}
		}

		sc.close();
	}

}
