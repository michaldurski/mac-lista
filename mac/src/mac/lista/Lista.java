package mac.lista;

public class Lista {
	/**
	 * Klasa ta ma mieæ nastêpuj¹ce pola prywatne:
	 * 
	 */
	private int[] liczby; // – tablica, w której przechowywane bêd¹ liczby,
	private int pojemnosc; // – maksymalna liczba elementów, mo¿liwych do przechowywania,
	private int rozmiar; // – aktualna liczba przechowywanych elementów.

	/**
	 * • konstruktor z parametrem okreœlaj¹cym pojemnoœæ, który przydziela pamiêæ
	 * dla tablicy liczby oraz ustala wartoœci pozosta³ych pól klasy;
	 */
	Lista(int pojemnosc) {
		liczby = new int[pojemnosc];
		this.pojemnosc = pojemnosc;
		this.rozmiar = 0;
	}

	/**
	 * • metodê dodajElement , która przyjmuje dok³adnie jeden element – liczbê
	 * ca³kowit¹, która dodawana jest do listy; w przypadku, gdy lista jest pe³na
	 * powinien zostaæ wyœwietlony komunikat o b³êdzie;
	 */
	public String dodajElement(int nowyElement) {
		if (rozmiar >= pojemnosc) {
			return "pe³na lista";
		}
		liczby[rozmiar] = nowyElement;
		rozmiar = rozmiar + 1;
		return "ok";
	}

	/**
	 * • metodê znajdz , której jedynym parametrem powinna byæ szukana liczba,
	 * natomiast wynikiem pozycja podanej liczby w liœcie (licz¹c od 0) lub -1, gdy
	 * liczby nie ma na liœcie;
	 */
	public int znajdz(int szukanyElement) {
		for (int i = 0; i < liczby.length; i++) {
			if (liczby[i] == szukanyElement) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * • bezparametrow¹ metodê pisz , która wypisuje informacje o liœcie, w tym jej
	 * rozmiar, pojemnoœæ oraz listê przechowywanych elementów;
	 */
	public void pish() {
		for (int i = 0; i < rozmiar; i++) {
			System.out.print("[" + i + "]=" + liczby[i] + " ; ");
		}
		System.out.println("");
	}

	/**
	 * • metodê usunPierwszy , która usuwa pierwsze wyst¹pienie podanej jako
	 * parametr liczby, je¿eli znajduje siê ona na liœcie, tzn. je¿eli podana liczba
	 * wystêpuje wiêcej ni¿ jeden raz, to usuwane jest jedynie pierwsze jej
	 * wyst¹pienie;
	 */
	public void usunPierwszy(int usuwanyElement) {
		for (int i = 0; i < liczby.length; i++) {
			if (liczby[i] == usuwanyElement) {
				for (int j = i; j < liczby.length - 1; j++) {
					liczby[j] = liczby[j + 1];
				}
			}
		}
		rozmiar = rozmiar - 1;
	}

	private void przesunOjeden(int usuwanyIndex) {
		for (int i = usuwanyIndex; i < liczby.length - 1; i++) {
			liczby[i] = liczby[i + 1];
		}
	}

	/**
	 * • metodê usunPowtorzenia , która usuwa wszystkie powtórzenia elementów na
	 * liœcie, tzn. po jej wykonaniu na liœcie nie powinno byæ ¿adnych powtórzonych
	 * liczb;
	 */
	public void usunPowtorzenia() {
		for (int i = 0; i < rozmiar; i++) {
			for (int j = i + 1; j < rozmiar; j++) {
				if (liczby[i] == liczby[j]) {
					przesunOjeden(j);
					rozmiar = rozmiar - 1;
				}
			}
		}
		;
	}

	/**
	 * • metodê odwroc , która odwraca kolejnoœæ elementów przechowywanych na
	 * liœcie;
	 */
	public void odwroc() {
		;
	}
}
