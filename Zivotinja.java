package lab26SamostalniRad;

public class Zivotinja {

	private String ime;
	private String tip;
	private int brojNogu;
	
	/**
	 * Konstruktor sa tri parametra
	 * @param ime
	 * @param tip
	 * @param brojNogu
	 */
	
	public Zivotinja(String ime, String tip, int brojNogu)
	{
		this.ime = ime;
		this.tip = tip;
		this.brojNogu = brojNogu;
	}
	
	/**
	 * Getter za ime
	 * @return ime
	 */
	
	public String getIme()
	{
		return this.ime;
	}
	
	/**
	 * Getter za tip
	 * @return tip
	 */
	
	public String getTip()
	{
		return this.tip;
	}
	
	/**
	 * Getter za broj nogu
	 * @return brojNogu
	 */
	
	public int getBrojNogu()
	{
		return this.brojNogu;
	}
	
	/**
	 * Setter za ime
	 * @param ime
	 */
	
	public void setIme(String ime)
	{
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
	}
	
	/**
	 * Setter za tip
	 * @param tip
	 */
	
	public void setTip(String tip)
	{
		if (tip != "pas" && tip != "mačka" && tip != "hrčak" && tip != "ptica" && tip != "zec")
		{
			throw new IllegalArgumentException("Tip ne može biti prazan!");
		}
		else
		{
			this.tip = tip;
		}
	}
	
	/**
	 * Setter za broj nogu
	 * @param brojNogu
	 */
	
	public void setBrojNogu(int brojNogu)
	{
		if (brojNogu < 0 && brojNogu > 4)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli broj nogu!");
		}
		else
		{
			this.brojNogu = brojNogu;
		}
	}
	
	/**
	 * Funkcija vraća string sa svim podacima o životinji
	 */
	
	public String toString()
	{
		return "Ime: " + ime + ", tip: " + tip + ", broj nogu: " + brojNogu;
	}
	
	/**
	 * Funkcija provjerava da li su dva objekta jednaka
	 * @param zvijer
	 * @return boolean
	 */
	
	public boolean equals(Zivotinja zvijer)
	{
		if (this.ime.equals(zvijer.ime) && this.tip.equals(zvijer.tip) && this.brojNogu == zvijer.brojNogu)
		{
			return true;
		}
		return false;
	}
}
