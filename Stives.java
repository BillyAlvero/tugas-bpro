// how marry people, sacks, cats, and kits were encountered onn the road to St. Ives
public class Stives
{
	public static void main (String[] args)
	{
		int wives = 7;
		int sacks = 49;
		int cats = 343;
		int kits = 2401;
		int total = wives+sacks+cats+kits;
		
		int sacks2 = 7*wives;
		int cats2 = 7*sacks;
		int kits2 = 7*cats;
		total = 1+wives+sacks+cats+kits;
		
		System.out.println("Waves: "+ wives);
		System.out.println("Sacks: "+ sacks2);
		System.out.println("Cats: "+ cats2);
		System.out.println("Kits: "+ kits2);
		System.out.println("total: "+ total);
	}
}
		