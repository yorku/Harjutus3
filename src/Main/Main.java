package Main;

public class Main {

	public static void main(String[] args) {

		Controller controller = new Controller();
		controller.create_route();
		controller.addPoint(10, 10, 0);
		controller.addPoint(16, 11, 1);
		controller.addPoint(new Point(11, 11));
		System.out.println(controller.getLength());
	}
}