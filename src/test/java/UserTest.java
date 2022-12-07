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
        support.contact();

        assertFalse(Objects.isNull(support.getId()));
        assertEquals(support.getName(), "Support");
        assertEquals(support.getEmail(), "support@gmail.com");
        assertEquals(support.getPhone(), "111111");
        assertEquals(support.getRole(), Role.SUPPORT);
    }

    @Test
    public void shouldDeliveryUserWork() {
        delivery.contact();

        assertFalse(Objects.isNull(delivery.getId()));
        assertEquals(delivery.getName(), "Delivery");
        assertEquals(delivery.getEmail(), "delivery@gmail.com");
        assertEquals(delivery.getPhone(), "222222");
        assertFalse(Objects.isNull(delivery.getDeliveryZones()));
        assertEquals(delivery.getRole(), Role.DELIVERY);
    }

    @Test
    public void shouldCustomerUserWork() {
        customer.contact();

        assertFalse(Objects.isNull(customer.getId()));
        assertEquals(customer.getName(), "Customer");
        assertEquals(customer.getEmail(), "customer@gmail.com");
        assertEquals(customer.getPhone(), "333333");
        assertEquals(customer.getAddresses(), List.of(
                "street_1_1",
                "street_1_2"
        ));
        assertEquals(customer.getRole(), Role.USER);
    }
}
