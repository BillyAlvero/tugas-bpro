import java.io.*;

public class TebakanAngka{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int input = 0;
		double bilrandom = 0;
		
		bilrandom = Math.round(Math.random() * 10);
		System.out.println("====================");
		System.out.println("Masukkan Angka");
		System.out.println("====================");
		input = Integer.parseInt(br.readLine());
		
		if(bilrandom == input)
			System.out.println("Tebakan Benar" + bilrandom);
		else
			System.out.println("Tebakan Salah" + bilrandom);
	}
}