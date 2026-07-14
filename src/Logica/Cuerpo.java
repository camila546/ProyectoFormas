package Logica;
//clase abstracta
public abstract class Cuerpo implements Forma{
    @Override
    public abstract double calcularArea();


    @Override
    public abstract double calcularPerimetro();

    @Override
    public abstract void imprimirInformacion();

    public abstract double calcularVolumen();
}
