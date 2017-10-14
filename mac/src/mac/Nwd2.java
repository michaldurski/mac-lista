package mac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Nwd2 {

	public static void main(String[] args) {
		NwdTrudnyMichala(60, 50);
	}

	private static void NwdTrudnyMichala(int a, int b) {
		ArrayList<Integer> dzielnikiA = podajDzielniki(a);
		ArrayList<Integer> dzielnikiB = podajDzielniki(b);

		System.out.println("Dzielniki A : " + dzielnikiA);
		System.out.println("Dzielniki B : " + dzielnikiB);

		HashMap<Integer, Integer> wystapieniaDzielnikaA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> wystapieniaDzielnikaB = new HashMap<Integer, Integer>();
		for (int i = 0; i < dzielnikiA.size(); i++) {
			dodajWystapienie(dzielnikiA, dzielnikiB, wystapieniaDzielnikaA, i);
		}
		for (int i = 0; i < dzielnikiB.size(); i++) {
			dodajWystapienie(dzielnikiB, dzielnikiA, wystapieniaDzielnikaB, i);
		}
		System.out.println("wspólne z A : " + wystapieniaDzielnikaA);
		System.out.println("wspólne z B : " + wystapieniaDzielnikaB);

		Integer pierwszyCzynnikA = dzielnikiA.get(0);
		Integer pierwszyCzynnikB = dzielnikiB.get(0);

		int nwd = 1;
		System.out.println("wystapienia pierwszego dzielnika : " + wystapieniaDzielnikaA.get(pierwszyCzynnikA) + "<="
				+ wystapieniaDzielnikaB.get(pierwszyCzynnikB));
		if (wystapieniaDzielnikaA.get(pierwszyCzynnikA) < wystapieniaDzielnikaB.get(pierwszyCzynnikB)) {
			nwd = iloczynDzielnikow(wystapieniaDzielnikaA, nwd);
		} else {
			nwd = iloczynDzielnikow(wystapieniaDzielnikaB, nwd);
		}

		System.out.println("nwd:" + nwd);
	}

	private static void dodajWystapienie(ArrayList<Integer> dzielnikiA, ArrayList<Integer> dzielnikiB,
			HashMap<Integer, Integer> wystapieniaDzielnikaA, int i) {
		Integer dzielnik;
		dzielnik = dzielnikiA.get(i);
		if (dzielnikiB.contains(dzielnik)) {
			if (wystapieniaDzielnikaA.keySet().contains(dzielnik)) {
				wystapieniaDzielnikaA.put(dzielnik, 1 + wystapieniaDzielnikaA.get(dzielnik));
			} else {
				wystapieniaDzielnikaA.put(dzielnik, 1);
			}
		}
	}

	private static int iloczynDzielnikow(HashMap<Integer, Integer> wystapieniaDzielnikaA, int nwd) {
		Iterator<Integer> iterator = wystapieniaDzielnikaA.keySet().iterator();
		Integer key = (Integer) iterator.next();
		nwd = (int) (nwd * Math.pow(key, wystapieniaDzielnikaA.get(key)));

		for (; iterator.hasNext();) {
			key = (Integer) iterator.next();
			nwd = nwd * key;
		}
		return nwd;
	}

	public static ArrayList<Integer> podajDzielniki(int a) {
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
