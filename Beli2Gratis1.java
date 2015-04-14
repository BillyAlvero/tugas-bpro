import java.io.*;

public class Beli2Gratis1{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int Baju =0;
		int Bonus =0;
		int Jumlah =0;
			System.out.println("====================");
			System.out.println(" Beli 2 Gratis 1 ");
			System.out.println("====================");
			System.out.print("Masukkan Jumlah baju yang dibeli = ");
			Baju = Integer.parseInt(br.readLine());
				Bonus =Baju/2;
				Jumlah = Baju +Bonus;
				System.out.println("Jumlah Bonus \t\t\t = " + Bonus);
				System.out.println("Total item yang dibawa pulang  \t = "+ Jumlah);
		}
}