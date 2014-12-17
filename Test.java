package lab26SamostalniRad;

public class Test {

	//Zadatak za samostalni rad
	
	public static void main(String[] args) {
		Tacka t1 = new Tacka(2, 3);
		Tacka t2 = new Tacka(5, 2);
		System.out.println("Udaljenost tačaka " + t1.toString() + " i " + t2.toString() + " je: " + t1.getDistance(t2));
		System.out.println("Da li su tačke jednake? " + t1.equals(t2));
		t1 = new Tacka(t2);
		System.out.println("Da li su sad tačke jednake? " + t1.equals(t2));
		
		Krug k1 = new Krug(2, 3, 5);
		Krug k2 = new Krug(t2, 7);
		System.out.println("Da li se krugovi sijeku? " + k1.otherCircle(k2));
	}

}
