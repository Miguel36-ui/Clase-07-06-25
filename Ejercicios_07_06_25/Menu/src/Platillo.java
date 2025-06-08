public class Platillo {
    private String nombre;
    private String descripcion;

    public Platillo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String mostrarDetalles() {
        return "* " + nombre + "\n- Descripción: " + descripcion;
    }
}
