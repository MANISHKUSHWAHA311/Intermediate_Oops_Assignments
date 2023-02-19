package oopsAssignment;

class Rectangle5 extends Shape5{
	@Override
	public String draw() {
		return "Rectangle";
	}
}

class Line5 extends Shape5{
	@Override
	public String draw() {
		return "Line";
	}
}
class Cube5 extends Shape5{
	@Override
	public String draw() {
		return "Cube";
	}
}
abstract class Shape5{
	abstract public String draw();
}
public class Assignment2Q5{
	public static void main(String [] args) {
		
		Shape5 rectangle = new Rectangle5();
		System.out.println(rectangle.draw());
		
		Shape5 line = new Line5();
		System.out.println(line.draw());
		
		Shape5 cube = new Cube5();
		System.out.println(cube.draw());
		
	}
}