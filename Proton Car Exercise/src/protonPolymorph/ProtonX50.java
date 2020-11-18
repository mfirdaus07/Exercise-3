package protonPolymorph;

public class ProtonX50 extends Proton{
	
	String park, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX50() {
		this.model = "Proton X50";
		this.park = "Auto park available";
	}
	
	public void setRadio(String myradio) {
		this.radio = myradio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String myKey) {
		this.key = myKey;
	}
	
	public String getKey() { 
		return key;
	}
	
	class x5Speed extends Vehicle{ //superkeyword & polymorphism
		int maxSpeed = 100;
		int lowSpeed = 80;
		int limitSpeed = 130;

		public void display() { //superkeyword
			System.out.println("Max speed : " + maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  //polymorphism
			System.out.println("Broom Brooom");
		}
	}
	
	class x5Varian extends Varian{ 
		String std = "Standard";
		String medium = "Premium";
		String high = "Executive";

		public void display() {
			System.out.println("Varian : " + high);
		}
	}

	
	public void selfPark() {
		System.out.println("Model : " + model);
		System.out.println("Auto parking assist : " + park);
		x5Speed S = new x5Speed(); //superkeyword
		x5Varian V = new x5Varian(); 
		S.display();
		S.sing();
		V.display();
	}
	
}
