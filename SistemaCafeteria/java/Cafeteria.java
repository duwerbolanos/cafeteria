import java.util.LinkedList;
import java.util.Queue;


class Cafeteria {
    private Queue<Pedido> colaPedidos;

    public Cafeteria() {
        colaPedidos = new LinkedList<>();
    }

    // Método para registrar un nuevo pedido
    public void registrarPedido(Pedido pedido) {
        colaPedidos.add(pedido);
        System.out.println("Pedido registrado para el cliente: " + pedido.getCliente());
    }

    // Método para atender el próximo pedido
    public void atenderPedido() {
        if (colaPedidos.isEmpty()) {
            System.out.println("No hay pedidos pendientes.");
        } else {
            Pedido pedido = colaPedidos.poll();
            System.out.println("Atendiendo el pedido de " + pedido.getCliente());
            System.out.println(pedido.toString());
        }
    }

    // Método para mostrar los pedidos pendientes
    public void mostrarPedidosPendientes() {
        if (colaPedidos.isEmpty()) {
            System.out.println("No hay pedidos pendientes.");
        } else {
            System.out.println("Pedidos Pendientes:");
            for (Pedido pedido : colaPedidos) {
                System.out.println(pedido.toString());
            }
        }
    }
}


