package task10;

public class Circle {

private double radius;
	
	public Circle() {
		
		
	}
	
	
	public Circle(double radius) {
		
		this.radius=radius;
		
		
	}
	
	public double calculateCircumference() {
        return 2*3.4*radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("The circumference of the circle is: " + circle.calculateCircumference());
    }
}