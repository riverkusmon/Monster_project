package controller;

import model.MarshmallowMonster;

public class MonsterController {
	//Data member section
	//declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("fas", .11, 1, true, 1);	
	}
	
	
	
	
	public void start()
	{
		System.out.println(myMonster);
	}
	
	
	
}
