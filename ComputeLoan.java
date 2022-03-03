package FirstTerm;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner girdi= new Scanner(System.in);
System.out.println("yıllık faiz oranını gir ör, 4.5");
double yıllıkfaizoranı=girdi.nextDouble();
System.out.println("kaç yılda ödemek istiyorsun ör, 5");
int yıl=girdi.nextInt();
System.out.println("borç alınacak miktar");
double borçmiktarı =girdi.nextDouble();
double aylıkfaizoranı=yıllıkfaizoranı/1200;
double aylıködememiktarı=(borçmiktarı*aylıkfaizoranı)/(1-(1/Math.pow(aylıkfaizoranı,yıl*12)));
double toplamborç=aylıködememiktarı*12*yıl;
System.out.println("aylık ödeme miktarı:"+(int)(aylıködememiktarı*100)/100.0);
System.out.println("toplam ödenecek miktar :"+(int)(toplamborç*100)/100.0);
	}

}
