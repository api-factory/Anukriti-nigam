import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		if(n==0||n==1){
			System.out.println("not even or odd");
		}
		if(n%2==0){
			System.out.println("No is even");
			
		}
		else{
			System.out.println("no is odd");
		}
	}

}
