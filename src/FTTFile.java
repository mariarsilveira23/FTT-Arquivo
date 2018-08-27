import java.io.PrintWriter;
import java.util.Random;

public class FTTFile {
	public static void main(String[] args) {
		System.out.println("FTT File...");
		System.out.println(System.getProperty("user.dir"));
		Random rn = new Random();
		try {
			PrintWriter writer = new PrintWriter("jdados.csv", "UTF-8");
			int contador = 0;
			do {
				writer.println(contador +";" + rn.nextInt() + ";" + rn.nextFloat());
				contador++;
			} while (contador < 100);

			writer.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("FIM");

	}
}
