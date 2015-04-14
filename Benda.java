import java.io.*;

public class Benda{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int Suhu = 0;
		
		System.out.println("====================");
		System.out.println("Menentukan jenis bentuk benda");
		System.out.println("====================");
		System.out.print("Masukkan suhu :  ");
		Suhu = Integer.parseInt(br.readLine());
		
		String Bentuk = "" ;
		if(Suhu <= 0)
		{
			Bentuk= " PADAT ";
		}else if (Suhu <= 100)
		{
			Bentuk= " CAIR ";
		}else 
		{
			Bentuk= " GAS ";
		}
		System.out.println();
		System.out.println ("Maka bentuk benda pada suhu " +Suhu + " derajat celcius adalah" +Bentuk);
	}
}