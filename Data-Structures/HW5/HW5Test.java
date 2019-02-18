package hw5;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HW5Test {

	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test() {
		Integer[] data = new Integer[10];
		for(int i = 0; i < data.length; i++)
			data[i] = new Integer(i);
		GeneralizedQueue<Integer> gq = new GeneralizedQueue<Integer>();
		for(int i = 0; i < data.length; i++) {
			gq.insert(data[i]);
		}
		// gq = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		assertEquals(data[1], gq.delete(2));  // deletes 2nd item
		// gq = 0, 2, 3, 4, 5, 6, 7, 8, 9
		assertEquals(data[3], gq.delete(3));  // deletes 3rd item
		// gq = 0, 2, 4, 5, 6, 7, 8, 9
		assertEquals(data[5], gq.delete(4));  // deletes 4th item
		// gq = 0, 2, 4, 6, 7, 8, 9
	}

}
