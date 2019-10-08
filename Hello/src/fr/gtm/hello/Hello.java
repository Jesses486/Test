package fr.gtm.hello;

public class Hello {

	public static void main(String[] args) {
		int[] tab = {5,8,56,1,0,9,78,20,-5};
		show("hello");
		int min = Min(tab);
		System.out.println(min);
		double moy = Moy(tab);
		System.out.println(moy);
		int N = 1_000_363;
		int sum = sommeNPremierNombre(N);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(sum);
	}

	private static int sommeNPremierNombre(int N) {
		int res  = 0;
		for(int i = 1 ; i <= N ; i++) {
			res = res + i;
		}
		return res;
	}

	private static double Moy(int[] tab) {
		double moy = 0;
		for(int i = 0; i<tab.length; i++)
		{
			moy = moy + tab[i];
		}
		return moy/tab.length;
	}

	private static int Min(int[] tab) {
		int min = tab[0];
		for(int i = 1; i<tab.length; i++)
		{
			if(tab[i] < min) min = tab[i];
		}
		
		return min;
	}

	private static void show(String message) {
		System.out.println(message);
		
	}

}