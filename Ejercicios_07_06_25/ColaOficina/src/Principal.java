import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaOficina oficina = new ColaOficina();
        int opcion;

        do {
            System.out.println("\n--- Fila en Oficina ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Ver quién sigue (READ)");
            System.out.println("3. Actualizar datos de la primera persona");
            System.out.println("4. Atender persona");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = sc.nextLine();
                    oficina.agregarPersona(new Persona(nombre));
                    break;
                case 2:
                    oficina.verQuienSigue();
                    break;
                case 3:
                    if (!oficina.estaVacia()) {
                        System.out.print("Nuevo nombre para la primera persona: ");
                        String nuevoNombre = sc.nextLine();
                        oficina.actualizarPrimeraPersona(nuevoNombre);
                    } else {
                        System.out.println("No hay nadie para actualizar.");
                    }
                    break;
                case 4:
                    oficina.atenderPersona();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
