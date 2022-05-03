import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class passwordsTests {

	@Test
	void lengthTest() {
		boolean expected = true;
		boolean actual = passwords.lengthCheck("Legolas");
		assertEquals(expected, actual);
	}
	@Test
	void lengthTest2() {
		boolean expected = true;
		boolean actual = passwords.lengthCheck("LegolasIsANiftyElf");
		assertNotEquals(expected, actual);
	}
	@Test
	void listTest() {
		ArrayList<String> passwordsList = new ArrayList<String>();
		passwordsList.add("Password66");
		boolean expected = false;
		boolean actual = passwords.preexistingPassword(passwordsList, "Password66");
		assertEquals(expected, actual);
	}
	@Test
	void listTest2() {
		ArrayList<String> passwordsList = new ArrayList<String>();
		passwordsList.add("Password67");
		boolean expected = true;
		boolean actual = passwords.preexistingPassword(passwordsList, "Password66");
		assertEquals(expected, actual);
	}
	@Test
	void numTest() {
		boolean expected = true;
		boolean actual = passwords.numCheck("Password9");
		assertEquals(expected, actual);
	}
	@Test
	void numTest2() {
		boolean expected = false;
		boolean actual = passwords.numCheck("Password6");
		assertEquals(expected, actual);
	}
	@Test
	void spaceTest() {
		boolean expected = false;
		boolean actual = passwords.spaceCheck("thisisa Password");
		assertEquals(expected, actual);
	}
	@Test
	void spaceTest2() {
		boolean expected = true;
		boolean actual = passwords.spaceCheck("thisisaPassword");
		assertEquals(expected, actual);
	}
	@Test 
	void capitalVowelsTest() {
		boolean expected = true;
		boolean actual = passwords.capitalVowels("Password");
		assertNotEquals(expected, actual);
	}
	@Test 
	void capitalVowelsTest2() {
		boolean expected = true;
		boolean actual = passwords.capitalVowels("pAsswOrd");
		assertEquals(expected, actual);
	}
	@Test
	void modTest() {
		boolean expected = true;
		boolean actual = passwords.specialCases("mod");
		assertEquals(expected, actual);
	}
	@Test
	void adminTest() {
		boolean expected = true;
		boolean actual = passwords.specialCases("admin");
		assertEquals(expected, actual);
	}

}
