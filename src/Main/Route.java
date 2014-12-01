package Main;

import java.util.ArrayList;
public class Route {
	
	public ArrayList<Point> points;
	
	public Route() {
		points = new ArrayList<Point>();
	}
	
	public void addPoint(double x, double y, int index) { 
		points.add(index, new Point(x, y)); 
	}
	
	public void addPoint(double x, double y){ 
		points.add(new Point(x, y));        
	}
	
	public void addPoint(Point point) { 
		points.add(point);                  
	}
	
	public void removePoint(int index) {
		if (index > 0 && index < points.size()) {
			points.remove(index);
		} else {
			System.out.println("Index out of bounds.");
		}
	}
	
	public double getLength() {
		double distance = 0;
		for (int i = 0; i < points.size() - 1; i++) {
			distance += points.get(i).distance(points.get(i + 1));
		}
		return distance;
	}
	
	public void printOut() {	
		for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}
	}
}