import java.util.List;

public class Main {
    public static void main(String[] args) {
        // menu items
        MenuItem lagman = new MenuItem("Lagman", 220.0);
        MenuItem manty = new MenuItem("Manty", 250.0);
        MenuItem plov = new MenuItem("Plov", 200.0);

        // orders
        Order order1 = new Order(1, "Alex", List.of(new MenuItem[]{lagman, manty}), false);
        Order order2 = new Order(2, "Sarah", List.of(new MenuItem[]{plov, manty}), false);

        // restaurant
        Restaurant jibekJolu = new Restaurant(
                List.of(new Order[]{order1, order2}),
                List.of(new MenuItem[]{lagman, manty, plov})
        );

        System.out.println(jibekJolu.getOrderById(1).calculateTotal());
        try {
            System.out.println(jibekJolu.getOrderById(10).calculateTotal());
        } catch (Exception err) {
            System.out.println(err.toString());
        }

        try {
            System.out.println(jibekJolu.getOrderById(-1).calculateTotal());
        } catch (Exception err) {
            System.out.println(err.toString());
        }

        jibekJolu.completeOrder(1);
        try {
            jibekJolu.completeOrder(-1);
        } catch (Exception err) {
            System.out.println(err.toString());
        }

        try {
            jibekJolu.completeOrder(10);
        } catch (Exception err) {
            System.out.println(err.toString());
        }
    }
}