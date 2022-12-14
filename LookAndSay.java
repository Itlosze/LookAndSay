
public class LookAndSay {

	public static void main(String[] args) {
		String result = "1";
		for (int i = 0; i < 10; i++) {
			System.out.println(result);
			result = lookAndSay(result);
		}
	}

	public static String lookAndSay(String num) {
		if (num == null || num.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int firstCharPos = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(firstCharPos) != num.charAt(i)) {
				String digitsTotal = num.substring(firstCharPos, i);
				sb.append(digitsTotal.length()).append(num.charAt(firstCharPos));
				firstCharPos = i;
			}
		}
		sb.append(num.substring(firstCharPos, num.length()).length()).append(num.charAt(firstCharPos));
		return sb.toString();
	}

}
