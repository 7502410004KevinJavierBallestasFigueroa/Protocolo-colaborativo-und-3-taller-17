package Ejercicio1;

public class Circulo extends Figura {

    public Circulo (double radio){
        super(radio);
    }

    @Override
    public double area(){
        return Math.PI * super.radio * super.radio;
    }
}