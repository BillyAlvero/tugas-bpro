import java.io.*;

public class TiketPesawat
{
	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int[] ekonomi =  {1,2,3,4,5};
		int[] bisnis =  {1,2,3,4};
		int[] eksekutif =  {1,2,3};
		int[] vip =  {1,2};
		int[] tiket = new int [4];
		int[] jmlPesanan = new int [4];
		int[] total = new int [4];
		int totalOmset = 0;
		int pil = 0;
		
		do 
		{
			System.out.println("===========================================");
			System.out.println("==program penjualan tiket pesawat terbang==");
			System.out.println("===========================================");
			System.out.println("1.	PENJUALAN TIKET					");
			System.out.println("2.	VIEW DAFTAR KURSI YANG KOSONG	");
			System.out.println("3.	VIEW DAFTAR BKURSI YANG TERISI	");
			System.out.println("4.	VIEW SEMUA DAFTAR KURSI		");
			System.out.println("5.	VIEW REKAP KURSI			");
			System.out.println("6.	VIEW OMSET						");
			System.out.print("MASUKKAN NO PILIHAN ANDA (1-6):");
			System.out.println();
			pil = Integer.parseInt(br.readLine());
			
		
				switch(pil)
				{
					case 1:
					tiket[0] = 100000;
					tiket[1] = 150000;
					tiket[2] = 225000;
					tiket[3] = 393750;
					
					
						System.out.println("===============");
						System.out.println("PENJUALAN TIKET");
						System.out.println("===============");
						System.out.println();
					do
					{
						System.out.println("PILIH KELAS TIKET YANG AKAN DIPESAN");
						System.out.println("-----------------------------");
						System.out.println("1. KELAS EKONOMI		");
						System.out.println("2. KELAS BISNIS		");
						System.out.println("3. KELAS EKSEKUTIF	");
						System.out.println("4. KELAS VIP			");
						System.out.println("5. EXIT			");
						System.out.print("MASUKKAN NO PILIHAN ANDA (1-4):");
						System.out.println();
						pil = Integer.parseInt(br.readLine());
						
						if(pil ==1)
						{
							System.out.println("HARGA :Rp." + tiket[0]);
							System.out.print("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[0] = Integer.parseInt(br.readLine());
							if (jmlPesanan[0]<=5)
							{
								total[0] = tiket[0]*jmlPesanan[0];
								System.out.println("SUB TOTAL =" + total[0]);
								System.out.println("");
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 5");
							}
						}
						
						if(pil ==2)
						{
							System.out.println("HARGA :Rp." + tiket[1]);
							System.out.print("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[1] = Integer.parseInt(br.readLine());
							if (jmlPesanan[1]<=4)
							{
								total[1] = tiket[1]*jmlPesanan[1];
								System.out.println("SUB TOTAL =" + total[1]);
								System.out.println("");
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 4");
							}
							
						}
						
						if(pil ==3)
						{
							System.out.println("HARGA :Rp." + tiket[2]);
							System.out.println("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[2] = Integer.parseInt(br.readLine());
							if (jmlPesanan[2]<=3)
							{
								total[2] = tiket[2]*jmlPesanan[2];
								System.out.println("SUB TOTAL =" + total[2]);
								System.out.println("");
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 3");
							}
						
						}
						
						if(pil ==4)
						{
							System.out.println("HARGA :Rp." + tiket[3]);
							System.out.println("MASUKKAN JUMLAH PESANAN:");
							jmlPesanan[3] = Integer.parseInt(br.readLine());
							if (jmlPesanan[3]<=2)
							{
								total[3] = tiket[3]*jmlPesanan[3];
								System.out.println("SUB TOTAL =" + total[3]);
								System.out.println("");
							}
							else
							{
								System.out.println("kursi yang tersedia hanya 2");
							}
							
						}
					
					}while(pil<4);
					
					System.out.println();
					break;
					
					case 2:
					
					System.out.println();
					System.out.println("=============================");
					System.out.println("VIEW DAFTAR KURSI KOSONG");
					System.out.println("=============================");
					System.out.println();
					
					System.out.println("KELAS EKONOMI =");
						if (jmlPesanan[0] >= 5)
						{
							System.out.println("kelas ekonomi penuh");
							System.out.println("");
						}
						else 
						{
							System.out.println("kelas ekonomi masih ada yg kosong");
							System.out.println("");
						}
					
					System.out.println("KELAS BISNIS =");
						if (jmlPesanan[1]>=4)
						{
							System.out.println("kelas bisnis penuh");
							System.out.println("");
						}
						else 
						{
							System.out.println("kelas bisnis masih ada yg kosong");
							System.out.println("");
						}
					
					System.out.println("KELAS EKSEKUTIF =");
						if (jmlPesanan[2]>=3)
						{
							System.out.println("kelas eksekutif penuh");
							System.out.println("");
						}
						else 
						{
							System.out.println("kelas eksekutif masih ada yg kosong");
							System.out.println("");
						}
					
					System.out.println("KELAS VIP =");
						if (jmlPesanan[3]>=2)
						{
							System.out.println("kelas vip penuh");
							System.out.println("");
						}
						else 
						{
							System.out.println("kelas vip masih ada yg kosong");
							System.out.println("");
						}
					
					break;
					
				
					
					case 3:
					System.out.println();
					System.out.println("=============================");
					System.out.println("VIEW DAFTAR KURSI TERISI");
					System.out.println("=============================");
					System.out.println();
					break;
					
				
					case 4:
					System.out.println();
					System.out.println("=======================");
					System.out.println("VIEW SEMUA DAFTAR KURSI");
					System.out.println("=======================");
					System.out.println();
					break;
					
				
					case 5:
					System.out.println();
					System.out.println("================");
					System.out.println("VIEW REKAP KURSI");
					System.out.println("================");
					System.out.println();
					break;
				
					case 6:
					System.out.println();
					System.out.println("==========");
					System.out.println("VIEW OMSET");
					System.out.println("==========");
					System.out.println();
					System.out.println("kursi yang terjual pada kelas ekonomi :" + jmlPesanan[0] + "==> dengan total omset :Rp." + total[0] );
					System.out.println("kursi yang terjual pada kelas bisnis :" + jmlPesanan[1] + "==> dengan total omset :Rp." + total[1] );
					System.out.println("kursi yang terjual pada kelas eksekutif :" + jmlPesanan[2] + "==> dengan total omset :Rp." + total[2] );
					System.out.println("kursi yang terjual pada kelas vip :" + jmlPesanan[3] + "==> dengan total omset :Rp." + total[3] );
					totalOmset = total[0]+total[1]+total[2]+total[3];
					System.out.println("total omset seluruh kelas :Rp." + totalOmset );

					break;
					
				default: break;
			}			
		}
		while(pil<6);
	}
}