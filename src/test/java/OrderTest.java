import com.food.Dish;
import com.food.Order;
import com.food.OrderStatus;
import com.food.user.Customer;
import com.food.user.Delivery;
import com.food.user.Support;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OrderTest {
    Dish dish;
    Order order;
    Delivery delivery;
    Customer customer;

    @Before
    public void setup() {
        dish = DataGenerator.generateDish();
        customer = DataGenerator.generateUser();
        order = DataGenerator.generateOrder(customer);
        delivery = DataGenerator.generateDelivery();
    }

    @Test
    public void shouldOrder() {
        order.setRating(4);
        order.setStatus(OrderStatus.DELIVERED);
        order.getItems().put(dish, 11);
        order.checkValidItems();
        order.setDelivery(delivery);

        assertFalse(Objects.isNull(order.getId()));
        assertEquals(order.getStreet(), "street_1_1");
        assertEquals(order.getHouseNumber(), "123");
        assertEquals(order.getStatus(), OrderStatus.DELIVERED);
        assertEquals(order.getRating(), Integer.valueOf(4));
        assertEquals(order.getDelivery(), delivery);
        assertEquals(order.getCustomer(), customer);
        assertEquals(order.getItems().size(), 1);
        assertFalse(Objects.isNull(order.getCreatedAt()));
        assertFalse(Objects.isNull(order.getUpdatedAt()));
    }
}
