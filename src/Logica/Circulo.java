package Logica;

import java.util.Objects;

//representa el circulo dentro del sistema y herreda la clase figura
public class Circulo extends Figura {
    //atributos
    private double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Circulo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(radio, circulo.radio) == 0;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
