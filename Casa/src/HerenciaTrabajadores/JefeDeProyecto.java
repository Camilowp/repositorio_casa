package HerenciaTrabajadores;

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

