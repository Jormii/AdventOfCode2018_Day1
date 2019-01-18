import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		int frequency = 0;
		BufferedReader br = new BufferedReader(new FileReader("./src/input"));

		try {
			String frecuencyChange = br.readLine();

			while (frecuencyChange != null) {
				frequency += Integer.parseInt(frecuencyChange);
				frecuencyChange = br.readLine();
			}
		} finally {
			br.close();
		}
		System.out.format("Resulting frequency: %d\n", frequency);
	}
}
