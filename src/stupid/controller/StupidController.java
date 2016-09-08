package stupid.controller;

import java.util.Scanner;

public class StupidController
{

	private String myName;
	private Scanner inputReader;

	public StupidController()
	{
		myName = "Aaron Farr";
		inputReader = new Scanner(System.in);

	}

	public void start()
	{

		System.out.println("Who is the Meme Master?");
		System.out.println(myName);
		age();
	}

	public void age()
	{
		System.out.println("What year were you born?");
		int input = inputReader.nextInt();
		if (input > 1916 && input < 2017)
		{
			input = 2016 - input;
			System.out.println("Your age is " + input);
		}
		else{
			System.out.println("That is not a valid year");
			age();
		}
		

	}

}
