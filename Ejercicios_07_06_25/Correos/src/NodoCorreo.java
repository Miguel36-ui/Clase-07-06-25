public class NodoCorreo {
    Correo correo;
    NodoCorreo siguiente;

    public NodoCorreo(Correo correo) {
        this.correo = correo;
        this.siguiente = null;
    }
}
