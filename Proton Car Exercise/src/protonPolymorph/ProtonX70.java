package protonPolymorph;

public class ProtonX70 extends Proton {
	
	String color;
	String voiceControl, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX70() {
		this.model = "Proton X70";
		this.voiceControl = "Voice Control Available";
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
	
	class x7Speed extends Vehicle{
		int maxSpeed = 160;
		int lowSpeed = 80;
		int limitSpeed = 130;

		public void display() {
			System.out.println("Max speed : " + super.maxSpeed + "km/h");
		}
		public void  sing(String sing) {  //polymorphism
			System.out.println("Broom Brooom");
		}
	}
	
	class x7Varian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + flag);
		}
	}
	
	
	
	public void voiceControl() {
		System.out.println("Model : " + model);
		System.out.println("Voice Control : " + voiceControl);
		x7Speed S = new x7Speed();
		x7Varian V =new x7Varian(); 
		S.display();
		V.display();
		S.sing();
	}
	
}
