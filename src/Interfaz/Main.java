package Interfaz;
import Interfaz.Menu;
import Logica.Coleccion;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coleccion coleccion = new Coleccion();
        Menu menu = new Menu(scanner, coleccion);
        menu.MostrarMenu();
    }
}