import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LayoutFactoryTest {

    @Test
    void shouldThrowsWithNonexistentLayout() {
        try {
            Layout layout = LayoutFactory.getLayout("LayoutUser");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidLayout() {
        try {
            Layout layout = LayoutFactory.getLayout("LayoutCommerce");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}