import org.junit.Test;
import static org.junit.Assert.*;

public class OfficeManagerTest {

    @Test
    public void testUnderCapacity() {
        // Hardcoded data for Jenkins automation
        OfficeManager office = new OfficeManager("Pune_Branch", 30);
        assertFalse("Should not be over capacity", office.isOverCapacity());
        assertEquals("Office Pune_Branch has space available.", office.getOfficeStatus());
    }

    @Test
    public void testOverCapacity() {
        // Hardcoded data for Jenkins automation
        OfficeManager office = new OfficeManager("Mumbai_Branch", 60);
        assertTrue("Should be over capacity", office.isOverCapacity());
        assertEquals("Office Mumbai_Branch is full.", office.getOfficeStatus());
    }
}