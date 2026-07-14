package Logica;

import java.util.ArrayList;

//alamecena todas las figuras y cuerpos
public class Coleccion {
    private ArrayList<Figura> figuras;
    private ArrayList<Cuerpo> cuerpos;

    //constructor e inicializa las listas vacias
    public Coleccion() {
        figuras = new ArrayList<>();
        cuerpos = new ArrayList<>();
    }
    //getters y setters

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public ArrayList<Cuerpo> getCuerpos() {
        return cuerpos;
    }

    public void setCuerpos(ArrayList<Cuerpo> cuerpos) {
        this.cuerpos = cuerpos;
    }

    //agregar figura a la coleccion
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    //agregar cuerpo a la coleccion
    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    //Mostrar todas las figuras
    public void listaFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }
        for (Figura figura : figuras) {
            figura.imprimirInformacion();
            System.out.println();
        }
    }

    //Mostrar todas las cuerpos
    public void listaCuerpos() {
        if (cuerpos.isEmpty()) {
            System.out.println("No hay cuerpos registrados.");
            return;
        }
        for (Cuerpo cuerpo : cuerpos) {
            cuerpo.imprimirInformacion();
            System.out.println();
        }
    }

    //calcula el area de todas las figuras y cuerpos
    public double calcularAreaTotal() {
        double total = 0;
        //recorrer todas las figuras
        for (Figura figura : figuras) {
            total += figura.calcularArea();
        }
        //reocrre todos los cuerpos
        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularArea();
        }
        return total;
    }

    //Calcula el perimetro total de las
    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura figura : figuras) {
            total += figura.calcularPerimetro();
        }
        return total;
    }

    //calcular ell voliumen total de los cuerpos
    public double calcularVolumenTotal() {
        double total = 0;
        for (Cuerpo cuerpo : cuerpos) {
            total += cuerpo.calcularVolumen();
        }
        return total;
    }
}
