import java.util.*;
public class Looping5
{
	public static void main (String [] args) {
	int baris, kolom;
		for(baris = 1; baris <=7 ; baris++)
		{
			for(kolom = 1; kolom <=7 ; kolom++)
			{
				  if (baris==1||baris==7||kolom==1||kolom==7)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
			}
		System.out.println("");
	}
}
}
