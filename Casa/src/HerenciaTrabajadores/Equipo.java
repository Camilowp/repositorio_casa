package Copias;

import java.time.LocalDate;
import java.time.Period;

package Test;

import Herencia_y_Polimorfismo.Analistas;
import Herencia_y_Polimorfismo.Empleados;
import Herencia_y_Polimorfismo.JefeDeProyecto;
import Herencia_y_Polimorfismo.Programadores;

public class TestEmpleados {

	public static void main(String[] args) {

        JefeDeProyecto jefe = new JefeDeProyecto("Carlos", "Gómez", "A123", 50000.00, 4); 
       
        System.out.println("El bono extra de " + jefe.getNombre() + " es: " + jefe.bono(0.1));
    
        Analistas analista = new Analistas("Ana", "Martínez", "B123", 30000.00, 5); 
        
        System.out.println("El bono extra de " + analista.getNombre() + " es: " + analista.bono(0.1));
        
        Programadores programador = new Programadores("Sara", "Jones", "C123", 18000.00, new String[] {"Java", "C++", "Python"});

        System.out.println("El bono extra de " + programador.getNombre() + " es " + programador.bono(0.1));
	}

}


package Herencia_y_Polimorfismo;

public class Empleados {
		protected String nombre;
		protected String apellido;
		protected String matricula;
		protected double sueldo;
		
		public Empleados(String nombre, String apellido, String matricula, double sueldo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.matricula = matricula;
			this.sueldo = sueldo;
		}
	
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	   
	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    
	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	
	    public double getSueldo() {
	        return sueldo;
	    }

	    public void setSueldo(double sueldo) {
	        this.sueldo = sueldo;
	    }
		
		 public double bono( double porcentajeBono) {
		        return sueldo*porcentajeBono;
		    }
		 
		
}

package Herencia_y_Polimorfismo;

public class JefeDeProyecto extends Empleados {

 
    private int proyectosCompletados;

    // Constructor
    public JefeDeProyecto(String nombre, String apellido, String matricula, double sueldo, int proyectosCompletados) {
        super(nombre, apellido, matricula, sueldo); 
        this.proyectosCompletados = proyectosCompletados; 
    }
//SOBREESCRIBIMOS EL METODO DE LA CLASE PADRE, SE DEBE ESCRIBIR IGUAL EL METODO
    @Override
    public double bono(double porcentaje) {
       return super.bono(porcentaje) + (1000*proyectosCompletados);//LLAMAMOS LA FUNCIÓN CON EL SUPER 
    }


    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

}

package Herencia_y_Polimorfismo;

public class Analistas extends Empleados {

    private double bonoExtra; 
    private int numLenguajes;  
    private final double PORCENTAJE_PLUS = 0.15;
    
    public Analistas(String nombre, String apellido, String matricula, double sueldo, int numLenguajes) {
        super(nombre, apellido, matricula, sueldo);
        this.numLenguajes = numLenguajes; 
    }
    //SE SOBREESCRIBE EL METODO DE LA CLASE PADRE PA CAMBIAR EL BONO Y AÑADIRLE EL PORCENTAJE ADICIONAL
    @Override
    public double bono(double porcentaje) {
    	return super.bono(porcentaje+PORCENTAJE_PLUS);
    }

  
    public double getBonoExtra() {
        return bonoExtra;
    }

  
    public int getNumLenguajes() {
        return numLenguajes;
    }

    public void setNumLenguajes(int numLenguajes) {
        this.numLenguajes = numLenguajes;
    }

    
}


package HerenciaTrabajadores;

public class Programadores extends Empleados {

    
    private String[]lenguajesCertificados;


    public Programadores(String nombre, String apellido, String matricula, double sueldo,String[]lenguajesCertificados) {
		super(nombre, apellido, matricula, sueldo);
		this.lenguajesCertificados =lenguajesCertificados;
	}
//SE SOBREESCRIBE PARA OBTENER EL BONO + 500€ PO CADA LENGUAJE QUE SE TENGA , SE HACE CON UN ARRAY
    public double bono(double porcentaje) {
    	return super.bono(porcentaje)+(500*lenguajesCertificados.length);
    }

    
}