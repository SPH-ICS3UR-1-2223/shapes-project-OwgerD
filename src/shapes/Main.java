package shapes;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//choose options on menu
		int choice;
		do {
		System.out.println("What would you like to do?");
		System.out.println("1.Make shape");
		System.out.println("2.Be shown a shape");
		System.out.println("3.Change a shape");
		System.out.println("4.Quit");
		choice=in.nextInt();
		
		//Decide what shape to make
		if (choice==1) {
			System.out.println("What shape would you like to make?");
			System.out.println("1.Rectangle/Square");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			int choiceMake=in.nextInt();
			
		}
		//decide what shape to print
		if (choice==2) {
			System.out.println("What shape would you like to see?");
			System.out.println("1.Rectangle/Square");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			int choiceShape=in.nextInt();
			if(choiceShape==1){
				Rectangle T= new Rectangle();
				T.printStats();
			}
			if(choiceShape==2) {
				Triangle T= new Triangle();
				T.printStats();
			}if(choiceShape==3) {
				Circle C= new Circle();
				C.printStats();
			}
				continue;
		}
		if (choice==3) {
			System.out.println("What shape do you want to change?");
			System.out.println("1.Rectangle/Square");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			int choiceEdit=in.nextInt();
			if(choiceEdit==1) {
				System.out.println("What would you loike to edit?");
				System.out.println("1.length");
				System.out.println("2.width");
				int choiceRectangleEdit=in.nextInt();
				if(choiceRectangleEdit==1) {
					Rectangle T= new Rectangle();
					T.setLength(in.nextInt());
				}if(choiceRectangleEdit==2) {
					Rectangle T= new Rectangle();
					T.setWidth(in.nextInt());
				}
			}
			if(choiceEdit==2) {
				System.out.println("What would you loike to edit?");
				System.out.println("1.sideA");
				System.out.println("2.sideB");
				System.out.println("3.sideC");
				int ChoiceTriangleedit=in.nextInt();
				if (ChoiceTriangleedit==1) {
					Triangle T= new Triangle();
					T.setSideA(in.nextInt());
				}if(ChoiceTriangleedit==2) {
					Triangle T= new Triangle();
					T.setSideB(in.nextInt());
				}if(ChoiceTriangleedit==3) {
					Triangle T= new Triangle();
					T.setSideC(in.nextInt());
				}
				continue;
			}
			if (choiceEdit==3) {
				System.out.println("Current radius is 1. What would you like to set the radius to?");
				Circle C= new Circle();
				C.setRadius(in.nextInt());
				C.printStats();
			}
		}
		continue;
		}while(choice<3);
		//if neither conditions are fulfilled, exit the program 
		if(choice==4) {
			System.out.println("We hope you have had a good time with our program! Goodbye!");
			System.exit(0);
		}else {
			System.out.println("ERROR, NO VALID OPTION, PROGRAM TERMINATED.");
			System.exit(0);
		}
		
		
		
		
		
		
		in.close();
	}

}
