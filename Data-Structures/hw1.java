package hw1;
import java.util.HashSet;
import java.util.Set;

public class HW1 {
	/**
	 * Returns the number of <code>String</code>s from <code>array</code> that begin
	 * with the character <code>c</code>.
	 * @param array the array of <code>String</code>s
	 * @param c the beginning character to look for
	 * @return the number of <code>String</code>s from <code>array</code> that begin
	 * with the character <code>c</code>
	 */
	public static int countBeginsWith(String[] array, char c) {
		int n=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i].charAt(0) == c)
			{
				n++;
			}
		}
		// Logic: Create a for loop that loops through every string in array. If a[0] = char c, then increment int n by 1
		return n;
	}
	
	/**
	 * Returns the first maximal length <code>String</code> in <code>array</code>.  (In other words,
	 * if more than one <code>String</code> tie for longest, the one appearing first in the array is
	 * returned.
	 * @param array an array of <code>String</code>s
	 * @return the first maximal length <code>String</code> in <code>array</code>.
	 */
	public static String longest(String[] array) {
		int x = 0;
		String l = "";
		for(int i=0; i<array.length; i++)
		{
			if(array[i].length() > x)
			{
				x = array[i].length();
				l = array[i];
				
			}
		}
		return l;
	}
	
	/**
	 * Returns the smallest String using lexicographical order.  It is case sensitive so for example, "Zoo" < "apple"
	 * @param array an array of <code>String</code>s
	 * @return the minimum <code>String</code> in lexicographical order.
	 */
	public static String min(String[] array) {
		String l = "";
		for(int i=0; i<array.length; i++)
		{
			if(i == 0)
			{
				l = array[i];
			}
			else
			{
				if(l.compareTo(array[i]) > 0)
				{
					l = array[i];
				}
			}
		}
		return l;
	}	
	
	/**
	 * Returns <code>true</code> if the array contains any duplicate <code>String</code>s and false otherwise.
	 * @param array an array of <code>String</code>s
	 * @return <code>true</code> if the array contains any duplicate <code>String</code>s and false otherwise.
	 */
	public static boolean containsDuplicate(String[] array) {
		Set<String> dup = new HashSet<String>();
		for(String i: array)
		{
			if(dup.contains(i)) return true;
			dup.add(i);
		}
		return false;
	}
	
	/**
	 * Returns the <code>String</code> with the leftmost occurence of the character <code>c</code>.  If more than one
	 * <code>String</code> qualifies, then the first such <code>String</code> is returned.  If there is no
	 * <code>String</code> that contains <code>c</code>, then the empty <code>String</code> is returned.
	 * @param array an array of <code>String</code>s.
	 * @param c the character to look for
	 * @return the <code>String</code> with the leftmost occurence of the character <code>c</code>.  If more than one
	 * <code>String<code> qualifies, then the first such <code>String</code> is returned.  If there is no
	 * <code>String</code> that contains <code>c</code>, then the empty <code>String</code> is returned.
	 */
	public static String leftmostOccurrence(String[] array, char c) {
		int lft =0;
		int x = array[0].length();
		String l = "";
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length(); j++)
			{
				if(array[i].charAt(j) == c)
				{
					if(j < x)
					{
						l = array[i];
					}
					if(j == x)
					{
						l = l;
					}
				}
			}
		}
		return l;
		// Logic: First detect if the character is in the string. Then, set the leftmost string.
		
	}
}
