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
    private int contrasenya;

    /**
     * @param args the command line arguments
     */
    public Cuenta(int numeroCuenta, int saldo, int contrasenya) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.contrasenya = contrasenya;
    }
    
    public int getContrasenya() {
        return contrasenya;
    }
    
    public void setContrasenya() {
        this.contrasenya = contrasenya;
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

    
   
    
    
    
    public boolean isAutentificacion(int contrasenya) {
        if (this.contrasenya != contrasenya) {
            return false;
            
        } else {
            return true;
        }

        
        
    }

    public boolean isTransferenciaNumerosRojos(int cantidad) {
        if ((getSaldo() - cantidad) < 0) {
            return false;
        } else {
            return true;
        }


    }

    public String transferencia(Cuenta cuentaDestino, int cantidad) {


        if (getSaldo() < 0) {
            return "no puedes hacer las transferencias por moroso, consigue mas pasta";
        }

        if ((getSaldo() - cantidad) < 0) {
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
