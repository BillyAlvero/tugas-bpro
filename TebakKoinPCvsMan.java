import java.util.Random;
import java.util.Scanner;

public class TebakKoinPCvsMan
{
	public static final void main(String[] args)
	{
		//generate angka random
		Random random = new Random();
		int angkaRandom = random.nextInt(2);
		System.out.println("Angka random = "+angkaRandom);
		//user input
		Scanner userInput = new Scanner(System.in);
		int pilMan;
		System.out.print("Masukkan angka pilihan User: ");
		pilMan = userInput.nextInt();
		//generate pilihan PC
		int pilPC = random.nextInt (2);
		System.out.println ("Pilihan PC= "+pilPC);
		
		if ((pilMan == angkaRandom) && (pilPC == angkaRandom))
		{
			System.out.println("User menang.");
		} else if ((pilMan != angkaRandom) && (pilPC==angkaRandom)) 
		{
			System.out.println("PC menang.");
		} else 
		{
			System.out.println("User menang.");
		}
	}
}