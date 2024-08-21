import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<MenuItem> items;
    private boolean isCompleted;

    public Order() {
    }

    public Order(int orderId, String customerName, List<MenuItem> items, boolean isCompleted) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.isCompleted = isCompleted;
    }

    public double calculateTotal() {
        double sum = 0.0;
        for (MenuItem item:this.items) {
            sum=+item.getPrice();
        }
        return sum;
    }

    public void completeOrder() {
        this.setCompleted(true);
        System.out.println("Заказ " + this.orderId + " завершен");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
