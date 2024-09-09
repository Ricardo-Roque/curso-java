package entities;

public class OrderItem {
    private int quantity;
    private Product product;

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }

    public double subTotal() {
        return quantity * product.getPrice();
    }
}
