package mac;
import java.util.ArrayList;

public class Nwd22 {

	public static void main(String[] args) {
		test(6,9,3);
		test(18,16,2);
		test(20,50,10);
		test(6,13,1);
		test(623423,13234,1);
		test(40, 35,5);
		test(60,70,10);
		test(14,19,9);
	}
	
	private static void test(int a, int b, int nwd) {
		print("("+a+", "+b+")=="+nwd +" = "+NwdTrudny(a, b)); 
		print("("+b+", "+a+")=="+nwd +" = "+NwdTrudny(b, a));
	}


	public static int NwdTrudny(int a, int b) {
		ArrayList<Integer> tableA = tablicaAB(a);
		ArrayList<Integer> tableB = tablicaAB(b);
		//print(tableA.toString());
		//print(tableB.toString());

		int nwd = 1;

		for (int i = 0; i < tableA.size(); i++) {

			for (int x = 0; x < tableB.size(); x++) {
				if (tableA.get(i).compareTo(tableB.get(x)) == 0) {
					nwd = nwd * tableA.get(i);
					tableB.remove(x);
					break;
				}
			}
		}

		//print(nwd);
		return nwd;
	}

	private static void print(String s) {
		System.out.println(s);
	}
	
	private static void print(int nwd) {
		System.out.println("najwiekszym wspolnym dzielnikiem jest liczba " + nwd);
	}


	public static ArrayList<Integer> tablicaAB(int a) {
		ArrayList<Integer> dzielnikiA = new ArrayList<Integer>();

		int dzielnik = 2;
		if (a == dzielnik) {
			dzielnikiA.add(dzielnik);
		} else {
			while (a != 1) {
				if (a % dzielnik == 0) {
					dzielnikiA.add(dzielnik);
					a = a / dzielnik;

				} else {
					dzielnik++;

				}
			}
		}
		return dzielnikiA;
	}

	
}