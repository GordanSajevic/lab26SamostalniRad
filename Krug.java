package lab26SamostalniRad;

public class Krug {

	//adatak za samostalan rad
	
	private Tacka centar;
	private double radijus;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Krug()
	{
		centar = new Tacka();
		radijus = 1;
	}
	
	public Krug(double x1, double y1, double radijus1)
	{
		this.centar = new Tacka(x1, y1);
		this.radijus = radijus1;
	}
	
	/**
	 * Konstruktor sa dva parametra
	 * @param centar1
	 * @param radijus1
	 */
	
	public Krug(Tacka centar1, double radijus1)
	{
		this.centar= new Tacka(centar1);
		this.radijus = radijus1;
	}
	
	/**
	 * Copy konstruktor
	 * @param k
	 */
	
	public Krug (Krug k)
	{
		this.centar.setX(k.centar.getX());
		this.centar.setY(k.centar.getY());
		this.radijus = k.radijus;
	}
	
	/**
	 * Getter za centar
	 * @return centar
	 */
	
	public Tacka getCentar()
	{
		return centar;
	}
	
	/**
	 * Getter za radijus
	 * @return radijus
	 */
	
	public double getRadijus()
	{
		return radijus;
	}
	
	/**
	 * Setter za centar
	 * @param centar1
	 */
	
	public void setCentar(Tacka centar1)
	{
		
		this.centar.setX(centar1.getX());
		this.centar.setY(centar1.getY());
	}
	
	/**
	 * Setter za radijus
	 * @param radijus1
	 */
	
	public void setRadijus(double radijus1)
	{
		if (radijus1 < 0)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli radijus!");
		}
		else
		{
			this.radijus = radijus1;
		}
	}
	
	/**
	 * Funkcija vraća string sa podacima o krugu 
	 */
	
	public String toString()
	{
		return "Centar (" + centar.getX() + ", " + centar.getY() + ")\nRadijus: " + radijus;
	}
	
	/**
	 * Funkcija provjerava da li su dva objekta jednaka
	 * @param k
	 * @return boolean
	 */
	
	public boolean equals(Krug k)
	{
		if (this.centar.getX() == k.centar.getX() && this.centar.getY() == k.centar.getY() && this.radijus == k.radijus)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Funkcija provjerava da li je tačka u krugu ili ne
	 * @param t
	 * @return boolean
	 */
	
	public int isInCircle(Tacka t)
	{
		double distance = this.centar.getDistance(t);
		if (distance < this.radijus)
		{
			return -1;
		}
		else if (distance == radijus)
		{
			return 0;
		}
		return 1;
	}
	
	/**
	 * Funkcija provjerava da li se dva kruga sijeku ili ne
	 * @param k
	 * @return boolean
	 */
	
	public boolean otherCircle(Krug k)
	{
		double distance1 = this.centar.getDistance(k.centar);
		double distance2 = this.radijus + k.radijus;
		if (distance2 > distance1)
		{
			return true;
		}
		return false;
	}
}
