package FirstTerm;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class fileTextinputOutput {
	public static void getFileInfo( ) {
		File file = new File ("C:\\Users\\90506\\Desktop\\textinout\\örnekdosya.txt");
		if(file.exists())
		{
			System.out.println("Dosya adı: "+ file.getName());
			System.out.println("Dosya yolu: "+ file.getAbsolutePath());
			System.out.println("Dosya yazılabilir mi: "+ file.canWrite());
			System.out.println("Dosya okunabilir mi: "+ file.canRead());
			System.out.println("Dosya boyutu (byte): "+ file.length());
		}
	}
	public static void readFile() {
		File file = new File ("C:\\Users\\90506\\Desktop\\textinout\\örnekdosya.txt");
		try 
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				String text = sc.nextLine();
				System.out.println(text);
			}
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter ("C:\\Users\\90506\\Desktop\\textinout\\örnekdosya.txt",true));
			writer.newLine();
			writer.write(str);
			System.out.println("Dosyaya yazıldı");
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
writeFile();
readFile();
getFileInfo();
	}

}
