public class MenuRestaurante {
    private Platillo[] platillos;

    public MenuRestaurante() {
        platillos = new Platillo[] {
                new Platillo("Pizza Margarita", "Masa delgada, queso mozzarella y albahaca."),
                new Platillo("Tacos al Pastor", "Tortilla de maíz con carne marinada y piña."),
                new Platillo("Hamburguesa Clásica", "Carne de res con queso, tomate y lechuga."),
                new Platillo("Sopa de Verduras", "Caldo caliente con verduras de temporada."),
                new Platillo("Ensalada César", "Lechuga, crutones, parmesano y aderezo césar."),
                new Platillo("Empanadas", "Lechuga, crema, rellenas de picadillo o q."),

        };
    }

    public void mostrarMenu() {
        System.out.println("\n--- MENÚ DEL DÍA ---");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + ": " + platillos[i].getNombre());
        }
    }

    public Platillo obtenerPlatillo(int indice) {
        if (indice >= 0 && indice < platillos.length) {
            return platillos[indice];
        } else {
            return null;
        }
    }

    public int getCantidadPlatillos() {
        return platillos.length;
    }

    public void editarDescripcion(int indice, String nuevaDescripcion) {
        if (indice >= 0 && indice < platillos.length) {
            platillos[indice].setDescripcion(nuevaDescripcion);
            System.out.println("Descripción actualizada correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
