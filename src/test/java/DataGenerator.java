import com.food.DeliveryZone;
import com.food.Dish;
import com.food.Order;
import com.food.OrderStatus;
import com.food.user.Customer;
import com.food.user.Delivery;
import com.food.user.Support;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class DataGenerator {
    public static Dish generateDish() {
        return new Dish(
                "testDish",
                "description",
                new BigDecimal("123.21"),
                10
        );
    }

    public static Order generateOrder(Customer customer) {

        return new Order(
                customer,
                "street_1_1",
                "123",
                OrderStatus.CREATED
        );
    }

    public static Order generateOrder(Customer customer, Map<Dish, Integer> items) {
        var order = generateOrder(customer);
        order.getItems().putAll(items);
        return order;
    }

    public static DeliveryZone generateDeliveryZone() {
        return new DeliveryZone(
                "zone1",
                List.of(
                        "street_1_1",
                        "street_1_2"
                )
        );
    }

    public static Support generateSupport() {
        return new Support(
                "Support",
                "support@gmail.com",
                "111111"
        );
    }

    public static Delivery generateDelivery() {
        return new Delivery(
                "Delivery",
                "delivery@gmail.com",
                "222222",
                List.of(
                        generateDeliveryZone()
                )
        );
    }

    public static Customer generateUser() {
        return new Customer(
                "Customer",
                "customer@gmail.com",
                "333333",
                List.of(
                        "street_1_1",
                        "street_1_2"
                )
        );
    }
}
