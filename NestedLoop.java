import java.util.*;
public class NestedLoop
{
	public static void main(String [] p){
	Scanner sc=new Scanner(System.in);
	System.out.print("Masukkan Jumlah loop:");
	int jml=sc.nextInt();
		int c=0;
		while (c<jml){
			int d=jml;
			while (d>0){
					System.out.print("@");
					d--;
				}
					System.out.println();
					c++;
			}
	}
}