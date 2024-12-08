package HerenciaCoches;
	//4 atributos
public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected String combustible;
	
	//contructor
	public Vehiculo() {
		System.out.println("***ejecucion constructor vehiculo***");
	}
	//Metodo pitar
	String pitar() {
		return "pii pii";		
	}
}
