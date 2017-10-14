/**
 * 
 */
package mac.lista;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author T420
 *
 */
public class ListaTest {

	@Test
	public void test() {
		Lista s = new Lista(9);
		piszLn(s.dodajElement(0));
		s.dodajElement(1);
		s.dodajElement(2);
		s.dodajElement(3);
		s.dodajElement(4);
		s.pish();
		s.dodajElement(5);
		s.dodajElement(6);
		s.dodajElement(7);
		piszLn(s.dodajElement(8));
		piszLn(s.dodajElement(9));
		s.usunPierwszy(4);
		s.pish();
		piszLn(s.dodajElement(1));
		s.pish();
		s.usunPowtorzenia();
		s.pish();
		
		assertEquals("msg", "", "");
	}
	
	private void piszLn(String s){
		System.out.println(s);
	}
	

}
