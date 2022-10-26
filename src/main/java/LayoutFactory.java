public class LayoutFactory {
    public static Layout getLayout(String layoutName) {
        Class genericClass = null;
        Object genericObject = null;
        try {
            genericClass = Class.forName(layoutName);
            genericObject = genericClass.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Layout inexistente");
        }
        if (!(genericObject instanceof Layout)) {
            throw new IllegalArgumentException("Layout inválido");
        }
        return (Layout) genericObject;
    }
}
