public class VarSwapper{
	public static void main (String []args){
	int a=50;
	int b=20;
	//cetak isi var a dan b
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("SWAP A -> B ");
	
	//proses pindah isi variabel
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a=" +a);
	System.out.println("b=" +b);
	
	}
}