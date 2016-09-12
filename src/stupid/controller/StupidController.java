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
		questions();
	}

	public void bestFood()
	{
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.next();
		System.out.println("Ok, you typed this: " + foodInput);
		inputReader.nextLine();
	}

	public void bestResort()
	{

		System.out.println("My next question is: What is your favorite ski resort");
		String ski = inputReader.nextLine();
		System.out.println("Ok, you typed this: " + ski);

	}

	public void birthMonth()
	{
		System.out.println("My next question is: What is the number for the month that you were born in?");
		int month = inputReader.nextInt();
		System.out.println("ok, you typed this: " + month);
		inputReader.nextLine(); // Used to consume unneeded input

	}

	public void cup()
	{
		System.out.println("My next question is: How full do you fill your cup?");
		double cup = inputReader.nextDouble();
		System.out.println("Ok, you typed this: " + cup);
		inputReader.nextLine(); // Used to consume unneeded input

	}

	public void nickName()
	{
		System.out.println("My next question is this: what your nickname?");
		String someInput = inputReader.next();
		System.out.println("Ok, you typed this: " + someInput);
		inputReader.nextLine(); // Used to consume unneeded input
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
		inputReader.nextLine(); // Used to consume unneeded input

	}

	public void coder()
	{
		System.out.println("My next question is: Are you a programmer? (true or false)");
		boolean coderAnswer = inputReader.nextBoolean();
		System.out.println("Ok, you answered: " + coderAnswer);
		inputReader.nextLine();
	}

	public void clothes()
	{
		System.out.println("My next question is: What color is your shirt?");
		String shirtColor = inputReader.nextLine();
		System.out.println("Ok, you answered: " + shirtColor);
	}

	public void pants()
	{
		System.out.println("My next question is: What color are your pants?");
		String pantsColor = inputReader.nextLine();
		System.out.println("Ok, you answered: " + pantsColor);
	}

	public void shoes()
	{
		System.out.println("My next question is: What color are your shoes?");
		String shoesColor = inputReader.nextLine();
		System.out.println("Ok, you answered: " + shoesColor);
	}

	public void questions()
	{

		age(2016);
		bestResort();
		bestFood();
		birthMonth();
		cup();
		nickName();
		coder();
		clothes();
		pants();
		shoes();
	}

}
