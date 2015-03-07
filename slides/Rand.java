public class Rand {
	public static void main(String[] args) {
		try {
			System.out.print((Math.random()));
			System.out.print(",");
			System.out.print((Math.random()));
			if (Math.random() > 0.8) {
				if (Math.random() > 0.5) {
					System.out.print(",attack,none");
				} else {
					System.out.print(",none,attack");
				}
			}
			System.out.println();
		} catch (Exception e) {
		}
	}
}
