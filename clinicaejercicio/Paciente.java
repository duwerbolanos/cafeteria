import java.util.LinkedList;
import java.util.Scanner;

class Paciente {
    String nombre;
    String motivoConsulta;

    public Paciente(String nombre, String motivoConsulta) {
        this.nombre = nombre;
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Motivo: " + motivoConsulta;
    }
}
