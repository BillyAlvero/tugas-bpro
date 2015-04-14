public class TebakV2
{
	public static void main (String [] args){
		String [] label = {"Gambar","Angka"};
		int []score={0,0};
		
		System.out.println("Ke\t| Hasil Lemparan : ");
		System.out.println("========================");
		for (int i=0;i<12;i++){
			int r=(int)(Math.random()+0.5);
			System.out.println((i+1) + "\t|\t" + label[r]);
			score [r]++;
		}
		System.out.println("========================");
		for (int i=0;i<label.length;i++){
			System.out.println("Score " + label[i] + "=" + score [i]);
		}
		
		if (score [0]>score[1])
			System.out.println("GAMBAR MENANG");
		else if(score [0]<score[1])
			System.out.println("ANGKA MENANG");
		else
			System.out.println("-- SERI --");
	}
}