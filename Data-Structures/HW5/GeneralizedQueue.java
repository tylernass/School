package hw5;

public class GeneralizedQueue<Item> {
	

	/**
	 * Creates an empty queue.
	 */
	private Item[] a;
	private int n;
	public GeneralizedQueue() {
		a = (Item[]) new Object[10];
		n = 0;
	}
	
	/**
	 * Checks if the queue is empty
	 * @return <code>true</code> if the queue is empty
	 * and <code>false</code> otherwise.
	 */
	public boolean isEmpty() {
		return n == 0;
	}
	
	/**
	 * Add an item to the back of the queue.
	 * @param x the item to be addded to the queue
	 */
	public void insert(Item x) {
		if (n == a.length) System.out.println("Queue is full");
		a[n] = x;
        n++;
	}
	
	/**
	 * delete and return the kth least recently inserted item
	 * (the kth item "in line".)
	 * @param k indicates which position from the queue to be removed.
	 * The first item is in position 1.
	 * @return the kth oldest item in the queue
	 */
	public Item delete(int k) {
		Item item = a[k-1];
		for (int i=k; i < a.length-1; i++) {
		      a[i]= a[i+1];
		}
		n --;
		return item;
	}
}
