import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=null;
		try{
		int sum=0;
		
		System.out.println("Enter the number");
	input= new Scanner(System.in);
		int n=input.nextInt();
		
		int on=n;
		while(n!=0)
		{
			int a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
		}
		System.out.println(sum);
		if(sum==on)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("not arm");}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			input.close();
		}

}}
