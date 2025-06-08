import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supermercado supermercado = new Supermercado();

        int opcion;

        do {
            System.out.println("\n=== Menú de Supermercado ===");
            System.out.println("1. Agregar productos");
            System.out.println("2. Eliminar productos");
            System.out.println("3. Editar productos");
            System.out.println("4. Ver productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    supermercado.mostrarCatalogo();
                    System.out.print("Ingrese el número del producto a agregar: ");
                    int indice = sc.nextInt();
                    Producto seleccionado = supermercado.obtenerProductoCatalogo(indice);
                    if (seleccionado != null) {
                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = sc.nextInt();
                        supermercado.agregarProducto(new ItemCompra(seleccionado, cantidad));
                    } else {
                        System.out.println("Producto inválido.");
                    }
                    break;

                case 2:
                    supermercado.mostrarLista();
                    if (!supermercado.listaVacia()) {
                        System.out.print("Ingrese el número del producto a eliminar: ");
                        int eliminar = sc.nextInt();
                        supermercado.eliminarProducto(eliminar);
                    }
                    break;

                case 3:
                    supermercado.mostrarLista();
                    if (!supermercado.listaVacia()) {
                        System.out.print("Ingrese el número del producto a editar cantidad: ");
                        int editar = sc.nextInt();
                        System.out.print("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = sc.nextInt();
                        supermercado.editarCantidad(editar, nuevaCantidad);
                    }
                    break;

                case 4:
                    supermercado.mostrarLista();
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema del supermercado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
