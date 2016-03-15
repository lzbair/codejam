package codejam.storecredit;

public class Input {

	private final int credit;
	private final String[] prices;

	public Input(int credit, String[] prices) {
		this.credit = credit;
		this.prices = prices;
	}

	public Output compute() {
		Buffer buffer = new Buffer();
		for (int j = 0; j < prices.length; j++) {
			int v1 = Integer.parseInt(prices[j]);
			int v2 = credit - v1;
			if (v2 >= 0 && buffer.at(v2) != 0) {
				return new Output(j + 1, buffer.at(v2));
			}
			buffer.set(v1, j + 1);
		}
		return Output.EMPTY;
	}

}
