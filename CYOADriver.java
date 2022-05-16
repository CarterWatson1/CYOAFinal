package finalProjectCYOA;
import java.util.*;
public class CYOADriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//initialize booleans
		boolean con = true;
		boolean again = true;
		
		//while loop
		while(again) {
		
		//create character
		System.out.println("Hello! What is your name?");	
		String name = input.next().toLowerCase();
		System.out.println("Are you a knight or a samurai? (Type in knight or samurai)");
		String type = input.next().toLowerCase();
		while(!(type.equals("knight")||type.equals("samurai"))) {
			System.out.println("Sorry, you put in a word that is not knight or samurai. Try again?");
			type = input.next().toLowerCase();
		}
		System.out.println("Excellent choice " + name + "! You'll make a fantastic " + type + "!");
		
		// first act
		System.out.println('\n' + "You wake up in a dark forest..." + '\n');
		System.out.println("Do you want to move forward, left, or right? (Type forward, left, or right)");
		String firstAct = input.next().toLowerCase();
		while(!(firstAct.equals("left") || firstAct.equals("right") || firstAct.equals("forward"))){
			System.out.println("Sorry, you put in a direction not listed. Try again?");
			firstAct = input.next().toLowerCase(); 
		}
		CYOAClass object = new CYOAClass(name, type, firstAct);
		System.out.println('\n'+ object.firstAct());
		con = object.firstDeath();
		
		
		//second act
		if(con) {
		System.out.println("You see a large dragon approaching you. Press 1 to run away or press 2 to fight");
		int secondAct = input.nextInt();
		while(!(secondAct == 1 ||secondAct == 2)) {
			System.out.println("Sorry, you put in a digit not provided. Try again?");
			secondAct = input.nextInt(); 
		}
		CYOAClass object1 = new CYOAClass(name,type, firstAct, secondAct);
		System.out.println('\n'+ object1.secondAct());
		con = object1.secondDeath();
		}
		
		// third act
		if(con) {
		System.out.println("You see a princess in a castle in the distance. Press 1 to ignore and 2 to try to save her");
		int thirdAct = input.nextInt();
		while(!(thirdAct == 1 ||thirdAct == 2)) {
			System.out.println("Sorry, you put in a digit not provided. Try again?");
			thirdAct = input.nextInt(); 
		}
		int secondAct = 0;
		CYOAClass object2 = new CYOAClass(name, type, firstAct, secondAct, thirdAct);
		System.out.println('\n' + object2.thirdAct());
		con = object2.thirdDeath();
		}
		
		// fourth act
		if(con) {
		System.out.println('\n' + "You are at the princesses castle. How will you save her? Press 1 to scale the castles's wall, 2 to sneak through a window, 3 to walk through the front door, 4 to chicken out and leave");
		int fourthAct = input.nextInt();
		while(!(fourthAct == 1 ||fourthAct == 2 || fourthAct == 3)) {
			System.out.println("Sorry, you put in a digit not provided. Try again?");
			fourthAct = input.nextInt(); 
		}
		int thirdAct = 0;
		int secondAct = 0;
		CYOAClass object3 = new CYOAClass(name, type, firstAct, secondAct, thirdAct, fourthAct);
		System.out.println('\n' + object3.fourthAct());
		con = object3.fourthDeath();
		}
		//end of while loop
	
		//ending
		if(con) {
			System.out.println('\n' + "YOU WON! GAME OVER");
		} else {
			System.out.println('\n' + "YOU DIED. GAME OVER");
		}
		System.out.println('\n' + "Do you want to play again? Type yes to continue and no to stop.");
		String var = input.next();
		while(!(var.equals("yes") || var.equals("no"))){
			System.out.println("Sorry, you put in a option not listed. Try again?");
			var = input.next(); 
		}
		if(var.equals("yes")) {
			again = true;
		} else {
			again = false;
			System.out.println("Thank you for playing!");
		}

		}
	}
}
