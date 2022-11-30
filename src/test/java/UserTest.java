import com.food.DeliveryZone;
import com.food.Order;
import com.food.user.Customer;
import com.food.user.Delivery;
import com.food.user.Role;
import com.food.user.Support;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    Support support;
    Delivery delivery;
    Customer customer;

    @Before
    public void setup() {
        support = new Support(
                "Support",
                "support@gmail.com",
                "111111"
        );

        delivery = new Delivery(
                "Delivery",
                "delivery@gmail.com",
                "222222",
                List.of(
                        new DeliveryZone(),
                        new DeliveryZone(),
                        new DeliveryZone()
                )
        );

        customer = new Customer(
                "Customer",
                "customer@gmail.com",
                "333333",
                List.of(
                        "Address 1",
                        "Address 2"
                )
        );
    }

    @Test
    public void shouldSupportUserWork() {
        support.createOrder(new Order());
        support.getOrders();
        support.cancelOrder(new Order());
        support.contactDelivery(delivery);
        support.checkDeliveryZone(delivery, new DeliveryZone());
        support.contactCustomer(customer);

        assertFalse(Objects.isNull(support.getId()));
        assertFalse(Objects.isNull(support.getName()));
        assertFalse(Objects.isNull(support.getEmail()));
        assertFalse(Objects.isNull(support.getPhone()));
        assertEquals(support.getRole(), Role.SUPPORT);
    }

    @Test
    public void shouldDeliveryUserWork() {
        delivery.createOrder(new Order());
        delivery.getOrders();
        delivery.cancelOrder(new Order());
        delivery.contactCustomer(customer);

        assertFalse(Objects.isNull(delivery.getId()));
        assertFalse(Objects.isNull(delivery.getName()));
        assertFalse(Objects.isNull(delivery.getEmail()));
        assertFalse(Objects.isNull(delivery.getPhone()));
        assertFalse(Objects.isNull(delivery.getDeliveryZones()));
        assertEquals(delivery.getRole(), Role.DELIVERY);
    }

    @Test
    public void shouldCustomerUserWork() {
        customer.createOrder(new Order());
        customer.getOrders();
        customer.cancelOrder(new Order());
        customer.contactDelivery(delivery);
        customer.contactSupport();

        assertFalse(Objects.isNull(customer.getId()));
        assertFalse(Objects.isNull(customer.getName()));
        assertFalse(Objects.isNull(customer.getEmail()));
        assertFalse(Objects.isNull(customer.getPhone()));
        assertEquals(customer.getRole(), Role.USER);
    }
}
