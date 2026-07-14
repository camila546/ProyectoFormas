package Logica;
//representa al cubo  hereda de Cuerpo
//el profe dijo que no alamcena una arista como dato primitvo
//relacion composicion con un objeto cuadrado

import java.util.Objects;

public class Cubo extends Cuerpo{
    //atirbuto
    private Cuadrado cara;

    //constructor
    public Cubo(Cuadrado cara) {
        this.cara = cara;
    }
    //GETTER Y SETTERS
    public Cuadrado getCara() {
        return cara;
    }
    public void setCara(Cuadrado cara) {
        this.cara = cara;
    }
    //metodos
    @Override
    public double calcularArea() {
        return 6* cara.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return cara.calcularPerimetro();
    }
    private double arista(){
        return cara.getBase();
    }
    @Override
    public double calcularVolumen() {
        return Math.pow(arista(),3);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cubo: ");
        System.out.println("Arista: " + arista());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cubo cubo = (Cubo) o;
        return Objects.equals(cara, cubo.cara);
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "cara=" + cara +
                '}';
    }
}
