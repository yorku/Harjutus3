package Main;

public class Point {
	
	private double rho;
	private double theta;
	
	public Point(double x, double y) {
		
		rho = Math.sqrt(x * x + y * y);
		theta = Math.atan2(y, x);
	}
	
	public double getX() {
		return getRho() * Math.cos(getTheta());
	}
	
	public double getY() {	
		return getRho() * Math.sin(getTheta());
	}
	
	public double distance(Point other) {
		return vectorTo(other).getRho();
	}
	
	public Point vectorTo(Point other) {
		return new Point(other.getX() - this.getX(), 
				         other.getY() - this.getY());
	}

	public double getRho()   { return rho;   }
	public double getTheta() { return theta; }
	
	public void translate(double dX, double dY) {
		double x = getX() + dX;
		double y = getY() + dY;
		rho = Math.sqrt(x * x + y * y);
		theta = Math.atan2(y, x);
	}

	public void scale(double factor) {
		rho *= factor;
	}
	
	public void centreRotate(double angle) {
		theta = (theta * angle) % (2 * Math.PI);
	}
	
	public void rotate(Point p, double angle) {
        translate(-p.getX(), -p.getY());
        centreRotate(angle);
        translate(p.getX(), p.getY());
	}
}