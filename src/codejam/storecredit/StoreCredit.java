package codejam.storecredit;
import static  java.lang.Integer.parseInt;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StoreCredit {

	private static final String INPUT = "ressources\\A-large-practice.in";

	public static void main(String[] args) throws IOException {
		List<String> params = Files.readAllLines(Paths.get(INPUT));
		for (int i = 1, k = 1; i < params.size(); k++, i += 3) {
			int credit = parseInt(params.get(i));
			String[] prices = params.get(i + 2).split(" ");
			Output ouput = new Input(credit, prices).compute();
			ouput.print(k);
		}
	}

}
