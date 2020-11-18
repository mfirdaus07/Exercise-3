package protonPolymorph;

public class ProtonSaga extends Proton{
	
	String model;
	private String radio;
	private String key="remote";
	
	ProtonSaga(){
		this.model = "Proton Saga";
	}
	
	public void setRadio(String newRadio) {
		radio = newRadio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String newKey) {
		key = newKey;
	}
	
	public String getKey() {
		return key;
	}
	
	class sagaSpeed extends Vehicle{ //superkeyword & polymorphism
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
	
	class sagaVarian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + std);
		}
	}
	
	
	
	public void fuelSave() {
		System.out.println("Model : " + model);
		System.out.println("Fuel Save");
		sagaSpeed S = new sagaSpeed(); //superkeyword
		sagaVarian V = new sagaVarian(); 
		S.display();
		V.display();
		S.sing();
	}
}
