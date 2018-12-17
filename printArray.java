import java.util.Scanner;

public class printArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input= new Scanner(System.in);
		System.out.println("enter capacity");
		int n=input.nextInt();
		System.out.println("enter value");
		int arrt[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arrt[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.println("the array is"+arrt[i]);

}
}

