package lampe;
/**
 * Repr�sente une lampe. Une lampe est un objet ayant une puissance
 * elle est soit allum�e soit �teinte
 * @author ramilijn
 *
 */
public class Bulb
{//constante
	/**
	 * Puissance de la lampe par d�faut
	 */
	public final static int DEFAULT_POWER = 100;
	//attribut
	/**
	 * Puissance de la lampe que choisi
	 */
	private final int power;
	/**
	 * Indicateur de l'�tat allum� ou non de la lampe
	 */
	private boolean isLit;
//constructeur
	/**
	 * Retourne une nouvelle lampe �teinte de puissance par d�faut
	 */
	public Bulb() 
	{	
		isLit=false;
		power = DEFAULT_POWER;
	}
	
	/**
	 * Retourne une nouvelle lampe de puissance donn�e
	 */
	public Bulb(int puissanceinit) 
	{
		isLit=false;
		power = puissanceinit;
	}
//méthodes
	
	/**
	 * allume la lampe
	 */
	public void switchOn()
	{
		this.isLit=true;
	}
	/**
	 * �teint lampe
	 */
	public void switchOff()
	{
		this.isLit=false;
	}
	/**
	 * 
	 * @return
	 */
	public int getPower()
	{
		return power;
	}
	public boolean isLit()
	{ 
		return isLit;
	}
}
