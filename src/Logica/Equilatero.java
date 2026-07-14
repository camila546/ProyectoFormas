package Logica;
//triangulo equilatero y hereda de la clase triangulo

public class Equilatero extends Triangulo {
    //constructor
    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Triangulo equilatero: ");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equilatero)) return false;
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Equilatero{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
