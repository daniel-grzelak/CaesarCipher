
public class Main {

	public static void main(String[] args) {

		String napis = "ABCDWUWZ";
		System.out.println(napis);
		int k1 = 5;

		k1 = k1 % 26;

		StringBuilder sb = new StringBuilder(napis);

		napis = sb.toString();

		int k = 0;
		for (int i = 0; i < sb.length(); i++) {
			char z = (char) (sb.charAt(i) + k);
			k = k1;
			if (z > 'Z') {

				int diff = 'Z' - sb.charAt(i);
				k -= diff;

				k--;

				char poSzyfr = (char) ('A' + k);
				sb.setCharAt(i, (char) ('A' + k));
			} else {
				char poSzyfr = (char) (sb.charAt(i) + k);
				sb.setCharAt(i, (char) (sb.charAt(i) + k));
			}
		}

		napis = sb.toString();
		System.out.println(napis);

	}

}
