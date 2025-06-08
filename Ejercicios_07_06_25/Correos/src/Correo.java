public class Correo {
    private String direccion;
    private String asunto;
    private String contenido;

    public Correo(String direccion, String asunto, String contenido) {
        this.direccion = direccion;
        this.asunto = asunto;
        this.contenido = contenido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Para: " + direccion + "\nAsunto: " + asunto + "\nContenido: " + contenido;
    }
}
