import java.util.LinkedList;
import java.util.Queue;

public class ColaOficina {
    private Queue<Persona> cola;

    public ColaOficina() {
        cola = new LinkedList<>();
    }

    // CREATE
    public void agregarPersona(Persona persona) {
        cola.offer(persona); // Agrega al final de la cola
        System.out.println("Persona agregada a la fila.");
    }

    // READ
    public void verQuienSigue() {
        if (cola.isEmpty()) {
            System.out.println("No hay personas en la fila.");
        } else {
            System.out.println("Siguiente persona en la fila: " + cola.peek().getNombre());
        }
    }

    // UPDATE
    public void actualizarPrimeraPersona(String nuevoNombre) {
        if (cola.isEmpty()) {
            System.out.println("No hay personas para actualizar.");
        } else {
            Persona persona = cola.peek(); // Solo se permite actualizar al primero
            persona.setNombre(nuevoNombre);
            System.out.println("Datos actualizados de la primera persona.");
        }
    }

    // DELETE
    public void atenderPersona() {
        if (cola.isEmpty()) {
            System.out.println("No hay personas para atender.");
        } else {
            Persona atendida = cola.poll(); // Quita al primero
            System.out.println("Persona atendida: " + atendida.getNombre());
        }
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
