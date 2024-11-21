package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("054567", 20000, "Empresarial");
        CuentaBancaria cuenta2 = new CuentaAhorro("789452786", 120000);
        System.out.println("CUENTA BANCARIA");
        cuenta1.datosCuenta();
        System.out.println("CUENTA AHORROS");
        cuenta2.datosCuenta();
        System.out.println("DEPOSITO");
        cuenta2.depositar(1000);
    }
}
