package Ejercicio3;

public class Coche extends Transporte {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve a 100 km/h.");
    }
    @Override
    public void detenerse() {
        System.out.println("El coche se ha detenido");
    }
}

