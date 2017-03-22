package rps.model;

import rps.controller.RPSController;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RPSComputer 
{
	private RPSController rpsController;
	private ArrayList<String> wordList;
	private Random randomGen;
	private int counter;
	private int tieCounter;
	private String botAnswer;
	private Scanner readUserInput;
	
	public RPSComputer(RPSController rpsController)
	{
		this.rpsController = rpsController;
		randomGen = new Random();
		counter = 0;
		tieCounter = 0;
		wordList = new ArrayList<String>();
		wordList.add("Rock");
		wordList.add("Paper");
		wordList.add("Scissors");
		readUserInput = new Scanner(System.in);
	}
	
	public void checkAnswers()
	{
		System.out.println("Rock, Paper, or Scissors?");
		String firstInput = readUserInput.next();
		if (getBotAnswer().equals("Rock") && firstInput.equalsIgnoreCase("Paper"))
		{
			counter++;
			System.out.println("Victory!");
		}
		else if (getBotAnswer().equals("Paper") && firstInput.equalsIgnoreCase("Scissors"))
		{
			counter++;
			System.out.println("Victory!");
		}
		else if (getBotAnswer().equals("Scissors") && firstInput.equalsIgnoreCase("Rock"))
		{
			counter++;
			System.out.println("Victory!");
		}
		else if (getBotAnswer().equalsIgnoreCase(firstInput))
		{
			tieCounter++;
			System.out.println("Draw!");
		}
		else 
		{
			counter--;
			System.out.println("Defeat.");
		}
		
	}
	
	public void createBotAnswer()
	{
		botAnswer = wordList.get(randomGen.nextInt(wordList.size()));
		System.out.println(botAnswer);
	}
	
	public String getBotAnswer()
	{
		return botAnswer;
	}
	
	public int getCount()
	{
		return counter;
	}
	
	public int getTieCount()
	{
		return tieCounter;
	}
	
}
