package classroom;

import java.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		//TODO variables 101
		
		//int a;//deckaration	
		//a=5;// assignment
		
//		int a=123;//initialization
//		System.out.println("x");
//		System.out.println("my number is: "+a);
		
		//String name = "bro";
		
		//TODO swap two variables 102
		
//		String x = "water";
//		String y = "kool-aid";
//		String tamp ;
//		
//		tamp=x;
//		x=y;
//		y=tamp;
//		
//		
//		System.out.println("x: "+x);
//		System.out.println("y: "+y);
		
		//TODO user input 103
		
//		
//		
//		Scanner scanner =new Scanner(System.in);
//		
//		System.out.println("what is your name");
//		String name = scanner.nextLine();
//		
//		System.out.println("how old are you");
//		int age = scanner.nextInt();
//		
//		System.out.println("favor food");
//		String food = scanner.nextLine();
//		scanner.nextLine();
//		
//		System.out.println("hello "+ name);
//		System.out.println("you are "+ age + "years old");
//		
		
		
		
		//TODO expressions
		
//		int friends = 10 ;
//		friends++;
//		
//
//		
//		System.out.println(friends);
		
		
		
		//TODO GUI
		
//		String name = javax.swing.JOptionPane.showInputDialog("enter your name");
//		javax.swing.JOptionPane.showMessageDialog(null, "hello "+name);
//		
//		
//		int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("enter your age"));
//		javax.swing.JOptionPane.showMessageDialog(null, "you are "+age+" years old");
//		
//		
//		Double height = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("enter your heiht"));
//		javax.swing.JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");
		
		
//		//TODO Math class 
//		
//		double x;
//		double y;
//		double z;
//	    Scanner scanner =new Scanner(System.in);
//	    
//	    System.out.println("enter side x:");
//	    x= scanner.nextDouble();
//	    System.out.println("enter side y");
//	    y= scanner.nextDouble();
//	    
//	    z = Math.sqrt((x*x)+(y*y));
//	    
//		System.out.println("the hypotenuse is:"+z);
//		scanner.close();
		
		//TODO  random numbers 
		
		
		//Random random =new Random();
		
		//int x = random.nextInt(6)+1;
		//Double y=random.nextDouble();
		
		//System.out.println(y);

		
		
		
//		//TODO  if statements 
//		
//		
//		int age = 80 ;
//		
//		if (age>18) {
//			
//		    System.out.println("adult!");
//		}
//		else if(age>=75){
//			System.out.println("boomer");
//		}
//			
//		else {
//			System.out.println("kid");
//		}
			
		
		
//		//TODO  switches 
//		
//		
//		String day= "sina";
//		switch(day) {
//		case "sunday":System.out.println("it  is sunday ");
//		break;
//		case "monday":System.out.println("it  is monday ");
//		break;
//		case "Friday":System.out.println("it  is Friday ");
//		break;
//		default:System.out.println("not a day ");
//		}
//		
		//TODO  logical operators 
		
//		
//		int tamp = 26;
//		if(tamp>30) {
//			System.out.println("hot out side");
//		}
//		else if (tamp>=20 && tamp<=30 ){
//			System.out.println("warm out side ");
//		}
//		else 
//		{
//			System.out.println("cold out side ");
//		}
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("you play game  press q for quit");
		String response = scanner.next();
		
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("you quit game ");
		}
		else {
			System.out.println("you palying game ");
		}
		
	}

}
