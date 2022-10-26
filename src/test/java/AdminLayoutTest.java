import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminLayoutTest {

    @Test
    void shouldRenderCorrectly() {
        Layout layout = LayoutFactory.getLayout("AdminLayout");
        assertEquals("layout admin", layout.render());
    }

    @Test
    void shouldUpdateRenderCorrectly() {
        Layout layout = LayoutFactory.getLayout("AdminLayout");
        assertEquals("layout admin *updated*", layout.updateRender("*updated*"));
    }
}