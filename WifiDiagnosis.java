/*Class: CMSC203
Program: Assignment #1
Instructor: Dr. Grinberg
Summary of Description:  Build an application that will step through some possible problems to restore internet connectivity. 
                         Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet.          
Due Date: 09/13/2020
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source. */

import java.util.Scanner;

public class WifiDiagnosis 
{
	public static void main(String[]args)
	{
		char answer; //declare the variable "answer"
		System.out.print("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n\n");
		System.out.println("First Step: Reboot the computer and try to connect.");
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's answer after doing the first step
		System.out.print("Are you able to connect with internet? (Y/N): ");
		answer = keyboard.next().charAt(0);
		
		if(answer == 'Y' || answer == 'y')
		{
			System.out.print("\nRebooting your computer seemed to work.");
		}
		else if(answer =='N' || answer == 'n')
		{
			System.out.println("\nSecond Step: Reboot the router and try to connect.");
			
			// Get the user's answer after doing the second step
			System.out.print("Now, are you able to connect with internet? (Y/N): ");
			answer = keyboard.next().charAt(0);
			
			if(answer=='Y'|| answer == 'y')
			{
				System.out.println("\nRebooting the router seemed to work.");
			}
			else if(answer =='N' || answer == 'n')
			{
				System.out.println("\nThird Step: Make sure the cables connecting the router are firmly plugged in and power is getting to the router.");
				
				// Get the user's answer after doing the third step
				System.out.print("Did that fix the problem? (Y/N): ");
				answer = keyboard.next().charAt(0);
				
				if(answer=='Y'|| answer == 'y')
				{
					System.out.println("\nChecking the router's cables seemed to work.");
				}
				else if(answer =='N' || answer == 'n')
				{
					System.out.println("\nFourth step: Move the computer closer to the router and try to connect.");
					
					// Get the user's answer after doing the fourth step
					System.out.print("Now, are you able to connect with internet? (Y/N): ");
					answer = keyboard.next().charAt(0);
					
					if(answer == 'Y' || answer == 'y')
					{
						System.out.println("\nMoving the computer closer to the router seemed to work.");
					}
					else if(answer =='N' || answer == 'n')
					{
						System.out.print("\nLast step: Contact your ISP.\n");
						System.out.print("Make sure your ISP is hooked up to your router.");
					}
				}
			}
		}
		
		System.exit(0);
	}
}
