package hw2;

/**
 * 
 * A class that mimics how Java's String class behaves.
 *
 */
public class MyString {
	private static final String String = null;
	private char[] data;

	/**
	 * Construct a <code>MyString</code> object to represent the text in
	 * <code>string</code>
	 * @param string the <code>String</code> we are representing.
	 */
	public MyString(String string) {
		data = new char[string.length() + 1];
		for(int i=0; i < string.length(); i++)
		{
			data[i] = string.charAt(i);
		}
//		this.string = string;
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

	public int compareTo(MyString other) {
		int i=0;
		while(this.data[i] == other.data[i])
		{
			if(i == this.length() && i == other.length())
			{
				return 0;
			}
			i++;
		}
		if(this.data[i] > other.data[i])
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	// 
	public char charAt(int i) {
		return data[i];
	}

	public int length() {
		int i=0;
		while(data[i] != 0)
		{
			i ++;
		}
		return i;
	}
	// What should I return for index 0? 0 or 1?
	// What do I return if false?
	public int indexOf(char c) {
		int i=0;
		while(data[i] != 0)
		{
			if(c == data[i]) {
				return i;
			}
			i++;
		}
		return -1;
	}

	@Override
	public boolean equals(Object obj) {
		MyString that = (MyString) obj;
		if(this.length() != that.length())
		{
			return false;
		}	
		for(int i=0; i<this.length(); i++)
		{
			if(this.data[i] != that.data[i]) {
				return false;
			}
		}
		return true;
	}
}
