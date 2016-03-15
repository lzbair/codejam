package codejam.storecredit;
import static java.lang.Integer.valueOf;
import java.util.HashMap;
import java.util.Map;

public class Buffer {

	private final Map<Integer, Integer> values = new HashMap<>();

	public int at(int i) {
		Integer v = values.get(valueOf(i));
		return v != null ? v.intValue() : 0;
	}

	public void set(int i, int v) {
		values.put(valueOf(i), valueOf(v));
	}
	


}
