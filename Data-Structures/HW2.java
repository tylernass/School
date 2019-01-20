package hw2;

/**
 * 
 * A class that mimics how Java's String class behaves.
 *
 */
public class MyString {
	private char[] data;
	private String string;

	/**
	 * Construct a <code>MyString</code> object to represent the text in
	 * <code>string</code>
	 * @param string the <code>String</code> we are representing.
	 */
	public MyString(String string) {
		this.string = string;
	}

	/**
	 * A lexicographical comparison of <code>this Mystring</code> to <code>other</code>.
	 * The comparison is case sensitive, meaning it might not return the correct answer
	 * if the text being compared isn't all the same case.
	 * 
	 * @param other the <code>MyString<code> to compare against.
	 * @return a negative number if <code>this</code> appears before <code>other</code>
	 * in the dictionary, a positive number if <code>this</code> appears after
	 * <code>other</code> in the dictonary, and 0 if <code>this</code> and <code>other</code>
	 * represent the same <code>String</code>
	 */
	// Are we supposed to compare other to String "string"
	public int compareTo(MyString other) {
		if(other.equals(string)) {
			return 1;
		}
		return 0;
	}
	// 
	public char charAt(int i) {
		char x = string.charAt(i);
		return x;
	}

	public int length() {
		int lng = string.length();
		return lng;
	}
	// What should I return for index 0? 0 or 1?
	// What do I return if false?
	public int indexOf(char c) {
		int indx = 0;
		for(int i=0; i< string.length(); i++)
		{
			char x = string.charAt(i);
			if(c.equals(x)) {
				indx = i;
				return indx;
			}
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO
		return false;
	}
}
