package Copias;
// el extends hereda todos los atributos publicos de la clase vehiculo
public class Coche extends Vehiculo {
	private int puertas; //variable solo del la herencia

	public Coche() {
		System.out.println("***mostrar constructor de coche***");
	}
	
	public static void main(String[]args) {
	//Crear una instancia 
	Coche c = new Coche();
	c.marca = "seat";
	c.modelo = "ibiza";
	c.matricula = "0000BBB";
	c.combustible = "gasolina";
	//podemos ver la variable que definimos porque es de nuestra clase 
	c.puertas = 3;
	System.out.println(c.pitar());
	System.out.println(c);//imprimios el contenido del toString
	
}

@Override
public String toString() {
	return marca + " " + modelo + " con matricula " + matricula + 
			" y combustible "+ combustible + " numero de puertas "
					+ ""+
			puertas;
}

}