package shapes;

public class Rectangle {
	//fields
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	//methods
	public Rectangle() {
		
	}
	
	public Rectangle(double side) {
		this.length=side;
		this.width=side;
	}
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
		this.perimeter= findPerimeter();
	}
	
	private double findPerimeter() {
		perimeter=length*2+width*2;
		return 0;
	}
	
	private double findArea() {
		area=length*width;
		return 0;
	}
	
	public void printStats() {
		System.out.println("Rectangle");
		System.out.println("Width="+this.width);
		System.out.println("Width="+this.length);
		System.out.println("Width="+this.perimeter);
		System.out.println("Width="+this.area);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
}
