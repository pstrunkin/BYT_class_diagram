import com.food.Order;
import com.food.user.Customer;
import com.food.user.Delivery;
import com.food.user.Role;
import com.food.user.Support;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UserTest {

    Order order;
    Support support;
    Delivery delivery;
    Customer customer;

    @Before
    public void setup() {
        customer = DataGenerator.generateUser();
        order = DataGenerator.generateOrder(customer);
        support = DataGenerator.generateSupport();
        delivery = DataGenerator.generateDelivery();
    }

    @Test
    public void shouldSupportUserWork() {
        support.createOrder(order);
        support.getOrders();
        support.cancelOrder(order);
        support.contactDelivery(delivery);
        support.checkDeliveryZone(delivery, DataGenerator.generateDeliveryZone());
        support.contactCustomer(customer);

        assertFalse(Objects.isNull(support.getId()));
        assertEquals(support.getName(), "Support");
        assertEquals(support.getEmail(), "support@gmail.com");
        assertEquals(support.getPhone(), "111111");
        assertEquals(support.getRole(), Role.SUPPORT);
    }

    @Test
    public void shouldDeliveryUserWork() {
        delivery.createOrder(order);
        delivery.getOrders();
        delivery.cancelOrder(order);
        delivery.contactCustomer(customer);

        assertFalse(Objects.isNull(delivery.getId()));
        assertEquals(delivery.getName(), "Delivery");
        assertEquals(delivery.getEmail(), "delivery@gmail.com");
        assertEquals(delivery.getPhone(), "222222");
        assertFalse(Objects.isNull(delivery.getDeliveryZones()));
        assertEquals(delivery.getRole(), Role.DELIVERY);
    }

    @Test
    public void shouldCustomerUserWork() {
        customer.createOrder(order);
        customer.getOrders();
        customer.cancelOrder(order);
        customer.contactDelivery(delivery);
        customer.contactSupport();

        assertFalse(Objects.isNull(customer.getId()));
        assertEquals(customer.getName(), "Customer");
        assertEquals(customer.getEmail(), "customer@gmail.com");
        assertEquals(customer.getPhone(), "333333");
        assertEquals(customer.getRole(), Role.USER);
    }
}
