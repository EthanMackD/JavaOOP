package ie.atu.sw;

public class PatternMatcher {
	
	record Point(int x, int y) {} 
	record Circle(Point centre, int radius) {} 
	record Rectangle(Point topLeft, Point bottomRight) {} 
	
	public static double area(Object shape) {
		
		return switch(shape) {
			case Circle(Point centre, int radius) -> Math.PI * radius * radius;
			case Rectangle(Point (int x1, int y1), Point (int x2, int y2)) -> Math.abs((x2 - x1) * (y2 - y1));
			case Point(int x, int y) -> 0.0;
			default -> throw new IllegalArgumentException("No such shape");
		};
	}
}
