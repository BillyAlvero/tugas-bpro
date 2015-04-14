import java.io.*;

public class TebakAngkaGambar{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int input = 0;
		int bilrandom = 0;
		
		System.out.println("====================");
		System.out.println("PROGRAM TEBAK ANGKA GAMBAR");
		System.out.println("====================");
		System.out.print("Masukkan tebakan anda [1: Gambar 0: Angka]:  ");
		input = Integer.parseInt(br.readLine());
		
		bilrandom = (int)(Math.random()+0.5);
		System.out.println("Komputer menghasilkan : " +(bilrandom==1?"Gambar":"Angka"));
		if(bilrandom == input)
			System.out.println("SELAMAT tebakan Benar ");
		else
			System.out.println("MAAF tebakan Salah ");
	}
}