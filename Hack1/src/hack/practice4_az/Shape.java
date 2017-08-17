package hack.amazon;

//inheritance and abstraction
public interface Shape {

	public static final double PI = 3.14;

	public double calculateArea();

	public double calculatePerimeter();
}

class Circle implements Shape {

	// Encapsulation: setters/getters/ private variable
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	// overloading and overriding (Polymorphism)
	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

	public double calculatePerimeter(double dimeter) {
		return PI * dimeter;
	}

}

// abstraction
class Quadrilateral {
	public double getSemiperimeter() {
		return 10.2;
	}
}

class Rectangle extends Quadrilateral implements Shape {

	private double length;
	private double width;

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}

	public double getSemiperimeter() {
		return length + width;
	}

}
