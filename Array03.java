import java.util.*;
public class Array03
{
	public static void cetak(int []dRandom){
		for(int a=0;a<dRandom.length;a++){
			System.out.println("Data ke "+(a+1)+" : "+dRandom[a]);
		}
	}
	public static int hitungTotal(int []dRandom){
		int jumlah = 0;
		for(int b=0;b<dRandom.length;b++){
			jumlah+=dRandom[b];
		}
		return(jumlah);
	}
	public static int rataRata(int []dRandom){
		int jumlah = 0;
		for(int b=0;b<dRandom.length;b++){
			jumlah+=dRandom[b];
		}
		return(jumlah/dRandom.length);
	}
	public static int nilaiMax(int []dRandom){
		int max = 0;
		for(int b=0;b<dRandom.length;b++){
			if(dRandom[b]>max){
			max=dRandom[b];
			}
		}
		return(max);
	}
	public static int nilaiMin(int []dRandom){
		int min = 10;
		for(int b=0;b<dRandom.length;b++){
			if(dRandom[b]<min){
			min=dRandom[b];
			}
		}
		return(min);
	}
	public static void main (String [] args){
		int [] angka = new int [20];
		for (int i=0;i<angka.length;i++){
			angka[i] += (int)(Math.random()*50);
		}
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
