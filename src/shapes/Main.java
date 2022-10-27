package shapes;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//choose options on menu
		System.out.println("What would you like to do?");
		System.out.println("1.Make shape");
		System.out.println("2.Be given shape");
		System.out.println("3.Quit");
		int choice=in.nextInt();
		while(choice==2||choice==1) {
		//Decide what shape to make
		if (choice==1) {
			System.out.println("What shape would you like to make?");
			System.out.println("1.Rectangle/Square");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			int choiceMake=in.nextInt();
			
		}
		//decide what chape to print
		if (choice==2) {
			System.out.println("What shape would you like to print?");
			System.out.println("1.Rectangle/Square");
			System.out.println("2.Triangle");
			System.out.println("3.Circle");
			int choiceShape=in.nextInt();
		}
		}
		//if neither conditions are fulfilled, exit the program 
		if(choice==3) {
			System.out.println("We hope you have had a good time with our program! Goodbye!");
			System.exit(0);
		}
		
		
		
		
		
		
		in.close();
	}

}
