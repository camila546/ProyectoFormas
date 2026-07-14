package Logica;
//representa el tetraedo y hereda de la clase cuerpo
//esta compuetso por 4 triangulos equilateros iguuales

import java.util.Objects;

public class Tetraedo extends Cuerpo {
    //atributos
    private Equilatero cara;

    //constructor
    public Tetraedo(Equilatero cara) {
        this.cara = cara;
    }
    //getter y setter
    public Equilatero getCara() {
        return cara;
    }
    public void setCara(Equilatero cara) {
        this.cara = cara;
    }

    //metodos
    //obtiene la longitud de la arista, todas son iguales
    //solo se consulta un lado del triangulo e
    private  double arista(){
        return cara.getLado1();
    }

    @Override
    public double calcularArea() {
        return 4* cara.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return cara.calcularPerimetro();
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(arista(),3) /(6* Math.sqrt(2));
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Tetraedo: ");
        System.out.println("Arista: " + arista());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tetraedo tetraedo = (Tetraedo) o;
        return Objects.equals(cara, tetraedo.cara);
    }

    @Override
    public String
    toString() {
        return "Tetraedo{" +
                "cara=" + cara +
                '}';
    }
}
