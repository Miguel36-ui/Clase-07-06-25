public class Plato {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    @Override
    public String toString() {
        return "Plato: " + nombre;
    }
}
