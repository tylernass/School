package hw3;

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;

/**
 * A class that models a bounding ball
 */
public class Ball{
	// Minimum and maximum x and y values for the screen
	private static double minX;
	private static double minY;
	private static double maxX;
	private static double maxY;

	private Point center;
	private double radius;
	// Every time the ball moves, its x position changes by vX;
	private double vX;
	// Every time the ball moves, its y position changes by vY;
	private double vY;
	private Color color;

	
	/**
	 * Sets the minimum and maximum x and y values of the screen on which the balls appear.
	 * The bottom left of the screen is at (<code>minX</code>, <code>minY</code>) while the
	 * top right is at (<code>maxX</code>, <code>maxY</code>).
	 * @param minX the leftmost x value
	 * @param minY the bottommost y value
	 * @param maxX the rightmost x value
	 * @param maxY the topmost y value
	 */
	public static void setScreen(double minX, double minY, double maxX, double maxY) {
		Ball.minX = minX;
		Ball.minY = minY;
		Ball.maxX = maxX;
		Ball.maxY = maxY;
	}
	
	/**
	 * Constructs a ball.
	 * @param centerX the x coordinate of the center of the ball
	 * @param centerY the y coordinate of the center of the ball
	 * @param r the radius of the ball
	 * @param vX the velocity of the ball along the x-axis
	 * @param vY the velocity of the ball along the y-axis
	 * @param col the color of the ball
	 */
	// public Ball(double centerX, double centerY, double r, double vX, double vY, Color col)
	public Ball(double centerX, double centerY, double r, double vX, double vY, Color col) {
		center = new Point(centerX, centerY);
		radius = r;
		this.vX = vX;
		this.vY = vY;
		color = col;
	}
	
	/**
	 * Moves the ball (changes its position) by vX along the x-axis
	 * and by vY along the y-axis.  Additionally, if the ball has
	 * reached one of the edges of the screen it changes the velocity
	 * to reflect that the ball has bounced off the edge.
	 */
	public void move() {
		double centerX = center.getX();
		double centerY = center.getY();
		// Detect edge collisions
		if((centerX+radius) >= maxX || (centerX-radius) <= minX)
		{
			vX = -vX;
			if(centerX >= maxX) {
				centerX = 400;
			}
			if(centerX <= minX) {
				centerX = 0;
			}
//			centerX = centerX + (vX*centerX);
		}
		if((centerY+radius) >= maxY || (centerY-radius) <= minY)
		{
			vY = -vY;
			if(centerY >= maxY) {
				centerY = 400-radius;
			}
			if(centerY <= minY) {
				centerY = 0+radius;
			}
		}
		centerX = centerX + vX;
		centerY = centerY + vY;
		center.moveTo(centerX, centerY);
	}
	
	/**
	 * Determines if <code>this</code> has collided with <code>b2</code>.
	 * @param b2 the other <code>Ball</code>
	 * @return <code>ture</code> if <code>this</code> has collided with
	 * <code>b2</code>.
	 */
	public boolean collision(Ball b2) {
		// Call distance fucntion from Point class
		// distance(Point p2)
		
		if(this.center.distance(b2.center) <= (this.radius + b2.radius)) {
			
			return true;
		}
		return false;
//		double x = Math.abs(this.center.getX() - b2.center.getX());
//		double y = Math.abs(this.center.getY() - b2.center.getY());
//		if((this.radius + b2.radius) >= (x + y))
//		{
//			return true;
//		}
//		return false;
	}
	
	/**
	 * Draws the <code>Ball</code> on the screen.
	 */
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(center.getX(), center.getY(), radius);
	}

	public static int length() {
		return 0;
	}
}
