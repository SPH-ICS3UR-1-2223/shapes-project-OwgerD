package shapes;

public class Rectangle {
	//fields
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	//methods
	public Rectangle() {
		this.length=1;
		this.width=1;
		this.area=findArea();
		this.perimeter=findPerimeter();
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
		this.perimeter=this.length*2+this.width*2;
		return perimeter;
	}
	
	private double findArea() {
		area=length*width;
		return this.area;
	}
	
	public void printStats() {
		System.out.println("Rectangle");
		System.out.println("Width="+this.width);
		System.out.println("Length="+this.length);
		System.out.println("Perimeter="+this.perimeter);
		System.out.println("Area="+this.area);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		this.area = findArea();
		this.perimeter = findPerimeter();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		this.area = findArea();
		this.perimeter = findPerimeter();
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
}
