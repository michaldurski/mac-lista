package mac.lista;

public class Lista {
	/**
	 * Klasa ta ma mieć następujące pola prywatne:
	 * 
	 */
	private int[] liczby; // – tablica, w której przechowywane będą liczby,
	private int pojemnosc; // – maksymalna liczba elementów, możliwych do przechowywania,
	private int rozmiar; // – aktualna liczba przechowywanych elementów.

	/**
	 * • konstruktor z parametrem określającym pojemność, który przydziela pamięć
	 * dla tablicy liczby oraz ustala wartości pozostałych pól klasy;
	 */
	Lista(int pojemnosc) {
		liczby = new int[pojemnosc];
		this.pojemnosc = pojemnosc;
		this.rozmiar = 0;
	}

	/**
	 * • metodę dodajElement , która przyjmuje dokładnie jeden element – liczbę
	 * całkowitą, która dodawana jest do listy; w przypadku, gdy lista jest pełna
	 * powinien zostać wyświetlony komunikat o błędzie;
	 */
	public String dodajElement(int nowyElement) {
		if (rozmiar >= pojemnosc) {
			return "pełna lista";
		}
		liczby[rozmiar] = nowyElement;
		rozmiar = rozmiar + 1;
		return "ok";
	}

	/**
	 * • metodę znajdz , której jedynym parametrem powinna być szukana liczba,
	 * natomiast wynikiem pozycja podanej liczby w liście (licząc od 0) lub -1, gdy
	 * liczby nie ma na liście;
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
	 * • bezparametrową metodę pisz , która wypisuje informacje o liście, w tym jej
	 * rozmiar, pojemność oraz listę przechowywanych elementów;
	 */
	public void pish() {
		for (int i = 0; i < rozmiar; i++) {
			System.out.print("[" + i + "]=" + liczby[i] + " ; ");
		}
		System.out.println("");
	}

	/**
	 * • metodę usunPierwszy , która usuwa pierwsze wystąpienie podanej jako
	 * parametr liczby, jeżeli znajduje się ona na liście, tzn. jeżeli podana liczba
	 * występuje więcej niż jeden raz, to usuwane jest jedynie pierwsze jej
	 * wystąpienie;
	 */
	public void usunPierwszy(int usuwanyElement) {
		for (int i = 0; i < liczby.length; i++) {
			if (liczby[i] == usuwanyElement) {
				przesunOjeden(i);
				rozmiar = rozmiar - 1;
				break;
			}
		}
	}

	private void przesunOjeden(int usuwanyIndex) {
		for (int i = usuwanyIndex; i < liczby.length - 1; i++) {
			liczby[i] = liczby[i + 1];
		}
	}

	/**
	 * • metodę usunPowtorzenia , która usuwa wszystkie powtórzenia elementów na
	 * liście, tzn. po jej wykonaniu na liście nie powinno być żadnych powtórzonych
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
	 * • metodę odwroc , która odwraca kolejność elementów przechowywanych na
	 * liście;
	 */
	public void odwroc() {
		int liczby1 []= new int[rozmiar];
		int j = 0;
		for( int i = liczby.length-1; i >=0; i--){
			liczby[i]= liczby1[j];
			j++;
		}
		liczby=liczby1;
	}
}
