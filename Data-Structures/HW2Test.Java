package hw2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HW2Test {
	private static final String[] data = { "book", "bookkeeper", "cover", "orange",
			"steal", "steel", "tan", "tangerine", "tangle", "vector"};
	private static MyString[] s1;
	private static MyString[] s2;
	private static MyString empty1 = new MyString("");
	private static MyString empty2 = new MyString("");

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void initAll() {
		s1 = new MyString[data.length];
		s2 = new MyString[data.length];
		for (int i = 0; i < data.length; i++) {
			s1[i] = new MyString(data[i]);
			s2[i] = new MyString(data[i]);
		}
	}
	
	// 5 points
	@Test
	public void test05EqualsEmpty() {
		assertTrue(empty1.equals(empty2));
		assertTrue(empty2.equals(empty1));
		MyString hello = new MyString("hello");
		assertFalse(empty1.equals(hello));
		assertFalse(hello.equals(empty1));
	}
	
	// 5 points
	@Test
	public void test05EqualsIdentical() {
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s1.length; j++) {
				if (i == j) {
					assertTrue(s1[i].equals(s1[j]));
				} else {
					assertFalse(s1[i].equals(s2[j]));
				}
			}
		}
	}
	
	// 10 points
	@Test
	public void test10Equals() {
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if (i == j) {
					assertTrue(s1[i].equals(s2[j]));
					assertTrue(s2[j].equals(s2[i]));
				} else {
					assertFalse(s1[i].equals(s2[j]));
					assertFalse(s2[j].equals(s2[i]));
				}
			}
		}
	}
	
	// 5 points
	@Test
	public void test05CompareToEmpty() {
		assertTrue(empty1.compareTo(empty2) == 0);
		assertTrue(empty2.compareTo(empty1) == 0);
		MyString hello = new MyString("hello");
		assertTrue(empty1.compareTo(hello) < 0);
		assertTrue(hello.compareTo(empty1) > 0);
	}
	
	// 5 points
	@Test
	public void test05CompareSingleLetters() {
		MyString a = new MyString("a");
		MyString b = new MyString("b");
		MyString y = new MyString("y");
		
		assertTrue(a.compareTo(b) < 0);
		assertTrue(a.compareTo(y) < 0);
		assertTrue(y.compareTo(a) > 0);
		assertTrue(y.compareTo(b) > 0);
		assertTrue(b.compareTo(a) > 0);
		assertTrue(b.compareTo(y) < 0);
	}
	
	// 10 points
	@Test
	public void test10CompareTo() {
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if (i < j) {
					assertTrue(s1[i].compareTo(s2[j]) < 0);
					assertTrue(s2[j].compareTo(s2[i]) > 0);
				} else if (i > j) {
					assertTrue(s1[i].compareTo(s2[j]) > 0);
					assertTrue(s2[j].compareTo(s2[i]) < 0);
				} else {
					assertTrue(s1[i].compareTo(s2[j]) == 0);
					assertTrue(s2[j].compareTo(s2[i]) == 0);
				}
			}
		}
	}
	
	@Test
	public void test05CharAtSingleLetter() {
		MyString a = new MyString("a");
		MyString b = new MyString("b");
		MyString y = new MyString("y");
		assertEquals('a', a.charAt(0));
		assertEquals('b', b.charAt(0));
		assertEquals('y', y.charAt(0));
	}
	
	// 15 points
	@Test
	public void test15CharAt() {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length(); j++)
				assertEquals(data[i].charAt(j), s1[i].charAt(j));
		}
	}
	
	// 5 points
	@Test
	public void test05LengthEmpty() {
		assertEquals(0, empty1.length());
		assertEquals(0, empty2.length());
	}
	
	// 5 points
	@Test
	public void test05LengthSingleLetter() {
		MyString a = new MyString("a");
		MyString b = new MyString("b");
		MyString y = new MyString("y");
		assertEquals(1, a.length());
		assertEquals(1, b.length());
		assertEquals(1, y.length());
	}
	
	// 10 points
	@Test
	public void test10Length() {
		for(int i = 0; i < data.length; i++) {
			assertEquals(data[i].length(), s1[i].length());
		}
	}
	
	//5 points
	@Test
	public void test05IndexOfEmpty() {
		for(char c = 'a'; c <= 'z'; c++) {
			assertEquals(-1, empty1.indexOf(c));
		}
	}
	
	// 5 points
	@Test
	public void test05IndexOfSingleLetter() {
		MyString a = new MyString("a");
		MyString b = new MyString("b");
		MyString y = new MyString("y");
		assertEquals(0, a.indexOf('a'));
		assertEquals(0, b.indexOf('b'));
		assertEquals(0, y.indexOf('y'));
	}
	
	// 10 points
	@Test
	public void test10IndexOf() {
		for(char c = 'a'; c <= 'z'; c++) {
			for(int i = 0; i < data.length; i++) {
				assertEquals(data[i].indexOf(c), s1[i].indexOf(c));
			}
		}
	}
}
