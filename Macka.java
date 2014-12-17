package lab26SamostalniRad;

public class Macka extends Zivotinja{

	//Zadatak za samostalan rad
	
	/**
	 * Konstruktor sa dva parametra
	 * @param ime
	 * @param brojNogu
	 */
	
	public Macka(String ime, int brojNogu)
	{
		super(ime, "mačka", 4);
	}
	
	/**
	 * Funkcija koje nema u parent klasi
	 * @return
	 */
	
	public String mjaukanje()
	{
		return "mjau mjau";
	}
	
	/**
	 * Funkcija je override funkcije iz parent klase, vraća string sa podacima o psu
	 */
	@Override
	public String toString()
	{
		return "Mačka " + getIme() + ", broj nogu: " + 4;
	}
}
