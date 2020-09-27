import java.util.*;

public class RandomNumberGuesser 
{
	public static void main(String[]args) 
	{
		int randNum, nextGuess,highGuess=100, lowGuess=0;

		randNum =RNG.rand(); // initialize a random value number to variable randNum
		char tryAgain;
		int count = RNG.resetCount();
		Scanner keyboard = new Scanner(System.in); // create a Scanner object to get an input from the user
		
        System.out.println("Enter your first guess: "); //Ask the user for the input
        nextGuess= keyboard.nextInt();


			 while(nextGuess!=randNum)
		       {
				 	RNG.getCount();
				 	System.out.println("Number of guesses is " + count);
		           if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) //call the method inputValidation from the RNG class
		           {
		               if(nextGuess<=randNum)
		               {
		                   lowGuess=nextGuess; //assigned the nextGuess value to lowGuess if the nextGuess is less than the correctNumber
		                   System.out.println("Your guess is too low\nEnter you next guess between " + lowGuess+ " and " + highGuess);
		                   nextGuess= keyboard.nextInt(); //Ask for another input
		                   count++; // increment
		               }
		               else if(nextGuess>=randNum)
		               {
		                   highGuess=nextGuess; //assigned the nextGuess value to highGuess if the nextGuess is more than the correctNumber
		                   System.out.println("Your guess is too high\nEnter you next guess between " + lowGuess+ " and " + highGuess);
		                   nextGuess= keyboard.nextInt(); //Ask for another input
		                   count++; // increment
		               }

		           }    
		           else
		           {  
		            	System.exit(0);
		           }
		       }
			 
			 if(nextGuess == randNum)
			 {
	           	System.out.println("Congratulations, you guessed correctly"); //Display this if the randNum is guessed correctly
			 }

	         System.out.println("Try Again? (yes or no)");
			 tryAgain = keyboard.next().charAt(0); //Read the input of the user

			 if(tryAgain=='y' || tryAgain == 'Y')
			 {
				 main(args); //repeat the program
			 }
			 else
				 System.out.println("Thanks for playing. . ."); //Display if tryAgain!='y'






		

	       
	}
}	



