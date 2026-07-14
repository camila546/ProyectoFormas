package Logica;
//representa al cilindro,  hereda de Cuerpo
//el cilindro esta compuesto por circulo(tapa) y rectangulo (cara lateral)

import java.util.Objects;

public class Cilindro extends Cuerpo {
    //atributos
    private Circulo tapa;
    private Rectangulo caraLateral;

    //constructor
    public Cilindro(Circulo tapa, double altura) {
        this.tapa = tapa; //el circulo recibido s eguarda
        // La base del rectángulo corresponde a la circunferencia del círculo.
        double circunferencia = 2 * Math.PI * tapa.getRadio();
        this.caraLateral = new Rectangulo(circunferencia, altura); //se crea la cara lateral
    }
    //geters y setters
    public Circulo getTapa() {
        return tapa;
    }
    public void setTapa(Circulo tapa) {
        this.tapa = tapa;
    }

    public Rectangulo getCaraLateral() {
        return caraLateral;
    }
    public void setCaraLateral(Rectangulo caraLateral) {
        this.caraLateral = caraLateral;
    }
    //metodos
    private double altura(){ //altura del cilidro que corresponde
        return caraLateral.getAltura();  //a la altura del rectabgulo lateral
    }

    @Override
    public double calcularArea() {
        return caraLateral.calcularArea()+(2* tapa.calcularArea());
    }

    @Override
    public double calcularPerimetro() {//no tiene
        return tapa.calcularPerimetro();
    }

    @Override
    public double calcularVolumen() {
        return tapa.calcularArea()*altura();
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cilindro: ");
        System.out.println("Radio: " + tapa.getRadio());
        System.out.println("Altura: " + altura());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Volumen: " + calcularVolumen());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cilindro cilindro = (Cilindro) o;
        return Objects.equals(tapa, cilindro.tapa) && Objects.equals(caraLateral, cilindro.caraLateral);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "tapa=" + tapa +
                ", caraLateral=" + caraLateral +
                '}';
    }
}
