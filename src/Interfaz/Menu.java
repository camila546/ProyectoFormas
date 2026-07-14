package Interfaz;
import Logica.Circulo;
import Logica.Coleccion;
import Logica.Rectangulo;
import Logica.Cuadrado;
import Logica.Rombo;
import Logica.Equilatero;
import Logica.Isosceles;
import Logica.Escaleno;
import Logica.Esfera;
import Logica.Cubo;
import Logica.Cilindro;
import Logica.Tetraedo;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Coleccion coleccion;

    //Constructor
    public Menu(Scanner scanner, Coleccion coleccion) {
        this.scanner = new Scanner(System.in);
        this.coleccion = coleccion;
    }

    //menu principal
    public void MostrarMenu(){
        int opcion;

        do{
            System.out.println("    Menú:   ");
            System.out.println("1. Agregar figura");
            System.out.println("2. Agregar cuerpo");
            System.out.println("3. Listar figuras");
            System.out.println("4. Listar cuerpos");
            System.out.println("5. Calcular área total");
            System.out.println("6. Calcular perímetro total");
            System.out.println("7. Calcular volumen total");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    agregarFigura();
                    break;
                case 2:
                    agregarCuerpo();
                    break;
                case 3:
                    coleccion.listaFiguras();
                    break;
                case 4:
                    coleccion.listaCuerpos();
                    break;
                case 5:
                    System.out.println("\nÁrea total: "
                            + coleccion.calcularAreaTotal());
                    break;
                case 6:
                    System.out.println("\nPerímetro total: "
                            + coleccion.calcularPerimetroTotal());
                    break;
                case 7:
                    System.out.println("\nVolumen total: "
                            + coleccion.calcularVolumenTotal());
                    break;
                case 8:
                    System.out.println("\nNos vemos!");
                    break;
                default:
                    System.out.println("\nOpcion inválida.");
            }
        } while(opcion != 8);
    }
    //submenu de agregar figura
    public void agregarFigura() {
        int opcion;

        do {
            System.out.println("      Agregar figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rombo");
            System.out.println("5. Triángulo");
            System.out.println("6. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarCirculo();
                    break;
                case 2:
                    agregarRectangulo();
                    break;
                case 3:
                    agregarCuadrado();
                    break;
                case 4:
                    agregarRombo();
                    break;
                case 5:
                    agregarTriangulo();
                    break;
                case 6:
                    System.out.println("\nRegresando al menú principal...");
                    break;
                default:
                    System.out.println("\nOpción inválida.");
            }
        } while (opcion != 6);
    }
    private void agregarCirculo() {
        System.out.print("\nIngrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);
        coleccion.agregarFigura(circulo);
        System.out.println("\nCírculo agregado correctamente");
    }

    private void agregarRectangulo() {
        System.out.print("\nIngrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        coleccion.agregarFigura(rectangulo);
        System.out.println("\nRectángulo agregado correctamente");
    }
    private void agregarCuadrado() {
        System.out.print("\nIngrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);
        coleccion.agregarFigura(cuadrado);
        System.out.println("\nCuadrado agregado correctamente");
    }
    private void agregarRombo() {
        System.out.print("\nIngrese la diagonal mayor: ");
        double diagonalMayor = scanner.nextDouble();
        System.out.print("Ingrese la diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();

        Rombo rombo = new Rombo(diagonalMayor, diagonalMenor);
        coleccion.agregarFigura(rombo);
        System.out.println("\nRombo agregado correctamente");
    }

    //el tipo de trinagulo se determina segun las medidas
    private void agregarTriangulo() {
        System.out.print("\nIngrese el lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double lado3 = scanner.nextDouble();

        // Verifica que las medidas formen un triángulo válido.
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("\nLas medidas ingresadas no forman un triángulo válido.");
            return;
        }

        // Determina automáticamente el tipo de triángulo.
        if (lado1 == lado2 && lado2 == lado3) {
            Equilatero equilatero = new Equilatero(lado1, lado2, lado3);
            coleccion.agregarFigura(equilatero);
            System.out.println("\nTriángulo equilátero agregado correctamente");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            Isosceles isosceles = new Isosceles(lado1, lado2, lado3);
            coleccion.agregarFigura(isosceles);
            System.out.println("\nTriángulo isósceles agregado correctamente");
        }
        else {
            Escaleno escaleno = new Escaleno(lado1, lado2, lado3);
            coleccion.agregarFigura(escaleno);
            System.out.println("\nTriángulo escaleno agregado correctamente");
        }
    }

    //submenu de los cuerpos
    public void agregarCuerpo() {
        int opcion;

        do {
            System.out.println("      Agregar cuerpo: ");
            System.out.println("1. Esfera");
            System.out.println("2. Cubo");
            System.out.println("3. Cilindro");
            System.out.println("4. Tetraedro");
            System.out.println("5. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarEsfera();
                    break;
                case 2:
                    agregarCubo();
                    break;
                case 3:
                    agregarCilindro();
                    break;
                case 4:
                    agregarTetraedo();
                    break;
                case 5:
                    System.out.println("\nRegresando al menú principal...");
                    break;
                default:
                    System.out.println("\nOpción inválida.");
            }
        } while (opcion != 5);
    }
    private void agregarEsfera() {
        System.out.print("\nIngrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        Esfera esfera = new Esfera(radio);
        coleccion.agregarCuerpo(esfera);
        System.out.println("\nEsfera agregada correctamente.");
    }
    private void agregarCubo() {
        System.out.print("\nIngrese el lado del cubo: ");
        double lado = scanner.nextDouble();

        // Se crea la cara del cubo.
        Cuadrado cara = new Cuadrado(lado);
        // Se crea el cubo a partir de su cara.
        Cubo cubo = new Cubo(cara);
        coleccion.agregarCuerpo(cubo);
        System.out.println("\nCubo agregado correctamente");
    }
    private void agregarCilindro() {
        System.out.print("\nIngrese el radio de la tapa: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        // Se crea la tapa del cilindro.
        Circulo tapa = new Circulo(radio);
        // Se crea el cilindro a partir de la tapa y la altura.
        Cilindro cilindro = new Cilindro(tapa, altura);
        coleccion.agregarCuerpo(cilindro);
        System.out.println("\nCilindro agregado correctamente");
    }
    private void agregarTetraedo() {
        System.out.print("\nIngrese la longitud de la arista: ");
        double arista = scanner.nextDouble();

        // Verifica que la arista sea válida.
        if (arista <= 0) {
            System.out.println("\nLa arista debe ser mayor que cero.");
            return;
        }
        // Se crea la cara del tetraedro.
        Equilatero cara = new Equilatero(arista, arista, arista);
        // Se crea el tetraedro utilizando la cara.
        Tetraedo tetraedo = new Tetraedo(cara);
        // Se agrega el tetraedro a la colección.
        coleccion.agregarCuerpo(tetraedo);
        System.out.println("\n¡Tetraedro agregado correctamente!");
    }
}
