package Logica;
//triangulo isosceles y hereda de la clase triangulo

public class Isosceles extends Triangulo {
    //constructor
    public Isosceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triangulo isosceles: ");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    @Override
    public String toString() {
        return "Isosceles{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
