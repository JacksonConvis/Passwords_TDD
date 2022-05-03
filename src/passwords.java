import java.util.ArrayList;

public class passwords {
	public static ArrayList<String> passwordsList = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passwordsList.add("Password66");
		passwordsList.add("PasswordTest");
		passwordsList.add("PasswordTest11");
		passwordsList.add("QualityPassword66");
		passwordsList.add("Quality Password77");
		passwordsList.add("QualityPassword77");
		passwordsList.add("mod");
		passwordsList.add("admin");

	}

	public static boolean addPassword(String pwd) {
		if (preexistingPassword(passwordsList, pwd) == true && lengthCheck(pwd) == true && numCheck(pwd) == true
				&& spaceCheck(pwd) == true && capitalVowels(pwd) == true) {
			passwordsList.add(pwd);
			return true;
		} else
			return false;
	}

	public static boolean lengthCheck(String pwd) {
		if (pwd.length() >= 7 && pwd.length() <= 12) {
			return true;
		}
		return false;
	}

	public static boolean preexistingPassword(ArrayList<String> passwords, String pwd) {
		if (!passwords.contains(pwd)) {
			return true;
		} else
			return false;
	}

	public static boolean numCheck(String pwd) {

		if (pwd.contains("1") || pwd.contains("2") || pwd.contains("3") || pwd.contains("4") || pwd.contains("5")
				|| pwd.contains("7") || pwd.contains("8") || pwd.contains("9")) {
			return true;
		} else
			return false;

	}

	public static boolean spaceCheck(String pwd) {
		if (!pwd.contains(" ")) {
			return true;
		} else
			return false;
	}

	public static boolean capitalVowels(String pwd) {
		int vowelcount = 0;
		for (int i = 0; i < pwd.length(); i++) {
			if ((pwd.charAt(i) == 'A') || (pwd.charAt(i) == 'E') || (pwd.charAt(i) == 'I') || (pwd.charAt(i) == 'O')
					|| (pwd.charAt(i) == 'U') || (pwd.charAt(i) == 'Y')) {
				vowelcount++;
				if (vowelcount >= 2) {
					return true;
				}

			}
		}
		return false;
	}

	public static boolean specialCases(String pwd) {
		if (pwd.equalsIgnoreCase("mod")) {
			return true;
		} else if (pwd.equalsIgnoreCase("admin")) {
			return true;
		} else
			return false;
	}

}
