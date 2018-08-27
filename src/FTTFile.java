import java.io.PrintWriter;

public class FTTFile {
	public static void main(String[] args) {
		System.out.println("FTT File...");
		System.out.println(System.getProperty("user.dir"));
		try {
			PrintWriter writer = new PrintWriter("jdados.tsv", "UTF-8");
			int contador = 0;
			do {
				writer.println(contador);
				contador++;
			} while (contador < 100);

			writer.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("FIM");

	}
}
