package Logica;

import java.util.Objects;

//Representa el rectangulo en el sistema  y herreda figura
public class Rectangulo extends Figura{
    //atributos
    protected double base;
    protected double altura;

    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //gettetr setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //metodos

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 *(base + altura);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Rectangulo: ");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(base, that.base) == 0 && Double.compare(altura, that.altura) == 0;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
