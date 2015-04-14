import java.util.*;
public class AreaAdmin {
	//Inisialisasi Vector Buah
	public static Vector <String> id = new Vector <String>();
	public static Vector <String> namabuah= new Vector <String>();
	public static Vector hargabeli= new Vector();
	public static Vector hargajual= new Vector();
	
	public static Scanner sc = new Scanner (System.in);
	public static void admin (){
		boolean haladmin=false;
		do {
			System.out.println ("");
			System.out.println ("======= Halaman Admin =======");
			System.out.println ("1. Manajemen Buah");
			System.out.println ("2. Manajemen User");
			System.out.println ("3. Laporan Penjualan");
			System.out.println ("4. Logout");
			System.out.print ("Pilih pilihan [1-4] : ");
			int Pil_Buah = sc.nextInt();
				boolean buah=false;
				
			switch (Pil_Buah) {
				case 1:
					do {
						System.out.println ("");
						System.out.println ("======= Manajemen Buah =======");
						System.out.println ("1. Menambah Data Buah");
						System.out.println ("2. Menghapus Data Buah");
						System.out.println ("3. Mengganti Data Buah");
						System.out.println ("4. Menampilkan Data Buah");
						System.out.println ("5. Exit");
						System.out.print ("Pilih pilihan [1-4] : ");
						int pilbuah = sc.nextInt();
						int urutan=-1;
						
							if (pilbuah == 1){
							boolean cekbuah = false;
								do {
								System.out.print ("");
								System.out.println ("> Menambah Data Buah");
								System.out.print ("Masukkan ID : ");
								String ID = sc.next();
									if (id.contains(ID.toUpperCase()) == false){
										System.out.print ("Masukkan Nama Buah : ");
										String NAMA = sc.next();
										
										if (NAMA.contains(NAMA.toUpperCase()) == false){
											System.out.print ("Masukkan Harga Beli : ");
											int HARGA = sc.nextInt();
											
											id.add(ID.toUpperCase());
											namabuah.add(NAMA.toUpperCase());
											hargabeli.add(HARGA);
											int hj = HARGA*10/100;
											hargajual.add(HARGA+hj);
											cekbuah = true;
										}
										else {
											System.out.println ("Nama Buah telah digunakan");}
									}
									else {
										System.out.println ("ID telah digunakan");}
								} while (cekbuah == false);
							}
							
							if (pilbuah == 2){
								System.out.println ("");
								System.out.print ("> Masukkan ID buah yang ingin di hapus : ");
								String hapusbuah = sc.next();
								if (id.contains(hapusbuah.toUpperCase())){
									urutan = id.indexOf(hapusbuah.toUpperCase());
									System.out.println ("Apakah Anda akan menghapus");
									System.out.println (id.elementAt(urutan)+"\t"+namabuah.elementAt(urutan));
									System.out.print ("[y/t]");
									String HapusBuah = sc.next();
									if (HapusBuah.equalsIgnoreCase("y")){
										id.remove(id.elementAt(urutan));
										namabuah.remove(namabuah.elementAt(urutan));
										hargabeli.remove(hargabeli.elementAt(urutan));
										hargajual.remove(hargajual.elementAt(urutan));
									}
									else {
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak terhapus");}
								}
								else {
								System.out.println ("ID tidak ditemukan"); }
							}
							
							if (pilbuah == 3){
								System.out.println ("");
								System.out.println ("> Mengganti Data Buah");
								System.out.print ("Masukkan ID Buah : ");
								String gantiID = sc.next();
								
								if (id.contains(gantiID.toUpperCase())){
									urutan = id.indexOf(gantiID.toUpperCase());
									System.out.println ("Mengganti Data Buah ");
									System.out.println (id.elementAt(urutan)+"\t"+namabuah.elementAt(urutan)+"\t"+hargabeli.elementAt(urutan));
									System.out.print ("[y/t]");
									String GantiID = sc.next();
									if (GantiID.equalsIgnoreCase("y")){
										System.out.print ("Masukkan Nama Buah : ");
										String NAMA = sc.next();
										namabuah.setElementAt(NAMA.toUpperCase(), urutan);

										System.out.print ("Masukkan Harga Beli : ");
										int HARGA = sc.nextInt();
										hargabeli.setElementAt(HARGA, urutan);
										//Menentukan harga jual
										int hj2 = (10/100)*Integer.parseInt(hargabeli.elementAt(urutan).toString());
										hargajual.setElementAt((HARGA+hj2), urutan);
									}
									else {
									System.out.println ("Data ID "+id.elementAt(urutan)+" tidak diganti");}
								}
								else {
									System.out.println ("ID Tidak ditemukan");}
							}
							
							if (pilbuah == 4){
								for (int i=0; i<id.size(); i++){
									System.out.println (id.elementAt(i)+"\t"+namabuah.elementAt(i)+"\t"+hargabeli.elementAt(i)+"\t"+hargajual.elementAt(i));
								}
							}
							
							if (pilbuah == 5){
								buah = true;
							}
							
					} while (buah == false);
				break;
				
				case 2:
					ProgramUtama.ManajemenUser();
				break;
				
				case 3:
					System.out.println ("======= Laporan Penjualan =======");
					System.out.println ("");
					System.out.println ("> Total Per Hari");
					for (int k=0; k<7; k++) {
						System.out.println ("Total Hari "+hari.elementAt(k)+" : "+totalhari.elementAt(k));
					}
					System.out.println ("> Total Per Minggu");
					for (int l=0; l<5; l++) {
						System.out.println ("Total Minggu ke "+l+" : "+totalminggu.elementAt(l));
					}
					System.out.println ("> Total Keseluruhan "+alltotal.elementAt(0));
				break;
				case 4:
					haladmin = true;
				break;
			}
		} while (haladmin == false);
	}
	
	public static void Penjualan () {

	}
	
	public static Vector total= new Vector();
	public static Vector <String> namabuah2= new Vector <String>();
	public static Vector <String> hari = new Vector <String>();
	public static Vector totalhari = new Vector();
	public static Vector totalminggu = new Vector();
	public static Vector alltotal = new Vector();
	
	public static void kasir (){
		hari.add("senin");
		hari.add("selasa");
		hari.add("rabu");
		hari.add("kamis");
		hari.add("jumat");
		hari.add("sabtu");
		hari.add("minggu");
		boolean halkasir = false;
		
		do {
			System.out.println ("");
			System.out.println ("======= Halaman Kasir =======");
			System.out.println ("1. Penjualan");
			System.out.println ("2. Logout");
			int Pil_Kasir = sc.nextInt();
			int TotalHari=0;
			int TotalMinggu=0;
			int AllTotal=0;
			String ksrbuah;
			
			switch (Pil_Kasir) {
				case 1:
					boolean inputdata = false;
					System.out.println ("");
					System.out.println ("ketik \"stop\" untuk hari selanjutnya");
					System.out.println ("=============================");
					for (int j=0; j<7; j++) {
						for (int i=0; i<7; i++) {
							System.out.println ("Input penjualan pada hari "+hari.elementAt(i));
							do {
								int urutan2 = -1;
								System.out.print ("Input Nama Buah \t: ");
								ksrbuah = sc.next();
								
								if (ksrbuah.equalsIgnoreCase("stop")){
									inputdata = true;
								}
								else if (namabuah.contains(ksrbuah.toUpperCase()) == true){
									urutan2 = namabuah.indexOf(ksrbuah.toUpperCase());
									namabuah2.add(ksrbuah);
									
									System.out.print ("Input Jumlah : ");
									int jumlah = sc.nextInt();
									
									//total.add(Integer.parseInt(hargajual.elementAt(urutan2).toString()));
									TotalHari += jumlah*Integer.parseInt(hargajual.elementAt(urutan2).toString());
								}
								else {
									System.out.println ("Nama Buah Tidak Terdaftar / Inputan Salah");}
									
							} while (inputdata == false);
							totalhari.add(TotalHari);
							TotalMinggu += TotalHari;
						}
						totalminggu.add(TotalMinggu);
						AllTotal += TotalMinggu;
					}
					alltotal.add(AllTotal);
				break;
				
				case 2:
					halkasir = true;
				break;
			}
		}while (halkasir == false);
	}
}