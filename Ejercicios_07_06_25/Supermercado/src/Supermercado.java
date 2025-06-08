import java.util.ArrayList;

public class Supermercado {
    private ArrayList<Producto> catalogo;
    private ArrayList<ItemCompra> listaCompras;

    public Supermercado() {
        catalogo = new ArrayList<>();
        listaCompras = new ArrayList<>();

        // Productos predefinidos
        catalogo.add(new Producto("Leche", 22.50));
        catalogo.add(new Producto("Pan", 15.00));
        catalogo.add(new Producto("Huevos (12)", 35.00));
        catalogo.add(new Producto("Arroz (1kg)", 18.75));
        catalogo.add(new Producto("Frijoles (1kg)", 20.00));
        catalogo.add(new Producto("Cereal", 40.00));
        catalogo.add(new Producto("Jugo", 25.00));
    }

    public void mostrarCatalogo() {
        System.out.println("\n--- Catálogo de Productos ---");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(i + ". " + catalogo.get(i));
        }
    }

    public Producto obtenerProductoCatalogo(int indice) {
        if (indice >= 0 && indice < catalogo.size()) {
            return catalogo.get(indice);
        }
        return null;
    }

    public void agregarProducto(ItemCompra item) {
        listaCompras.add(item);
        System.out.println("Producto agregado a la lista.");
    }

    public void mostrarLista() {
        if (listaCompras.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
        } else {
            System.out.println("\n--- Lista de Compras ---");
            double total = 0;
            for (int i = 0; i < listaCompras.size(); i++) {
                System.out.println(i + ". " + listaCompras.get(i));
                total += listaCompras.get(i).getSubtotal();
            }
            System.out.println("Total: $" + total);
        }
    }

    public void eliminarProducto(int indice) {
        if (indice >= 0 && indice < listaCompras.size()) {
            listaCompras.remove(indice);
            System.out.println("Producto eliminado de la lista.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void editarCantidad(int indice, int nuevaCantidad) {
        if (indice >= 0 && indice < listaCompras.size()) {
            listaCompras.get(indice).setCantidad(nuevaCantidad);
            System.out.println("Cantidad actualizada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public boolean listaVacia() {
        return listaCompras.isEmpty();
    }
}
