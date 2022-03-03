package FirstTerm;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" vergisiini öğrenmek istedğiniz fiyat gir");
		int sayi;
		Scanner girdi = new Scanner(System.in);
		sayi = girdi.nextInt();
		System.out.println("girdğğiniz fiyatın vergisi :" + sayi * 0.06);
		System.out.println("alternatif 1");
		System.out.println("girdiğiniz fiyatın vergisi :" + (int) (sayi * 0.06 * 100) / 100.0);
		System.out.println("alternatif 2");
		System.out.printf("girdiğiniz fiyatın vergisi : %2.2f", sayi * 0.06);  
		girdi.close();
	}

}
