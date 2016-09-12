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

		System.out.println("Who is the Master?");
		System.out.println(myName);
		age(2016);
	}

	public void age(int currentYear)
	{
		System.out.println("What year were you born?");
		int input = inputReader.nextInt();
		if (input > currentYear - 100 && input < currentYear + 1)
		{
			input = 2016 - input;
			System.out.println("Your age is " + input);
		}
		else
		{
			System.out.println("You are lying!");
			age(2016);

		}

	}

}
