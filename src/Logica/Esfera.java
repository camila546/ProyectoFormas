package Logica;
//representa esfera en el sistema y hereda de la classe cuerpo

import java.util.Objects;

public class Esfera extends Cuerpo{
    //atributos
    private double radio;

    //constructor
    public Esfera(double radio) {
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
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() { //no tiene
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return (4.0 /3.0)*Math.PI * Math.pow(radio,3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Esfera: ");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Esfera esfera = (Esfera) o;
        return Double.compare(radio, esfera.radio) == 0;
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}
