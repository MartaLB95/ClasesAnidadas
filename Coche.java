package m2_01_Marta_Laveda_Box;

public class Coche {
	
	

	//Atributos de la clase Coche

	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	private int velocidadMaxima;
	private Chasis chasis;
	private Ruedas ruedas;
	
	
	//Constructor y método toString de la clase Coche
	
	public Coche(String matricula, String marca, String modelo, int potencia, int velocidadMaxima) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		

		this.chasis=new Chasis();
		this.ruedas=new Ruedas();
	}
		
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia
				+ ", velocidadMaxima=" + velocidadMaxima + ", chasis=" + chasis + ", ruedas=" + ruedas + "]";
	
	}
	
	//Métodos getters y setters de Coche

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public Chasis getChasis() {
		return chasis;
	}


	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}


	public Ruedas getRuedas() {
		return ruedas;
	}


	public void setRuedas(Ruedas ruedas) {
		this.ruedas = ruedas;
	}
	//Métodos para asignar los valores de los atributos de Chasis, Ruedas y Tipo, que no se incluyen en el constructor Coche
			
			public void asignarChasis(String material, int peso){
				getChasis().material=material;
				getChasis().peso=peso;
			}
			
			
			public void asignarRuedas(String medida, String marca, String modelo) {
				getRuedas().medida=medida;
				getRuedas().marca=marca;
				getRuedas().modelo=modelo;
				
			}
			
		
	//Clases anidadas: Chasis y Ruedas, con sus atributos y método toString

	public class Chasis{
		@Override
		public String toString() {
			return "Chasis [material=" + material + ", peso=" + peso + "]";
		}
		public  String material;
		public  int peso;
	}
	
	public class Ruedas{
		public String medida;
		public String tipo;
		public String marca;
		public String modelo;
		
		public void asignarTipo (String tipoSeleccionado) {
			 if (tipoSeleccionado.equalsIgnoreCase("seco") || tipoSeleccionado.equalsIgnoreCase("lluvia")) {
		            getRuedas().tipo = tipoSeleccionado;
			 }else {
				 System.out.println("El tipo de ruedas solo puede ser seco o lluvia.");
			 }
		}
		
		@Override
		public String toString() {
			return "Ruedas [medida=" + medida + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + "]";
		}

		//Clase anidada Tipo, perteneciente a Ruedas, con sus dos atributos y método toString
		
		public class Tipo{
			public String seco;
			public String lluvia;
			
			@Override
			public String toString() {
				return "Tipo [seco=" + seco + ", lluvia=" + lluvia + "]";
			}
			
		
		
			}
		}	
		}		
			

