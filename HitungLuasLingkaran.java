public class HitungLuasLingkaran{
	public static final float PHI = 22f/7f;
	public static void main (String[]xxx){
		//baca nilai radius
		float radius = 3.0f;
		//hitung luas lingkaran
		float luas = PHI * (radius * radius);
		//tampilkan hasil
		System.out.println("Luas lingkaran = "+ luas);
	}
}