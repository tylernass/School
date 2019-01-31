package hw3;

/**
 * A class to that models a 2D point.
 */
public class Point {
	private double x;
	private double y;

	/**
	 * Construct the point (<code>x</code>, <code>y</code>).
	 * @param x the <code>Point</code>'s x coordinate
	 * @param y the <code>Point</code>'s y coordinate
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Move the point to (<code>newX</code>, <code>newY</code>).
	 * @param newX the new x coordinate for this <code>Point</code>.
	 * @param newY the new y coordinate for this <code>Point</code>.
	 */
	public void moveTo(double newX, double newY) {
//		newX = Math.random()*(400-x);
//		newY = Math.random()*(400-y);
		x = newX;
		y = newY;
	}

	/**
	 * Returns the point's x coordinate
	 * @return the point's x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * Returns the point's y coordinate
	 * @return the point's y coordinate
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Returns the distance between <code>this Point</code> and the <code>Point p2</code>
	 * @param p2 the other <code>Point</code>
	 * @return the distance between <code>this Point</code> and the <code>Point p2</code>
	 */
	public double distance(Point p2) {
		//TODO - This code is wrong and needs to be changed
		// Fix this up
		double x1 = this.x;
		double y1 = this.y; // p2.getY()
		double x2 = p2.x;
		double y2 = p2.y;
		double dist = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return dist;
	}
}

