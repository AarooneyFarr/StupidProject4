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
		hasBirthday = true;

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
		boolean hasBirthday;
		
		System.out.println("Have you had your birthday already this year?");
		String ageCheck = inputReader.nextLine();
		if (ageCheck == "yes")
		{
			 hasBirthday = true;
		}
		else
		{
			hasBirthday = false;
		}

		System.out.println("What year were you born?");
		int input = inputReader.nextInt();
		if (input > currentYear - 100 && input < currentYear + 1)
		{
			if (hasBirthday == true)
			{
				input = currentYear - input;
				System.out.println("Your age is " + input);
			}
			else
			{
				input = (currentYear - 1) - input;
				System.out.println("Your age is " + input);
			}
		}
		else if (input <= currentYear - 100 && input >= currentYear - 120)
		{
			if (hasBirthday == true)
			{
				input = currentYear - input;
				System.out.println("You are really old! Your age is " + input);
			}
			else
			{
				input = (currentYear - 1) - input;
				System.out.println("You are really old! Your age is " + input);
			}
			input = currentYear - input;

		}
		else
		{
			System.out.println("You are lying!");
			age(currentYear);

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
