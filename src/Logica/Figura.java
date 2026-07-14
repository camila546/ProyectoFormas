package Logica;

public abstract class Figura implements Forma {
    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract void imprimirInformacion();
}
