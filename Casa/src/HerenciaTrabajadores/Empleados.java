package HerenciaTrabajadores;

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

