package rps.controller;

import rps.model.RPSComputer;

public class RPSController 
{
	private RPSComputer rpsComputer;
	
	public RPSController()
	{
		rpsComputer = new RPSComputer(this);
	}
	
	public RPSComputer getComputer()
	{
		return rpsComputer;
	}
	
	public void start()
	{
		rpsComputer.checkAnswers();
	}
	
}
