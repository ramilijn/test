package lampe;

public class Bulb
{//constante
	public final static int DEFAULT_POWER = 100;
	//attribut
	private final int power;
	private boolean isLit;
//constructeur
	
	public Bulb() 
	{	
		isLit=false;
		power = DEFAULT_POWER;
	}
	
	public Bulb(int puissanceinit) 
	{
		isLit=false;
		power = puissanceinit;
	}
//méthodes
	public void switchOn()
	{
		this.isLit=true;
	}
	
	public void switchOff()
	{
		this.isLit=false;
	}
	public int getPower()
	{
		return power;
	}
	public boolean isLit()
	{ 
		return isLit;
	}
}
