package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	
	//Methods
	public Triangle() {
		this.sideA=this.sideB=this.sideC=1;
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA=a;
		this.sideB=b;
		this.sideC=c;
	}
	private double findPerimeter() {
		perimeter=sideA+sideB+sideC;
		return this.perimeter;
	}
	
	private double findArea() {
		area=((this.sideA*this.sideB)/2);
		return this.area;
	}
	
	public void printStats() {
		System.out.println("Triangle");
		System.out.println("sideA="+this.sideA);
		System.out.println("sideB="+this.sideB);
		System.out.println("sideC="+this.sideC);
		System.out.println("Perimeter="+this.perimeter);
		System.out.println("Area="+this.area);
		
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
	
}
