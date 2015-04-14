import java.util.*;

public class OperasiArray1{
	public static void cetak(int []data){
		for(int a=0;a<data.length;a++){
			System.out.println("Data ke "+(a+1)+" : "+data[a]);
		}
	}
	public static int hitungTotal(int []data){
		int jumlah = 0;
		for(int b=0;b<data.length;b++){
			jumlah+=data[b];
		}
		return(jumlah);
	}
	public static int rataRata(int []data){
		int jumlah = 0;
		for(int b=0;b<data.length;b++){
			jumlah+=data[b];
		}
		return(jumlah/data.length);
	}
	public static int nilaiMax(int []data){
		int max = 0;
		for(int b=0;b<data.length;b++){
			if(data[b]>max){
			max=data[b];
			}
		}
		return(max);
	}
	public static int nilaiMin(int []data){
		int min = 10;
		for(int b=0;b<data.length;b++){
			if(data[b]<min){
			min=data[b];
			}
		}
		return(min);
	}
	public static void main (String [] args){
		int angka[] = {1,25,50,75,78,80,90,100};
		int total = hitungTotal(angka);
		double rataRata = rataRata(angka);
		int max = nilaiMax(angka);
		int min = nilaiMin(angka);
		cetak(angka);
		System.out.println();
		System.out.print("Total Data : "+total);
		System.out.println();
		System.out.print("Nilai Max : "+max);
		System.out.println();
		System.out.print("Nilai Min : "+min);
		System.out.println();
		System.out.print("Nilai RataRata seluruh data : "+rataRata);
	}
}