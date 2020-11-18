package protonPolymorph;

class Vehicle {
	int maxSpeed = 180; //superkeyword
	int lowSpeed = 80;
	int limitSpeed = 130; 
	
	public void  sing() {
		System.out.println("Vroom Vroom"); //polymorphism
	}
}

class Varian {
	String std = "Standard";
	String medium = "Premium";
	String high = "Executive";
	String flag = "FlagShip";
}


public class Proton {
	
	String tyreBrand, windows, headlight;
	int tyreSize;
	
	Proton() {
		this.tyreBrand = "Dunlop";
		this.tyreSize = 15;
	}
	
	Proton(String w, String h) { 
		this.windows = w;
		this.headlight = h;
	}
	
	public void printProton() {
		Proton p1 = new Proton();
		Proton p2 = new Proton("UP", "ON");
		
		System.out.println("Tyre Brand: " + p1.tyreBrand);
		System.out.println("Tyre Size: " + p1.tyreSize);
		
		System.out.println("Headlights: " + p2.headlight);
		System.out.println("Window: " + p2.windows);
	}

}
