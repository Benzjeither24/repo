import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[]args)
	{
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		char answer;
		int TicketSold;
		
		//Create a do while loop to repeat the program when the user input is Yes
		do
		{
			
			Movie m= new Movie();    //create a new movie object
			System.out.print("Enter the name of the movie \n"); //Prompt the user to enter the title of a movie 
			String MovieTitle=keyboard.nextLine(); // Read in the line that the user types
			m.setTitle(MovieTitle); // Set the title in the movie object
			
			System.out.print("Enter the rating of the movie \n"); // Prompt the user to enter the movie’s rating
			String MovieRating = keyboard.next(); //Read in the line that the user types
			m.setRating(MovieRating); // Set the rating in the movie object
			
			System.out.print("Enter the number of tickets sold for this movie \n"); // Prompt the user to enter the number of tickets sold at a (unnamed) theater
			TicketSold = keyboard.nextInt(); // Read in the integer that the user types
			m.setSoldTickets(TicketSold); // Set the number of tickets sold in the movie object
			
			System.out.println(MovieTitle + "(" + MovieRating + "): Tickets Sold: " + TicketSold);
			System.out.println("Do you want to enter another ?(y or n)");
			
			answer = keyboard.next().charAt(0);
			keyboard.nextLine();

		} while (answer == 'Y' || answer == 'y');

		System.out.println("Goodbye");

	}

}


