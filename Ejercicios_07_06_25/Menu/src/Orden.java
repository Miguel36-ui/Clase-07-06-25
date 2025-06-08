public class Orden {
    private Platillo platilloOrdenado;

    public void ordenarPlatillo(Platillo platillo) {
        this.platilloOrdenado = platillo;
        System.out.println("# Has ordenado: " + platillo.getNombre());
    }

    public void eliminarOrden() {
        if (platilloOrdenado != null) {
            System.out.println("# Se eliminó la orden: " + platilloOrdenado.getNombre());
            platilloOrdenado = null;
        } else {
            System.out.println("No hay ninguna orden para eliminar.");
        }
    }

    public boolean tieneOrden() {
        return platilloOrdenado != null;
    }
}
