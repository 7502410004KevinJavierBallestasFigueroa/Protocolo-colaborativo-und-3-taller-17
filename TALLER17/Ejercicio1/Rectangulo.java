package Ejercicio1;

public class Rectangulo extends Figura {

    public Rectangulo(double alto, double ancho){
        super(alto, ancho);
    }

    @Override
    public double area(){
        return super.alto * super.ancho;
    }
}
