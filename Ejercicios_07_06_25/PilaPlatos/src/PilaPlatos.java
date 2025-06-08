import java.util.Stack;

public class PilaPlatos {
    private Stack<Plato> pila;

    public PilaPlatos() {
        pila = new Stack<>();
    }

    // CREATE
    public void agregarPlato(Plato plato) {
        pila.push(plato);
        System.out.println("Plato agregado a la pila.");
    }

    // READ
    public void verPlatoSuperior() {
        if (pila.isEmpty()) {
            System.out.println("No hay platos en la pila.");
        } else {
            Plato tope = pila.peek();
            System.out.println("Plato en la cima de la pila: " + tope.getNombre());
        }
    }

    // UPDATE
    public void actualizarPlatoSuperior(String nuevoNombre) {
        if (pila.isEmpty()) {
            System.out.println("No hay platos para actualizar.");
        } else {
            Plato tope = pila.peek();
            tope.setNombre(nuevoNombre);
            System.out.println("Plato en la cima actualizado.");
        }
    }

    // DELETE
    public void lavarUltimoPlato() {
        if (pila.isEmpty()) {
            System.out.println("No hay platos para lavar.");
        } else {
            Plato eliminado = pila.pop();
            System.out.println("Plato lavado y retirado: " + eliminado.getNombre());
        }
    }
}
