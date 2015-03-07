public class Rand {
	public static void main(String[] args) {
		try {
			System.out.print((Math.random()));
			System.out.print(",");
			System.out.print((Math.random()));
			if (Math.random() > 0.8) {
				if (Math.random() > 0.5) {
					if (Math.random() > 0.8) {
						System.out.print(",attack,none");
					} else {
						System.out.print(",double,none");
					}
				} else {
					if (Math.random() > 0.8) {
						System.out.print(",none,attack");
					} else {
						System.out.print(",none,double");
					}
				}
			}
			System.out.println();
		} catch (Exception e) {
		}
	}
}
