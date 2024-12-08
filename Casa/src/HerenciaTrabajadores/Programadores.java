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

