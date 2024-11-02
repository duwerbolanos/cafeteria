import java.util.Scanner;
public class SistemaClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clinica clinica = new Clinica();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- Menú de Clínica ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Mostrar pacientes en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el motivo de consulta: ");
                    String motivoConsulta = scanner.nextLine();
                    clinica.agregarPaciente(nombre, motivoConsulta);
                    break;

                case 2:
                    clinica.atenderPaciente();
                    break;

                case 3:
                    clinica.mostrarPacientesEnEspera();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

    






