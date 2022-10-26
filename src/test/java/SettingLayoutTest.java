import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingLayoutTest {

    @Test
    void shouldRenderCorrectly() {
        Layout layout = LayoutFactory.getLayout("SettingLayout");
        assertEquals("layout setting", layout.render());
    }

    @Test
    void shouldUpdateRenderCorrectly() {
        Layout layout = LayoutFactory.getLayout("SettingLayout");
        assertEquals("layout setting *updated*", layout.updateRender("*updated*"));
    }
}