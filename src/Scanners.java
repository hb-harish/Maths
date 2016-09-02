import java.util.Scanner;

public class Scanners {
	
	public static void main(String[] args) {
		String  firstInitial,lastName, houseNumber,streetName,streetType,city;
		System.out.println("Enter the adress");
		Scanner keyboard = new Scanner(System.in);
		firstInitial = keyboard.next(); 
		lastName = keyboard.next(); 
		houseNumber = keyboard.next();
		streetName = keyboard.next();
		streetType = keyboard.next();
		city = keyboard.next();
		keyboard.close();
		System.out.print(firstInitial + "\n" + lastName + "\n" + houseNumber + "\n"); 
		System.out.println(streetName + "\n" + streetType + "\n" + city);
		
	}

}
