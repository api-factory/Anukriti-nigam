import java.util.Scanner;

public class removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner input= new Scanner(System.in);
		String nospace=input.nextLine();
		nospace=nospace.replaceAll(" ","");
		System.out.println(nospace);
		
	}

}
