import java.util.LinkedList;
  // Clase Pedido
class Pedido {
    private String cliente;
    private LinkedList<Producto> productos;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.productos = new LinkedList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder("Cliente: " + cliente + "\nProductos:\n");
        for (Producto p : productos) {
            detalle.append("  - ").append(p.toString()).append("\n");
        }
        return detalle.toString();
    }
}

