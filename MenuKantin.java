import java.util.*;
public class MenuKantin 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		boolean Selesai = false;
		int jumlah1=0;
		int jumlah2=0;
		int jumlah3=0;
		int jumlah4=0;
		int nasi=0;
		int soto=0;
		int mie=0;
		int goreng=0;
		int Total=0;
		
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
						nasi = 10000;
					System.out.println ("Harga NASI GORENG : Rp." + nasi +" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah NASI GORENG yang akan anda pesan : ");
						jumlah1 = sc.nextInt();
						Total=jumlah1*nasi;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
				
			if (piluser == 2)
				{
					System.out.println ("");
					System.out.println ("========== SOTO AYAM ============");
						soto = 13000;
					System.out.println ("Harga SOTO AYAM : Rp." + soto+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah SOTO AYAM yang akan anda pesan : ");
						jumlah2 = sc.nextInt();
						Total=jumlah2*soto;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
				
			if (piluser == 3)
				{
					System.out.println ("");
					System.out.println ("========== MIE AYAM SPECIAL ============");
						mie = 8000;
					System.out.println ("Harga SOTO AYAM : Rp." + mie+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE AYAM SPECIAL yang akan anda pesan : ");
						jumlah3 = sc.nextInt();
						Total=jumlah3*mie;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
			
			if (piluser == 4)
				{
					System.out.println ("");
					System.out.println ("========== MIE GORENG ============");
						goreng = 10000;
					System.out.println ("Harga MIE GORENG : Rp." + goreng+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE GORENG yang akan anda pesan : ");
						jumlah4 = sc.nextInt();
						Total=jumlah4*goreng;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
			
		    if (piluser == 5)
				{
					System.out.println ("");
					System.out.println ("===================================");
					System.out.println ("============== KASIR ==============");
					System.out.println ("===================================");
					Total=(jumlah1*nasi)+(jumlah2*soto)+(jumlah3*mie)+(jumlah4*goreng);
					System.out.println ("");
					System.out.println (" MAKANAN YANG ANDA PESAN :");
					System.out.println (" 1. NASI GORENG : " + jumlah1 + " x " + nasi + " = " + (jumlah1*nasi));
					System.out.println (" 2. SOTO AYAM : " + jumlah2 + " x " + soto + " = " + (jumlah2*soto));
					System.out.println (" 3. MIE AYAM : " + jumlah3 + " x " + mie + " = " + (jumlah3*mie));
					System.out.println (" 4. MIE GORENG : " + jumlah4+ " x " + goreng + " = " + (jumlah4*goreng));
					System.out.println ("");
					System.out.println ("TOTAL KESELURUHAN = Rp." + Total);
					Selesai = true;
				}
			
		  } while (!Selesai);
				
	}

}