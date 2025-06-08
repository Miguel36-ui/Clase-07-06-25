import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuRestaurante menu = new MenuRestaurante();
        Orden orden = new Orden();

        String reseña = null;
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Ver menú completo");
            System.out.println("2. Editar platillo");
            System.out.println("3. Eliminar orden");
            System.out.println("4. Dejar reseña");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menu.mostrarMenu();
                    System.out.print("\nElija un número para ver detalles del platillo: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    Platillo seleccionado = menu.obtenerPlatillo(num);
                    if (seleccionado != null) {
                        System.out.println("\n" + seleccionado.mostrarDetalles());
                        System.out.print("\n¿Desea ordenar este platillo? (s/n): ");
                        String respuesta = sc.nextLine();

                        if (respuesta.equalsIgnoreCase("s")) {
                            orden.ordenarPlatillo(seleccionado);
                        } else {
                            System.out.println("Volviendo al menú principal...");
                        }
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 2:
                    menu.mostrarMenu();
                    System.out.print("Ingrese el número del platillo a editar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    menu.editarDescripcion(indice, nuevaDesc);
                    break;

                case 3:
                    orden.eliminarOrden();
                    break;

                case 4:
                    System.out.print("Escriba su reseña: ");
                    reseña = sc.nextLine();
                    System.out.println("Gracias por su reseña: \"" + reseña + "\"");
                    break;

                case 5:
                    System.out.println("¡Gracias por visitarnos!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
