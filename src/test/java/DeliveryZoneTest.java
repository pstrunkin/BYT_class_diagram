import com.food.DeliveryZone;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DeliveryZoneTest {

    DeliveryZone deliveryZone;

    @Before
    public void setup() {
        deliveryZone = DataGenerator.generateDeliveryZone();
    }

    @Test
    public void shouldDeliveryZone() {
        assertTrue(deliveryZone.checkStreet("street_1_1"));
        assertFalse(deliveryZone.checkStreet("unknown"));

        assertFalse(Objects.isNull(deliveryZone.getId()));
        assertEquals(deliveryZone.getName(), "zone1");
        assertEquals(deliveryZone.getStreets().size(), 2);
    }
}
