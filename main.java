package m2_01_Marta_Laveda_Box;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche coche1= new Coche("4567FBI",  "Ford", "Sync",120,190);
		Coche coche2= new Coche("2215ORG",  "Seat", "Leon",110,200);
		Coche coche3= new Coche("9688OLA",  "Kia", "Niro",140,200);
		
		coche1.asignarChasis("acero",1200);
		coche2.asignarChasis("aluminio", 1100);
		coche3.asignarChasis("acero", 1300);
		
		coche1.asignarRuedas("55/85 R20", "Michelin", "Alpin A4");
		coche2.asignarRuedas("55/85 R20", "Yokohama", "Blueearth");
		coche3.asignarRuedas("55/85 R20", "Bridgestone", "Turanza");
		
		coche1.getRuedas().asignarTipo("lluvia");
		coche2.getRuedas().asignarTipo("seco");
		coche3.getRuedas().asignarTipo("seco");
		
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		System.out.println(coche3.toString());
	}

}
