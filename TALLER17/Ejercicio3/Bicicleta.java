package Ejercicio3;

public class Bicicleta extends Transporte {
    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve a 15 km/h.");
    }
    @Override
    public void detenerse() {
        System.out.println("La bicicleta se ha detenido");
    }
}