import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		String b="";
		System.out.println("Enter the number");
		Scanner input= new Scanner(System.in);
		String n=input.nextLine();
		
int a=n.length();
for(int i=a-1;i>=0;i--){
	b=b+n.charAt(i);
}

System.out.println(b);
		
		if(n.equalsIgnoreCase(b))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		
	}

}
