import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCorreos lista = new ListaCorreos();
        int opcion;

        do {
            System.out.println("\n--- Menú de Correos Reenviados ---");
            System.out.println("1. Agregar nuevo correo");
            System.out.println("2. Mostrar cadena de reenvío");
            System.out.println("3. Eliminar correo por dirección");
            System.out.println("4. Editar correo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Dirección de correo: ");
                    String direccion = sc.nextLine();
                    System.out.print("Asunto: ");
                    String asunto = sc.nextLine();
                    System.out.print("Contenido: ");
                    String contenido = sc.nextLine();
                    lista.agregarCorreo(new Correo(direccion, asunto, contenido));
                    break;

                case 2:
                    lista.mostrarCadena();
                    break;

                case 3:
                    ArrayList<String> direccionesEliminar = lista.obtenerDirecciones();
                    if (direccionesEliminar.isEmpty()) {
                        System.out.println("No hay correos para eliminar.");
                        break;
                    }
                    System.out.println("Correos disponibles:");
                    for (int i = 0; i < direccionesEliminar.size(); i++) {
                        System.out.println((i + 1) + ". " + direccionesEliminar.get(i));
                    }
                    System.out.print("Seleccione el número del correo que desea eliminar: ");
                    int eliminarIndex = sc.nextInt();
                    sc.nextLine();
                    if (eliminarIndex >= 1 && eliminarIndex <= direccionesEliminar.size()) {
                        String dirEliminar = direccionesEliminar.get(eliminarIndex - 1);
                        lista.eliminarCorreo(dirEliminar);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 4:
                    ArrayList<String> direccionesEditar = lista.obtenerDirecciones();
                    if (direccionesEditar.isEmpty()) {
                        System.out.println("No hay correos para editar.");
                        break;
                    }
                    System.out.println("Correos disponibles:");
                    for (int i = 0; i < direccionesEditar.size(); i++) {
                        System.out.println((i + 1) + ". " + direccionesEditar.get(i));
                    }
                    System.out.print("Seleccione el número del correo que desea editar: ");
                    int editarIndex = sc.nextInt();
                    sc.nextLine();
                    if (editarIndex >= 1 && editarIndex <= direccionesEditar.size()) {
                        String dirEditar = direccionesEditar.get(editarIndex - 1);
                        System.out.print("Nuevo asunto: ");
                        String nuevoAsunto = sc.nextLine();
                        System.out.print("Nuevo contenido: ");
                        String nuevoContenido = sc.nextLine();
                        lista.editarCorreo(dirEditar, nuevoAsunto, nuevoContenido);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

