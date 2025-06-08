import java.util.ArrayList;

public class ListaCorreos {
    private NodoCorreo cabeza;

    public ListaCorreos() {
        cabeza = null;
    }

    public void agregarCorreo(Correo correo) {
        NodoCorreo nuevo = new NodoCorreo(correo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoCorreo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        System.out.println("Correo agregado al final de la cadena.");
    }

    public void mostrarCadena() {
        if (cabeza == null) {
            System.out.println("La cadena de correos está vacía.");
            return;
        }
        NodoCorreo actual = cabeza;
        int index = 1;
        System.out.println("\n--- Cadena de Reenvío ---");
        while (actual != null) {
            System.out.println("Correo #" + index++);
            System.out.println(actual.correo);
            System.out.println("---------------------------");
            actual = actual.siguiente;
        }
    }

    public ArrayList<String> obtenerDirecciones() {
        ArrayList<String> direcciones = new ArrayList<>();
        NodoCorreo actual = cabeza;
        while (actual != null) {
            direcciones.add(actual.correo.getDireccion());
            actual = actual.siguiente;
        }
        return direcciones;
    }

    public void eliminarCorreo(String direccion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.correo.getDireccion().equalsIgnoreCase(direccion)) {
            cabeza = cabeza.siguiente;
            System.out.println("Correo eliminado.");
            return;
        }

        NodoCorreo actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.correo.getDireccion().equalsIgnoreCase(direccion)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            System.out.println("Correo no encontrado.");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Correo eliminado.");
        }
    }

    public void editarCorreo(String direccion, String nuevoAsunto, String nuevoContenido) {
        NodoCorreo actual = cabeza;
        while (actual != null) {
            if (actual.correo.getDireccion().equalsIgnoreCase(direccion)) {
                actual.correo.setAsunto(nuevoAsunto);
                actual.correo.setContenido(nuevoContenido);
                System.out.println("Correo editado con éxito.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("Correo no encontrado.");
    }
}
