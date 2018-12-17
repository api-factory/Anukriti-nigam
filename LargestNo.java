import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		System.out.println("enter capacity");
		int n = input.nextInt();
		System.out.println("enter value");
		int arrt[] = new int[n];
		for (int i = 0; i < n; i++) {
			arrt[i] = input.nextInt();
		}
		int max = arrt[0];
		for (int i = 0; i < n; i++) {

			if (max < arrt[i]) {
				max = arrt[i];

			}
		}
		System.out.println(max);

	}

}
