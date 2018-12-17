import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringtoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner input= new Scanner(System.in);
		String date1=input.nextLine();
		 SimpleDateFormat sd=new SimpleDateFormat("dd-mm-yyyy");
		 try {
			Date dt=sd.parse(date1);
			 
			 System.out.println(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
