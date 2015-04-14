import java.io.*;

public class Login{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String namaDepan ;
		String namaBelakang ;
		
		System.out.println("++++++++++++++++++++");
		System.out.println("        LOGIN       "); 
		System.out.println("++++++++++++++++++++");
		System.out.println("Masukkan nama depan anda : ");
		namaDepan = br.readLine();
		System.out.println("Masukkan nama belakang anda : ");
		namaBelakang = br.readLine();
		
		String userName = namaDepan.CharAt(1)+namaBelakang.substring();
		String password = "";

	}
}