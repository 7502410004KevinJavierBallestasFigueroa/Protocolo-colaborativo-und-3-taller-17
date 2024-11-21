package Ejercicio2;

public class CuentaAhorro extends CuentaBancaria{

    public CuentaAhorro(String numCuenta, double saldo){
        super(numCuenta, saldo, "Ahorro");
    }
    @Override
    public void depositar(double deposito){
        double nuevoSaldo = getSaldo() + deposito - (deposito*4/1000);
        System.out.println("El deposito de "+deposito+" ha sido satisfactorio, se le ha descontado el 4x1000");
        System.out.println("El nuevo saldo es de: "+nuevoSaldo);
    }
}
