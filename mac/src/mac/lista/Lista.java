package mac.lista;

public class Lista {
	/**
	 * Klasa ta ma mie� nast�puj�ce pola prywatne:
	 * 
	 */
	private int[] liczby; // � tablica, w kt�rej przechowywane b�d� liczby,
	private int pojemnosc; // � maksymalna liczba element�w, mo�liwych do przechowywania,
	private int rozmiar; // � aktualna liczba przechowywanych element�w.

	/**
	 * � konstruktor z parametrem okre�laj�cym pojemno��, kt�ry przydziela pami��
	 * dla tablicy liczby oraz ustala warto�ci pozosta�ych p�l klasy;
	 */
	Lista(int pojemnosc) {
		liczby = new int[pojemnosc];
		this.pojemnosc = pojemnosc;
		this.rozmiar = 0;
	}

	/**
	 * � metod� dodajElement , kt�ra przyjmuje dok�adnie jeden element � liczb�
	 * ca�kowit�, kt�ra dodawana jest do listy; w przypadku, gdy lista jest pe�na
	 * powinien zosta� wy�wietlony komunikat o b��dzie;
	 */
	public String dodajElement(int nowyElement) {
		if (rozmiar >= pojemnosc) {
			return "pe�na lista";
		}
		liczby[rozmiar] = nowyElement;
		rozmiar = rozmiar + 1;
		return "ok";
	}

	/**
	 * � metod� znajdz , kt�rej jedynym parametrem powinna by� szukana liczba,
	 * natomiast wynikiem pozycja podanej liczby w li�cie (licz�c od 0) lub -1, gdy
	 * liczby nie ma na li�cie;
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
	 * � bezparametrow� metod� pisz , kt�ra wypisuje informacje o li�cie, w tym jej
	 * rozmiar, pojemno�� oraz list� przechowywanych element�w;
	 */
	public void pish() {
		for (int i = 0; i < rozmiar; i++) {
			System.out.print("[" + i + "]=" + liczby[i] + " ; ");
		}
		System.out.println("");
	}

	/**
	 * � metod� usunPierwszy , kt�ra usuwa pierwsze wyst�pienie podanej jako
	 * parametr liczby, je�eli znajduje si� ona na li�cie, tzn. je�eli podana liczba
	 * wyst�puje wi�cej ni� jeden raz, to usuwane jest jedynie pierwsze jej
	 * wyst�pienie;
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
	 * � metod� usunPowtorzenia , kt�ra usuwa wszystkie powt�rzenia element�w na
	 * li�cie, tzn. po jej wykonaniu na li�cie nie powinno by� �adnych powt�rzonych
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
	 * � metod� odwroc , kt�ra odwraca kolejno�� element�w przechowywanych na
	 * li�cie;
	 */
	public void odwroc() {
		;
	}
}
