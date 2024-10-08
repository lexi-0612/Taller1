package Cuentas;

public class CuentaDeAhorro extends Cuenta {
    boolean activo;

    public CuentaDeAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activo = true;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
