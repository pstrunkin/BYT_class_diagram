import com.food.DeliveryZone;
import com.food.Dish;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DishTest {

    Dish dish;

    @Before
    public void setup() {
        dish = DataGenerator.generateDish();
    }

    @Test
    public void shouldDeliveryZone() {
        dish.setAvailableQuantity(44);

        assertTrue(dish.checkAvailability(44));
        assertFalse(dish.checkAvailability(45));

        assertFalse(Objects.isNull(dish.getId()));
        assertEquals(dish.getName(), "testDish");
        assertEquals(dish.getDescription(), "description");
        assertEquals(dish.getPrice(), new BigDecimal("123.21"));
        assertEquals(dish.getAvailableQuantity(), Integer.valueOf(44));
    }
}
