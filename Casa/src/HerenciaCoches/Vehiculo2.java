package HerenciaCoches;

public class Vehiculo2 {
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected String combustible;

    // Constructor parametrizado
    public Vehiculo2(String marca, String modelo, String matricula, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.combustible = combustible;
    }

    public String pitar() {
        return "¡Piiii!";
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + 
               ", Matrícula: " + matricula + ", Combustible: " + combustible;
    }
}

