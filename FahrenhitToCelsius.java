package FirstTerm;
import java.util.Scanner;
public class FahrenhitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("fahrenheit değeri gir");
		Scanner girdi = new Scanner(System.in);
		double fahrenayt =girdi.nextDouble();
		double a = (fahrenayt-32)*5/9;
		System.out.println(fahrenayt+" fahrenheit ="+ a+" Celsius");
	}

}
