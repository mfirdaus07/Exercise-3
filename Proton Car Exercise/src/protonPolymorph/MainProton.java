package protonPolymorph;

public class MainProton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtonSaga PS = new ProtonSaga();
		ProtonPersona PP = new ProtonPersona();
		ProtonX50 X50 = new ProtonX50();
		ProtonX70 X70 = new ProtonX70();
		
		System.out.println("Proton Car Model 2020\n");
		
		//Proton Saga
		PS.fuelSave();
		PS.printProton();
		PS.setRadio("Pioneer");
		System.out.println("Type of key: " + PS.getKey());
		System.out.println("Radio brand: " + PS.getRadio());
		System.out.println("\n");
		
		//Proton Persona
		PP.bigSpace();
		PP.printProton();
		PP.setRadio("Kenwood");
		System.out.println("Type of key: " + PP.getKey());
		System.out.println("Radio brand: " + PP.getRadio());
		System.out.println("\n");
		
		//Proton X50
		X50.selfPark();
		X50.printProton();
		X50.setRadio("Alpine");
		System.out.println("Type of key: " + X50.getKey());
		System.out.println("Radio brand: " + X50.getRadio());
		System.out.println("\n");
		
		//Proton X70
		X70.voiceControl();
		X50.printProton();
		X50.setRadio("BLAUPUNKT");
		System.out.println("Type of key: " + X50.getKey());
		System.out.println("Radio brand: " + X50.getRadio());
	}

}
