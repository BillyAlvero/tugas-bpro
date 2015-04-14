import java.util.*;
public class Looping4
{
	public static void main (String [] args) {
	Scanner sc=new Scanner(System.in);
	int angka=0;
	int total=0;
		do
		{
			System.out.print("Masukkan angka : ");
			angka = sc.nextInt();
			total +=angka;
		}while(angka!=999);
			System.out.println ("total = " + total);
	}
}

// cara 2
	//public static void main (String [] args) {
	//boolean selesai=false;
	//Scanner sc=new Scanner(System.in);
	//int angka=0;
	//int total=0;
		//do
		//{
			//System.out.print("Masukkan angka : ");
			//angka = sc.nextInt();
			//if (angka==999)
			//	selesai=true;
			//else
			//	total +=angka;
		//}while(!selesai);
			//System.out.println ("total = " + total);
	//}
//}