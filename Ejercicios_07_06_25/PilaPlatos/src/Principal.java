import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaPlatos pila = new PilaPlatos();
        int opcion;

        do {
            System.out.println("\n--- Pila de Platos ---");
            System.out.println("1. Agregar plato");
            System.out.println("2. Ver plato superior");
            System.out.println("3. Actualizar plato superior");
            System.out.println("4. Lavar último plato");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del nuevo plato: ");
                    String nombre = sc.nextLine();
                    pila.agregarPlato(new Plato(nombre));
                    break;
                case 2:
                    pila.verPlatoSuperior();
                    break;
                case 3:
                    System.out.print("Nuevo nombre para el plato superior: ");
                    String nuevoNombre = sc.nextLine();
                    pila.actualizarPlatoSuperior(nuevoNombre);
                    break;
                case 4:
                    pila.lavarUltimoPlato();
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
