package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	
	//Methods
	public Circle() {
		this.radius=1;
		this.circumference=findCircumference();
		this.area=findArea();
	}
	
	public Circle(double r) {
		this.radius=r;
		this.circumference=findCircumference();
		this.area=findArea();
	}
	
	private double findCircumference() {
		
		return 2*Math.PI*radius;
	}
	
	private double findArea() {
		area =Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public void printStats() {
		System.out.println("Circle");
		System.out.println("Radius:"+radius);
		System.out.println("Circumference:"+circumference);
		System.out.println("Area:"+area);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.circumference=findCircumference();
		this.area=findArea();
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}
