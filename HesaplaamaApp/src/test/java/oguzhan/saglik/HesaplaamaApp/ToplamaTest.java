package oguzhan.saglik.HesaplaamaApp;
import static org.junit.Assert.assertEquals;

import org.junit.*;
@SuppressWarnings(ToplamaTest.UNUSED)
public class ToplamaTest {
	static final String UNUSED = "unused";

	@Test
public void testPozitifSayiToplama() {
		Hesap toplama = new	Toplama();
		String sayi1="200";
		String sayi2="20000";
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		assertEquals("20200",sonuc);
}
	
	@Test
public void testNegatifSayiToplama() {
		Hesap toplama = new	Toplama();
		String sayi1="-200";
		String sayi2="-20000";
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		assertEquals("-20200",sonuc);
}
}
