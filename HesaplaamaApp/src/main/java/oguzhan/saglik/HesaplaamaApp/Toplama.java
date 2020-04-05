package oguzhan.saglik.HesaplaamaApp;

import java.math.BigDecimal;

public class Toplama implements Hesap {

	public String sonucuBul(String sayi1, String sayi2) {
	
		return new BigDecimal(sayi1)
				.add(new BigDecimal(sayi2))
		        .toString();
	}

}
