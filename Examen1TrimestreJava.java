
/**
 *
 * @author sergio.gaite
 */
import java.util.Scanner;

public class Examen1TrimestreJava {

    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static double volumenPrismaRectangular(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static double volumenCilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    public static double volumenCono(double radio, double altura) {
        return (Math.PI * radio * radio * altura) / 3.0;
    }

    public static void mostrarResultado(String nombre, double volumen) {
        System.out.println("Volumen del " + nombre + ": " + volumen);
    }

    public static void errorMedidas() {
        System.out.println("Error, no se permiten medidas negativas.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- CALCULADORA DE VOLUMENES -----");
            System.out.println("1. Cubo");
            System.out.println("2. Prisma rectangular");
            System.out.println("3. Cilindro");
            System.out.println("4. Esfera");
            System.out.println("5. Cono");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce el lado: ");
                    double lado = sc.nextDouble();

                    if (lado < 0) {
                        errorMedidas();
                    } else {
                        mostrarResultado("cubo", volumenCubo(lado));
                    }
                    break;

                case 2:
                    System.out.print("Introduce el largo: ");
                    double largo = sc.nextDouble();

                    System.out.print("Introduce el ancho: ");
                    double ancho = sc.nextDouble();

                    System.out.print("Introduce el alto: ");
                    double alto = sc.nextDouble();

                    if (largo < 0 || ancho < 0 || alto < 0) {
                        errorMedidas();
                    } else {
                        mostrarResultado("prisma rectangular",
                                volumenPrismaRectangular(largo, ancho, alto));
                    }
                    break;

                case 3:
                    System.out.print("Introduce el radio: ");
                    double radioC = sc.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double alturaC = sc.nextDouble();

                    if (radioC < 0 || alturaC < 0) {
                        errorMedidas();
                    } else {
                        mostrarResultado("cilindro",
                                volumenCilindro(radioC, alturaC));
                    }
                    break;

                case 4:
                    System.out.print("Introduce el radio: ");
                    double radioE = sc.nextDouble();

                    if (radioE < 0) {
                        errorMedidas();
                    } else {
                        mostrarResultado("esfera",
                                volumenEsfera(radioE));
                    }
                    break;

                case 5:
                    System.out.print("Introduce el radio: ");
                    double radio = sc.nextDouble();

                    System.out.print("Introduce la altura: ");
                    double altura = sc.nextDouble();

                    if (radio < 0 || altura < 0) {
                        errorMedidas();
                    } else {
                        mostrarResultado("cono",
                                volumenCono(radio, altura));
                    }
                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
