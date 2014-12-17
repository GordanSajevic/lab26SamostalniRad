package lab26SamostalniRad;

public class TestZivotinja {

	//Zadatak za samostalan rad
	
	public static void main(String[] args) {
		Zivotinja z1 = new Zivotinja("Totti", "pas", 4);
		Zivotinja z2 = new Zivotinja("Figo", "hrčak", 4);
		System.out.println(z1.toString());
		System.out.println(z2.toString());
		Pas cuko = new Pas("Robben", 4);
		System.out.println("Oglašavanje džukele: " + cuko.lajanje());
		System.out.println(cuko.toString());
		Macka macka = new Macka("Frki", 4);
		System.out.println(macka.toString());
		System.out.println(macka.mjaukanje());
		
	}

}
