package protonPolymorph;


public class ProtonPersona extends Proton{
	
	String model;
	private String radio;
	private String key="remote";
	
	ProtonPersona(){
		this.model = "Proton Persona";
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
	
	class personaSpeed extends Vehicle{ //superkeyword & polymorphism
		int maxSpeed = 100;
		int lowSpeed = 80;
		int limitSpeed = 130;

		public void display() { //superkeyword
			System.out.println("Max speed : " + super.maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  //polymorphism
			System.out.println("Broom Brooom");
		}
	}
	
	class personaVarian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + medium);
		}
	}
	
	public void bigSpace() {
		System.out.println("Model : " + model);
		System.out.println("Big Space");
		personaSpeed S = new personaSpeed(); //superkeyword
		personaVarian V = new personaVarian(); 
		S.display();
		V.display();
		S.sing();
	}
}
