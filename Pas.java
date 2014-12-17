package lab26SamostalniRad;

public class Pas extends Zivotinja{
	
	//Zadatak za samostalan rad
	
	private String pasmina;
	
	/**
	 * Konstruktor sa dva parametra
	 * @param ime
	 * @param brojNogu
	 */
	
	public Pas(String ime, int brojNogu)
	{
		super(ime, "pas", brojNogu);
	}
	
	/**
	 * Konstruktor sa tri parametra (sa atributom kojeg nema u parent klasi)
	 * @param ime
	 * @param brojNogu
	 * @param pasmina
	 */
	
	public Pas(String ime, int brojNogu, String pasmina)
	{
		super(ime, "pas", brojNogu);
		this.pasmina = pasmina;
	}
	
	/**
	 * Funkcija koja ne postoji u parent klasi
	 * @return string
	 */
	
	public String lajanje()
	{
		return "vau vau";
	}
	
	/**
	 * Funkcija je override funkcije iz parent klase, vraća string sa podacima o psu
	 */
	
	@Override
	public String toString()
	{
		return "Džukela " + getIme() + ", broj nogu: " + getBrojNogu();
	}

}
