package Main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Testint {
	
	private double failureTolerance = 0.9999;

	@Test
	public void testDistanceBetweenTwoPoints() {
		
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 10);
		
		double expected = 10.0;
		assertEquals(expected, point1.distance(point2), failureTolerance);
	}
	
	@Test
	public void testRouteDistance2() {
		
		Route route = new Route();
		route.addPoint(7, 7);
		assertEquals(0, route.getLength(), failureTolerance);
		
		route.addPoint(40, 40);
		route.addPoint(-7, -7);
		route.addPoint(1, 0);
		assertEquals(123, route.getLength(), failureTolerance);
		
		route.removePoint(1);
		assertEquals(30, route.getLength(), failureTolerance);
		
		route.addPoint(40, 40, 1);
		assertEquals(123, route.getLength(), failureTolerance);
	}
}