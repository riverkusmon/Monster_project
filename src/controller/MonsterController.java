package controller;
import java.util.Scanner;
import model.MarshmallowMonster;

public class MonsterController {
	//Data member section
	//declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("fas", .11, 1, true, 1);	
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}
	
	
	
	
	public void start()
	{
		System.out.println(myMonster);
		
		System.out.println("what is your monsters arm count");
		int armCount = inputScanner.nextInt();
		userMonster.setArmCount(armCount);
		
		System.out.println("your monster has " + userMonster.getArmCount()+ " arms!");
		
		System.out.println("what is your monsters name");
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		
		System.out.println("your monster has a dumb name why would you name it " + userMonster.getName() );
		
		System.out.println("what is your monsters eye count");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		
		System.out.println("your monster has " + userMonster.getEyeCount()+ " eyes!");
		
		
		
		System.out.println("true or false your monster has a nose");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(hasNoses);
		
		System.out.println("does your monster have a nose " + userMonster.getHasNoses());
		
		System.out.println("what is your monsters leg count");
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		
		System.out.println("your monster has " + userMonster.getLegCount()+ " legs!");
	}
	
	
	
}
