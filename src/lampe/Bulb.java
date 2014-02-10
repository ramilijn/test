package lampe;
/**
 * Représente une lampe. Une lampe est un objet ayant une puissance
 * elle est soit allumée soit éteinte
 * @author ramilijn
 *
 */
public class Bulb
{//constante
	/**
	 * Puissance de la lampe par défaut
	 */
	public final static int DEFAULT_POWER = 100;
	//attribut
	/**
	 * Puissance de la lampe que choisi
	 */
	private final int power;
	/**
	 * Indicateur de l'état allumé ou non de la lampe
	 */
	private boolean isLit;
//constructeur
	/**
	 * Retourne une nouvelle lampe éteinte de puissance par défaut
	 */
	public Bulb() 
	{	
		isLit=false;
		power = DEFAULT_POWER;
	}
	
	/**
	 * Retourne une nouvelle lampe de puissance donnée
	 */
	public Bulb(int puissanceinit) 
	{
		isLit=false;
		power = puissanceinit;
	}
//mÃ©thodes
	
	/**
	 * allume la lampe
	 */
	public void switchOn()
	{
		this.isLit=true;
	}
	/**
	 * éteint lampe
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
