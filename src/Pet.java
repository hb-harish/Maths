

	
import java.util.Scanner;
  
 public class Pet
 {
     public static void main( String[] args )
    {
        String name;
        String breed;
        int age;
        
        System.out.print( "Greetings. What is your pet's name? " );
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();
 
        System.out.print( "What kind of animal is " + name + "? " );
        Scanner keyboard2 = new Scanner(System.in);
        breed = keyboard2.next();
        
        System.out.print( "How old is " + name + "? ");
        Scanner keyboard3 = new Scanner(System.in);
        age = keyboard3.nextInt();
        
        
        System.out.println( name + " is your " + breed + " and it is " + age );
     }
 }

