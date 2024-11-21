package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        bicicleta.moverse();
        bicicleta.acelerar(10);
        bicicleta.detenerse();


        coche.moverse();
        coche.acelerar(35);
        coche.detenerse();
    }
}
