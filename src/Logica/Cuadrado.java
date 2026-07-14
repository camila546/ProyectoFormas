package Logica;
//representa cuadrado en el sistema y hereda de la clase rectangulo
public class Cuadrado extends Rectangulo{

    //constructor
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Cuadrado: ");
        System.out.println("Lado: " + base);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cuadrado)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                '}';
    }
}
