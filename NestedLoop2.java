import java.util.*;
public class NestedLoop2
{
	public static void main(String [] p){
	Scanner sc=new Scanner(System.in);
	System.out.print("Masukkan n:");
	int n=sc.nextInt();
	System.out.print("Masukkan m:");
	int m=sc.nextInt();
	
		int c=0;
		while (c<n){
			int d=0;
			while (d<m){
					//chek kondisi
					System.out.print("*");
					//
					d++;
				}
					System.out.println();
					c++;
			}
	}
}