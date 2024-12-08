package HerenciaTrabajadores;


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

