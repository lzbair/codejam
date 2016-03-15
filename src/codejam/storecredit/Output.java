package codejam.storecredit;

public class Output {

	public static final Output EMPTY = new Output(0, 0);
	private final int v1;
	private final int v2;

	public Output(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public void print(int k) {
		System.out.print("Case #" + k + ": ");
		System.out.println(Math.min(v1, v2) + " " + Math.max(v1, v2));
	}

}
