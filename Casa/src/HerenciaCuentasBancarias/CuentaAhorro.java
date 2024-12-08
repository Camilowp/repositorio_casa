package HerenciaCuentasBancarias;

import java.time.LocalDate;

public class CuentaAhorro extends Cuentas {
	    private double tasaInteres; // Porcentaje, por ejemplo, 0.01 para 1%
	    private final int retiradasGratuitas = 5;;
	    private int retiradasActuales;

	    
	    public CuentaAhorro(String titular, double saldo, int numeroCuenta, LocalDate fechaApertura, double tasaInteres,
			int retiradasActuales) {
		super(titular, saldo, numeroCuenta, fechaApertura);
		this.tasaInteres = tasaInteres;
		this.retiradasActuales = retiradasActuales;
	}



		public double calcularInteres() {
	        return getSaldo() * tasaInteres;
	    }

	    @Override
	    public boolean retirar(double monto) {
	        if (super.getSaldo() < monto) {
	            System.out.println("Saldo insuficiente.");
	            return false;
	        }
	        if (retiradasActuales >= retiradasGratuitas) {
	            monto += 1; // Comisión de 1 euro
	        }
	        boolean retiroExitoso = super.retirar(monto);
	        if (retiroExitoso) {
	            retiradasActuales++;
	        }
	        return retiroExitoso;
	    }

	    @Override
	    public void detalles() {
	        System.out.println("Cuenta de Ahorro:");
	        System.out.println("Titular: " + getTitular());
	        System.out.println("Saldo: " + getSaldo());
	        System.out.println("Número de cuenta: " + getNumeroCuenta());
	        System.out.println("Fecha de apertura: " + getFechaApertura());
	        System.out.println("Tasa de interés: " + (tasaInteres * 100) + "%");
	        System.out.println("Retiradas gratuitas restantes: " + (retiradasGratuitas - retiradasActuales));
	    }
	}


