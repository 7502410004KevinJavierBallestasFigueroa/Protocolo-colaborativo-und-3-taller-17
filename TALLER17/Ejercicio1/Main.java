package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo1 = new Rectangulo(2, 3);
        Figura circulo1 = new Circulo(2);

        System.out.println("El área del rectangulo es: ");
        System.out.println("");
        System.out.println(rectangulo1.area());
        System.out.println("El área del circulo es: ");
        System.out.println("");
        System.out.println(circulo1.area());

    }
}
