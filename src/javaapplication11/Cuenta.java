/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author alumno
 */
public class Cuenta {

    private int numeroCuenta;
    private int contraseñaCuenta;
    private int saldo;

    /**
     * @param args the command line arguments
     */
    public Cuenta(int name, int saldo) {
        numeroCuenta = name;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int valor) {
        numeroCuenta = valor;
    }

    public String transferencia(Cuenta cuentaDestino, int cantidad) {
        if (getSaldo() < 0) {
            return "no puedes hacer las transferencias por moroso, consigue mas pasta";
        }
        if((getSaldo()-cantidad)<0 ){
            return "te quedarias sin pasta y serias un moroso asi que no te dejo hacer la transferencia, so burro";
        }
        
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);
        saldo = saldo - cantidad;

        return null;
    }

    void setSaldo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
