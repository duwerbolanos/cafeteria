import java.util.Scanner;

    // Clase principal con el menú
public class SistemaCafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafeteria cafeteria = new Cafeteria();
        int opcion;

        do {
            System.out.println("\nMenú de Cafetería:");
            System.out.println("1. Registrar Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Verificar Estado de los Pedidos Pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    Pedido pedido = new Pedido(nombreCliente);

                    boolean agregarProducto = true;
                    while (agregarProducto) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Ingrese la cantidad de " + nombreProducto + ": ");
                        int cantidadProducto = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        Producto producto = new Producto(nombreProducto, cantidadProducto);
                        pedido.agregarProducto(producto);

                        System.out.print("¿Desea agregar otro producto? (si/no): ");
                        String respuesta = scanner.nextLine();
                        agregarProducto = respuesta.equalsIgnoreCase("si");
                    }
                    cafeteria.registrarPedido(pedido);
                    break;

                case 2:
                    cafeteria.atenderPedido();
                    break;

                case 3:
                    cafeteria.mostrarPedidosPendientes();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

