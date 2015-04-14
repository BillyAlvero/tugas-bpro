import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegiempatBolong {

	public static void main(String[] args) throws IOException{
		int tinggi, setengahTinggi;
		String input;
		System.out.print("Masukkan tinggi: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		tinggi = Integer.parseInt(input);
		int n=tinggi;

			if (n > 2){
			//baris
			for (int i=0; i < n; i++){
					//kolom
				for (int j=0; j < n; j++) {
					//kondisi pembentuk segiempat bintang
					if ((i==0) || (i==n-1) || (j==0) || (j==n-1)) {
					System.out.print("*");
					}
					else {
						//kondisi bolong tengahnya
						if (n%2==1){
							{
							System.out.print(" ");
							}
						}
						else {
						System.out.print(" ");
						}
					}
				}//akhir kolom
				System.out.println();
			}//akhir baris
		}
	}
}