package hw4;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MyTest {
	
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void toyTest() {
		/*
		 * This test
		 * 1. Instantiates a StringQueue
		 * 2. Verifies size and isEmpty
		 * 3. Inserts 2 items.
		 * 4. Verifies size and isEmpty
		 * 5. Removes 2 items verifying the items removed
		 * 6. Tests size and isEmpty
		 */
		StringQueue q = new StringQueue();
		assertTrue(q.isEmpty());
		assertEquals(0, q.size());
		q.enqueue("apple");
		q.enqueue("box");
		assertFalse(q.isEmpty());
		assertEquals(2, q.size());
		assertEquals("apple", q.dequeue());
		assertEquals("box", q.dequeue());
		assertTrue(q.isEmpty());
		assertEquals(0, q.size());
	}
	
	@Test
	public void testMixedSequence() {
		// Create your own test that tests a more complex sequence of enqueue and dequeue.
		// Make sure your test sequence inserts and removes items after fully emptying out
		// the queue as well as after partially emptying out the queue.
	}
	
	@Test
	public void testMultipleQueues() {
		// Create a test that instantiates two queues and verifies they don't interfere with
		// each other.  Again, use a complex sequence of enqueue, dequeue, and size operations
		// on each of the two queues.
	}

}
