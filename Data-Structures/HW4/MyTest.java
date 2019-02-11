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
		StringQueue r = new StringQueue();
		assertTrue(r.isEmpty());
		// FIFO
		r.enqueue("One");
		r.enqueue("Two");
		r.enqueue("Three");
		// One Two Three
		assertEquals("Three", r.dequeue()); // Should return FALSE
		assertEquals("One", r.dequeue()); // Should return true
		r.dequeue();
		// Two Three
		assertEquals("Two", r.dequeue());
		r.dequeue();
		// Three
		assertFalse(r.isEmpty());
		assertEquals(1, r.size()); // Should return TRUE
		r.enqueue("Four");
		r.enqueue("Five");
		r.enqueue("Six");
		r.enqueue("Seven");
		// Three Four Five Six Seven
		r.dequeue();
		// Four Five Six Seven
		assertEquals(3, r.size()); // Should return FALSE
		assertEquals("Four", r.dequeue());
		r.dequeue();
		r.dequeue();
		r.dequeue();
		// Seven
		assertTrue(r.isEmpty()); // Should return FALSE
		assertEquals(1, r.size()); // Should return TRUE
		r.dequeue();
		assertTrue(r.isEmpty()); // Should return TRUE
	}
	
	@Test
	public void testMultipleQueues() {
		
		// Pop Test
		StringQueue a = new StringQueue();
		StringQueue b = new StringQueue();
		a.enqueue("Bears");
		b.enqueue("Cubs");
		a.enqueue("Hawks");
		b.enqueue("Bulls");
		assertEquals("Bears", a.dequeue()); // Should return TRUE
		assertEquals("Bears", b.dequeue()); // Should return FALSE
		assertEquals("Bulls", b.dequeue()); // Should return FALSE
		assertEquals("CUBS", b.dequeue()); // Should return FALSE
		assertEquals("Cubs", b.dequeue()); // Should return TRUE
		
		// Size test
		assertEquals(3, a.size()); // False
		assertEquals(3, b.size()); // False
		assertEquals(2, a.size()); // True
		assertEquals(2, b.size()); // True
	
		
		// 
		a.enqueue("Rams");
		a.enqueue("Patriots");
		a.enqueue("Packers");
		a.enqueue("Chiefs");
		assertEquals(2, a.size()); // False
		assertEquals(6, a.size()); // True
		assertEquals(0, b.size()); // False
		assertEquals(2, b.size()); // True
		
		
		b.enqueue("Pistons");
		b.enqueue("Warriors");
		b.enqueue("Lakers");
		assertEquals(a.size(), b.size()); // False
		b.enqueue("Cavaliers");
		assertEquals(a.size(), b.size()); // True
		
		// a: Bears Hawks Rams Patriots Packers Chiefs
		// b: Cubs Bulls Pistons Warriors Lakers Cavaliers
		assertEquals("BeArS", a.dequeue()); // False
		assertEquals("Chiefs", a.dequeue()); // False
		assertEquals("Bears", a.dequeue()); // True
		a.dequeue();
		a.dequeue();
		a.dequeue();
		b.dequeue();
		b.dequeue();
		assertEquals(a.size(), b.size()); // False
		assertEquals(a.size()+1, b.size()); // True
		// a: Patriots Packers Chiefs
		// b: Pistons Warriors Lakers Cavaliers
		assertEquals("Warriors", b.dequeue()); // False
		assertEquals("Cavaliers", b.dequeue()); // False
		assertEquals("Pistons", b.dequeue()); // True
		assertEquals("Chiefs", a.dequeue()); // False
		assertEquals("Packers", a.dequeue()); // False
		assertEquals("Patriots", a.dequeue()); // True
		
		a.dequeue();
		a.dequeue();
		a.dequeue();
		
		b.dequeue();
		b.dequeue();
		b.dequeue();
		b.dequeue();
		
		assertTrue(a.isEmpty()); // True
		assertTrue(b.isEmpty()); // True
		// Dequeue
		
		// Another Pop test
		
		// Empty
		
		// Test empty
		
		// Create a test that instantiates two queues and verifies they don't interfere with
		// each other.  Again, use a complex sequence of enqueue, dequeue, and size operations
		// on each of the two queues.
	}

}
