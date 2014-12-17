package lab26SamostalniRad;

public class Tacka {

	//Zadatak za samostalni rad
	
	private double x;
	private double y;
	
	/**
	 * Kosntruktor bez parametara
	 */
	
	public Tacka()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Konstruktor sa parametrima
	 */
	
	public Tacka (double x1, double y1)
	{
		this.x = x1;
		this.y = y1;
	}
	
	/**
	 * Copy konstruktor
	 * @param t
	 */
	
	public Tacka (Tacka t)
	{
		this.x = t.x;
		this.y = t.y;
	}
	
	/**
	 * Getter za x
	 * @return x
	 */
	
	public double getX()
	{
		return x;
	}
	
	/**
	 * Getter za y
	 * @return y
	 */
	
	public double getY()
	{
		return y;
	}
	
	/**
	 * Setter za x
	 * @param x
	 */
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	/**
	 * Setter za y
	 * @param y
	 */
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	/**
	 * Funkcija vraća string kao uređeni par koordinata
	 */
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	/**
	 * Funkcija provjerava da li su dva objekta jednaka
	 * @param t
	 * @return boolean
	 */
	
	public boolean equals(Tacka t)
	{
		if (this.x == t.x && this.y == t.y)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Funkcija računa udaljenst dvije tačke
	 * @param t
	 * @return
	 */
	
	public double getDistance(Tacka t)
	{
		double distance = 0;
		distance = Math.sqrt(Math.pow(this.getX() - t.getX(), 2) + Math.pow(this.getY() - t.getY(), 2));
		return distance;
	}
	
}
