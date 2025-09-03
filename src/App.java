// Clase Main para probar
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear objeto libro1 con constructor con parámetros+
        Libro libro1 = new Libro("Pedro el escamoso", "Pedro", 5, 2);

        // Crear objeto libro2 con constructor por defecto y luego asignar valores
        Libro libro2 = new Libro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese título del libro 2: ");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor del libro 2: ");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese número de ejemplares: ");
        libro2.setNumEjemplares(sc.nextInt());

        libro2.setNumPrestados(0); // por defecto ninguno prestado

        // Mostrar información inicial
        System.out.println("\n--- Información de libros ---");
        System.out.println(libro1);
        System.out.println(libro2);

        // Probar préstamo y devolución
        System.out.println("\nPréstamo de libro1: " + libro1.prestar());
        System.out.println("Devolución de libro1: " + libro1.devolver());

        System.out.println("\nPréstamo de libro2: " + libro2.prestar());
        System.out.println("Devolución de libro2: " + libro2.devolver());

        // Mostrar información final //Ultimas pruebas Ejcecución
        System.out.println("\n--- Estado final de libros ---");
        System.out.println(libro1);
        System.out.println(libro2);

        sc.close();
    }
}
