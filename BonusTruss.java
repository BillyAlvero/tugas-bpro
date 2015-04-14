import java.io.*;

public class BonusTruss{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int Barang =0;
		int Bonus =0;
		int Jumlah =0;
		int Harga =0;
		int totalBayar =0;
			System.out.println("====================");
			System.out.println("Toko Bonus Berlimpah ");
			System.out.println("====================");
			System.out.print("Masukkan Jumlah barang yang dibeli = ");
			Barang = Integer.parseInt(br.readLine());
			System.out.print("Masukkan Harga barang yang dibeli  = Rp. ");
			Harga = Integer.parseInt(br.readLine());
				Bonus =Barang/2;
				Jumlah = Barang + Bonus;
				totalBayar = (Harga*Barang);
				System.out.println();
				System.out.println("====================");
				System.out.println("	KASIR	");
				System.out.println("====================");
				System.out.println("Barang yang dibeli \t\t = " + Barang);
				System.out.println("Jumlah Bonus \t\t\t = " + Bonus);
				System.out.println("Total Barang + Bonus  \t\t = "+ Jumlah);
				System.out.println("Anda harus membayar   \t\t = Rp. "+ totalBayar);
		}
}