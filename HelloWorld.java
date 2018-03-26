import java.util.Scanner;
import samplesBySam.*; //import samplesBySam.* later if I make more classes. 

public class HelloWorld {

	public static void main(String[] args) {
		/** Document this you bitch */
		Scanner scan = new Scanner(System.in); // might get used later
		int size = 10;
		int[] arr = new int[size];
		for (int i=0; i<size; i++) { // adds numbers 1 to (size) to the array. 
			arr[i] = i+1; 
		}
		Cup cupa = new Cup(); // create default cup and specify its exact attributes later if you want. 
		cupa.setColor("green");
		cupa.setFilled(true);
		cupa.setCapacity(400);
		cupa.setContents("Perfectly safe normal water");
		
		cupa.description();
		System.out.println("See the cup contents by entering the password: ");
		String passwd = scan.nextLine();
		System.out.println("you see the cup has: "+cupa.getContents(passwd));
		scan.close();
		
		Cup cupb = new Cup(false, 0, "red", "oil"); //probably should only use this to create cups otherwise weird shit will happen.
		cupb.description();
		
		Tankard tanka =  new Tankard(true, 500, "brown", "mead", "tall and has a handle.");
		tanka.description();
		tanka.sip(100);
		cupa.sip(50);
	}
}