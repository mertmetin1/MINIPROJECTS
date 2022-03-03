package FirstTerm;

import java.util.Scanner;

public class GratestCommonDivisor {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
System.out.println("en böyük ortak bölenin hesaplamak istedğin ilk tam sayıyı gir ");
int ilksayi=girdi.nextInt();
System.out.println("ikinci sayıyı gir");
int ikincisayi=girdi.nextInt();
int gcd=1;
int k=2;
while(k<=ilksayi&&k<=ikincisayi) {
	if(ilksayi%k==0&&ikincisayi%k==0) {
		gcd=k;}
	k++;
	System.out.println(" obeb "+ilksayi+" ve "+ikincisayi+" = "+gcd);
}

	}

}
