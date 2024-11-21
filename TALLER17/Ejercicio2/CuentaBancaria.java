package Ejercicio2;

public class CuentaBancaria {
    
    private String numCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numCuenta = "123456789";
        this.saldo = 0.0;
        this.tipoCuenta = "Corriente";
    }

    public CuentaBancaria(String numCuenta, double saldo, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public void datosCuenta(){
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("Numero de cuenta: "+getNumCuenta());
        System.out.println("Saldo de la cuenta: "+getSaldo());
        System.out.println("Tipo de cuenta: "+getTipoCuenta());
    }
    public void depositar(double deposito){
        double nuevoSaldo = getSaldo() + deposito;
        System.out.println("El deposito de "+deposito+" ha sido satisfactorio");
        System.out.println("El nuevo saldo es de: "+nuevoSaldo);
    }
    
}
