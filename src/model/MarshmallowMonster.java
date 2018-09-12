package model;

public class MarshmallowMonster {
//declaration section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	public MarshmallowMonster()
	{
		//dont use unless you want boring monsters
	}
	
	
	
	
	
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int arms)
	{
		//default constructor
		//Generally boring and not as helpful
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses  = hasNoses;
		this.armCount = armCount;
		
		//default constructor
		
		
		
		
		
		
		
		
	}

	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}	
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
		
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
		
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		public String toString()
	{
		String description = "This monster is named " + name + " and it has " + legCount + " legs..."
				+ "its favorite thing to say is jacum is good boy";
		return description;
		
	}
	
	
}
