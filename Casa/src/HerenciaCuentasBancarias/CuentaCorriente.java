package HerenciaCuentasBancarias;

import java.time.LocalDate;

public class CuentaCorriente extends Cuentas {
    private double limiteDescubierto;
    private boolean tarjetaDebito;


	public CuentaCorriente(String titular, double saldo, int numeroCuenta, LocalDate fechaApertura,
			double limiteDescubierto, boolean tarjetaDebito) {
		super(titular, saldo, numeroCuenta, fechaApertura);
		this.limiteDescubierto = limiteDescubierto;
		this.tarjetaDebito = tarjetaDebito;
	}

	@Override
    public boolean retirar(double monto) {
        if (monto > 0 && (getSaldo() - monto) >= -limiteDescubierto) {
            setSaldo(getSaldo() - monto);
            return true;
        }
        System.out.println("No se puede retirar. Excede el límite de descubierto.");
        return false;
    }

    @Override
    public void detalles() {
        System.out.println("Cuenta Corriente:");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Número de cuenta: " + getNumeroCuenta());
        System.out.println("Fecha de apertura: " + getFechaApertura());
        System.out.println("Límite de descubierto: " + limiteDescubierto);
        System.out.println("Tarjeta de débito: " + (tarjetaDebito ? "Sí" : "No"));
    }
}

