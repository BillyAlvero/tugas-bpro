import java.util.*;
public class MenuKantinArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		boolean Selesai = false;
		int[] harga = {10000,13000,8000,10000};
		String[] menu = {"Nasi Goreng", "Soto Ayam", "Mie Ayam", "Mie Goreng"};
		int[] jumlah = new int [5];
		int[] Total = new int [5];
		
		
		
		do{
			System.out.println ("");
			System.out.println ("==========================");
			System.out.println ("=== DAFTAR MENU KANTIN ===");
			System.out.println ("==========================");
			System.out.println ("");
			System.out.println ("1. NASI GORENG");
			System.out.println ("2. SOTO AYAM");
			System.out.println ("3. MIE AYAM SPECIAL");
			System.out.println ("4. MIE GORENG");
			System.out.println ("5. KASIR");
			System.out.print ("Pilih pilihan [1-5] : ");
			int piluser = sc.nextInt();
			
			if (piluser == 1)
				{
					System.out.println ("");
					System.out.println ("========== NASI GORENG ============");
					System.out.println ("Harga NASI GORENG : Rp." + harga[0] +" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah NASI GORENG yang akan anda pesan : ");
						jumlah[0] = sc.nextInt();
						Total[0]=jumlah[0]*harga[0];
					System.out.println("Total yang harus dibayar :Rp. "+ Total[0]);
					System.out.println ("");
					
				}	
				
			if (piluser == 2)
				{
					System.out.println ("");
					System.out.println ("========== SOTO AYAM ============");
					System.out.println ("Harga SOTO AYAM : Rp." + harga[1]+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah SOTO AYAM yang akan anda pesan : ");
						jumlah[1] = sc.nextInt();
						Total[1]=jumlah[1]*harga[1];
					System.out.println("Total yang harus dibayar :Rp. "+ Total[1]);
					System.out.println ("");
					
				}	
				
			if (piluser == 3)
				{
					System.out.println ("");
					System.out.println ("========== MIE AYAM SPECIAL ============");
					System.out.println ("Harga SOTO AYAM : Rp." + harga[2] +" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE AYAM SPECIAL yang akan anda pesan : ");
						jumlah[2] = sc.nextInt();
						Total[2]=jumlah[2]*harga[2];
					System.out.println("Total yang harus dibayar :Rp. "+ Total[2]);
					System.out.println ("");
					
				}	
			
			if (piluser == 4)
				{
					System.out.println ("");
					System.out.println ("========== MIE GORENG ============");
					System.out.println ("Harga MIE GORENG : Rp." + harga[3]+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE GORENG yang akan anda pesan : ");
						jumlah[3] = sc.nextInt();
						Total[3]=jumlah[3]*harga[3];
					System.out.println("Total yang harus dibayar :Rp. "+ Total[3]);
					System.out.println ("");
					
				}	
			
		    if (piluser == 5)
				{
					System.out.println ("");
					System.out.println ("===================================");
					System.out.println ("============== KASIR ==============");
					System.out.println ("===================================");
					Total[4]=(jumlah[0]*harga[0])+(jumlah[1]*harga[1])+(jumlah[2]*harga[2])+(jumlah[3]*harga[3]);
					System.out.println ("");
					System.out.println (" MAKANAN YANG ANDA PESAN :");
					System.out.println (" 1. NASI GORENG : " + jumlah[0] + " x " + harga[0] + " = " + (jumlah[0]*harga[0]));
					System.out.println (" 2. SOTO AYAM : " + jumlah[1] + " x " + harga[1] + " = " + (jumlah[1]*harga[1]));
					System.out.println (" 3. MIE AYAM : " + jumlah[2] + " x " + harga[2] + " = " + (jumlah[2]*harga[2]));
					System.out.println (" 4. MIE GORENG : " + jumlah[3] + " x " + harga[3] + " = " + (jumlah[3]*harga[3]));
					System.out.println ("");
					System.out.println ("TOTAL KESELURUHAN = Rp." + Total[4]);
					Selesai = true;
				}
			
		  } while (!Selesai);
				
	}

}