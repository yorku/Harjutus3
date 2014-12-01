package Main;

public class Controller {

	private Route route;
	
	public void create_route() {
		route = new Route();
	}
	
	public void addPoint(double x, double y, int index){ 
		route.addPoint(x, y, index); 
	}
	
	public void addPoint(double x, double y){ 
		route.addPoint(x, y);        
	}
	
	public void addPoint(Point point){ 
		route.addPoint(point);       
	}
	
	public void removePoint(int index) {
		route.removePoint(index);
	}
	
	public double getLength() {
		return route.getLength();
	}
}