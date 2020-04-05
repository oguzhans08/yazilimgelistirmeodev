package oguzhan.saglik.HesaplaamaApp;

public class HesaplamaaApp {
public static void main(String[] args) {
	Hesap toplama = new	Toplama();
	String sonuc = toplama.sonucuBul("50", "1390000");
	System.out.println(sonuc);
}
}
