package controller;

//import java.util.Scanner;
import model.MarshmallowMonster;
import javax.swing.JOptionPane;
public class MonsterController {
	//Data member section
	//declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	//private Scanner inputScanner;
	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("fas", .11, 1, true, 1);	
		userMonster = new MarshmallowMonster();
		//inputScanner = new Scanner(System.in);
	}
	
	
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(null,myMonster);
		
	
		//int armCount = inputScanner.nextInt();
		
		String armInput = JOptionPane.showInputDialog(null, "how many arms for monster");
		int arms = -99;
		if (validInt(armInput))
		{
			arms = Integer.parseInt(armInput);
		}
		
		boolean armAnswer = Boolean.parseBoolean(armInput);
		userMonster.setArmCount(arms);
		
		if (arms > 10)
		{
			JOptionPane.showMessageDialog(null, "thats a lot of damage");
		}
		else {
		
		JOptionPane.showMessageDialog(null, "your monster has " + userMonster.getArmCount()+ " arms!");
		}
		
		
		
		
		
		
		
		//------------------------------------------------------------------------------------------------
		
		String name = JOptionPane.showInputDialog(null, "whats its name");
		//String name = inputScanner.nextLine();
		userMonster.setName(name);
		
		JOptionPane.showMessageDialog(null, "your monster has a dumb name why would you name it " + userMonster.getName() );
		//
		
		
		
		String eyeInput = JOptionPane.showInputDialog(null, "what is your monsters eye count");
		int eyes = -99;
		if (validInt(eyeInput))
		{
			eyes = Integer.parseInt(eyeInput);
		}
		
		boolean eyeAnswer = Boolean.parseBoolean(eyeInput);
		userMonster.setEyeCount(eyes);
		
		//int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyes);
		
		JOptionPane.showMessageDialog(null, "your monster has " + userMonster.getEyeCount()+ " eyes!");
		//
		
		
		
		
		
		//----------------------------------------------------------------------------------------------
		String noseBoolean = JOptionPane.showInputDialog(null, "true or false your monster has a nose");
		boolean hasNoses = Boolean.parseBoolean(noseBoolean);
		userMonster.setHasNoses(hasNoses);
		
		
		String legInput = JOptionPane.showInputDialog(null, "what is your monsters leg count (in decimals)");
		//double legCount = inputScanner.nextDouble();
		double legs = -99;
		if (validDouble(legInput))
		{
			legs = Double.parseDouble(legInput);
		}
		//boolean legInput = Boolean.parseBoolean(legCount);
		
		userMonster.setLegCount(legs);
		
		
		
		
		JOptionPane.showMessageDialog(null, "your monster has " + userMonster.getLegCount()+ " legs!");
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try 
		{
			Integer.parseInt(maybeInt);
			isValid = true;
			
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you need to type in a whole number");
			
			
		}
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try 
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
			
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you need to type in a decimal number");
			
			
		}
		return isValid;
	}
	
	
	
	
	
	
	
	
}
