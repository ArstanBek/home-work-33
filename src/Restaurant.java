import java.util.List;
import java.util.NoSuchElementException;

public class Restaurant {
    private List<Order> orders;
    private List<MenuItem> menu;

    public Restaurant() {
    }

    public Restaurant(List<Order> orders, List<MenuItem> menu) {
        this.orders = orders;
        this.menu = menu;
    }

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }

    public void placeOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrderById(int orderId) {
        if (orderId <= 0) {
            throw new IllegalArgumentException("orderId должен быть положительным числом.");
        }

        for (Order o:this.orders) {
            if (o.getOrderId() == orderId) {
                return o;
            }
        }

        throw new NoSuchElementException("Заказ с id " + orderId + " не найден");
    }

    public void completeOrder(int orderId) {
        this.getOrderById(orderId).completeOrder();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
}
