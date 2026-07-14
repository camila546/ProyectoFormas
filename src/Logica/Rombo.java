package Logica;

import java.util.Objects;

//representa rombo en el sistema y hereda de figua
public class Rombo extends Figura {
    //atributos
    private double diagonalMayor;
    private double diagonalMenor;

    //constructor
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    //getter y setters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    //metodos

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor)/2;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2,2) + Math.pow(diagonalMenor / 2,2));
        return 4*lado;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Rombo: ");
        System.out.println("Diagonal mayor: " + diagonalMayor);
        System.out.println("Diagonal menor: " + diagonalMenor);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rombo rombo = (Rombo) o;
        return Double.compare(diagonalMayor, rombo.diagonalMayor) == 0 && Double.compare(diagonalMenor, rombo.diagonalMenor) == 0;
    }

    @Override
    public String toString() {
        return "Rombo{" +
                "diagonalMayor=" + diagonalMayor +
                ", diagonalMenor=" + diagonalMenor +
                '}';
    }
}
