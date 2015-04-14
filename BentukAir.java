import java.util.* ;
import java.util.Scanner ;

public class BentukAir {
	public static final int suhu = 10 ;
	public static final int suhu1 = 100 ;
	public static void main (String [] args) {
		//user input
		Scanner userInput = new Scanner(System.in);
		int temperatur;
		System.out.print("Masukkan suhu air: ");
		temperatur = userInput.nextInt();
		if (suhu == temperatur)  
		
		//user output
		{
			System.out.println("suhu air dalam bentuk cair.");
		} else if (temperatur < suhu) 
		{
			System.out.println("suhu air dalam bentuk padat.");
		} else if ((temperatur>=suhu) && (temperatur<suhu1)) 
		{
			System.out.println ("suhu air dlm bentuk cair.");
		} else if (temperatur > suhu1)
		{
			System.out.println("suhu air dalam bentuk gas.");
		}
	}
}