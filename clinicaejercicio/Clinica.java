import java.util.LinkedList;

public class Clinica {
    private LinkedList<Paciente> filaDeEspera = new LinkedList<>();

    // Método para agregar un nuevo paciente a la fila
    public void agregarPaciente(String nombre, String motivoConsulta) {
        Paciente nuevoPaciente = new Paciente(nombre, motivoConsulta);
        filaDeEspera.addLast(nuevoPaciente);
        System.out.println("Paciente agregado a la fila.");
    }

    // Método para atender al siguiente paciente en la fila
    public void atenderPaciente() {
        if (filaDeEspera.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            Paciente atendido = filaDeEspera.removeFirst();
            System.out.println("Atendiendo a " + atendido);
        }
    }

    // Método para mostrar todos los pacientes en espera
    public void mostrarPacientesEnEspera() {
        if (filaDeEspera.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            System.out.println("Pacientes en espera:");
            for (Paciente paciente : filaDeEspera) {
                System.out.println(paciente);
            }
        }
    }
}