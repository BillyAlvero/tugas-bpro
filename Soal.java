import java.util.*;
public class Soal
{
 public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.print ("Masukan jumlah soal : ");
    int soal=sc.nextInt();
    int i=1;
    int c=1;
	int total = 0;
    String output="";
	
    System.out.println ("Jawablah pertanyaan berikut ini dengan tepat!");
    System.out.println ("No. \tSoal \tJawaban"); 
    System.out.println ("======================="); 
   
    while(i<soal+1){
    int a=(int)(Math.random()*20);
    int b=(int)(Math.random()*10);
    int kunci=a+b;

    System.out.print (i+").\t"+a+"+"+b+"=");
    int jawab=sc.nextInt();
    if (jawab==kunci){
    output +="\n"+i+").\t"+a+"+"+b+"\t"+jawab+"\t"+kunci+"\t"+"Benar";
	total = soal*10;
    }
else{
output +="\n"+i+").\t"+a+"+"+b+"\t"+jawab+"\t"+kunci+"\t"+"Salah";
}
   i++;
    }
    System.out.println ("Hasil Kuis Anda Adalah:" + total);  
    System.out.println ("");  
    System.out.println ("No."+"\tsoal"+"\tJawaban"+"\tKunci"+"\tStatus");  
    System.out.println ("=============================================");  
    System.out.println (output);  
}
}