package FirstTerm;
import java.util.Scanner;
public class FutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double ücret=10000;
int yıl =0;
do {
	ücret*=1.07;   //ücret=ücret*1.07;  
        yıl++;
}while(yıl<11);
System.out.println("ödenecek ücret :"+(int)(ücret*100)/100.0);
System.out.println(yıl);

	}

}
