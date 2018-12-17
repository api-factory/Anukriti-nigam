import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,flag=0;
		System.out.println("Enter the number");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+"not prime no");
			
		}
		for(i=2;i<=n/2;i++){
			if(n%i==0)
			{
				System.out.println(n+"not prime no");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(n+"prime no");
		}

	}

}
