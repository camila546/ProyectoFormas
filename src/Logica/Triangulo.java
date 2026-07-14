package Logica;
//REPRESENTA TRIANGULO EN EL SISTEMA
// es una clase abtsracta para los diferentes tipos
public abstract class Triangulo  extends Figura {
    //atributos
    protected double lado1;
    protected double lado2;
    protected double lado3;

    //constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //getters y setters
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    //metodos
    @Override
    public double calcularArea() {
        double semiperimetro=calcularPerimetro() /2;
        return Math.sqrt(semiperimetro *(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo)) return false;

        Triangulo t = (Triangulo) o;

        return Double.compare(lado1, t.lado1) == 0 &&
                Double.compare(lado2, t.lado2) == 0 &&
                Double.compare(lado3, t.lado3) == 0;
    }
    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }

}
