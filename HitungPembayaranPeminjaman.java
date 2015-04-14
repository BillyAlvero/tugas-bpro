import java.util.*;
public class HitungPembayaranPeminjaman {
  public static void main (String []argx){
    Scanner a = new Scanner(System.in);
  
  Float SukuBungaThn;
  Float SukuBungaBln;
  float Tahun ;
  int JmlPinjam ;
  double PembayaranBulanan ;
  double formula;
  double formula1;
  double TotalPembayaran;
  
  System.out.println("========LOAN PAYMENT PROGRAM========");
  
  System.out.println("Masukan Suku Bunga Tahunan (dalam %) : ");
  SukuBungaThn = a.nextFloat();
  System.out.println("Masukan Jumlah Tahun : ");
  Tahun = a.nextFloat();
  System.out.println("Masukan Jumlah Pinjaman : ");
  System.out.print("Rp.");
  JmlPinjam = a.nextInt();
 SukuBungaThn=SukuBungaThn/100; 
 SukuBungaBln=SukuBungaThn/12; 
 formula=Math.pow(1+SukuBungaBln,Tahun*12);
 formula1=1-(1/formula);
 PembayaranBulanan=JmlPinjam*SukuBungaBln/formula1;
 TotalPembayaran=PembayaranBulanan*12*Tahun;
 System.out.println("Pembayaran Bulanan : Rp." +Math.round(PembayaranBulanan));
 System.out.println("Total Pembayaran   : Rp." +Math.round(TotalPembayaran));
 }
}