import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LayoutFactoryTest {

    @Test
    void shouldThrowsWithNonexistentLayout() {
        try {
            Layout layout = LayoutFactory.getLayout("LayoutUser");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Layout inexistente", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidLayout() {
        try {
            Layout layout = LayoutFactory.getLayout("CommerceLayout");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Layout inválido", e.getMessage());
        }
    }
}