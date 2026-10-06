package Tri;

public class VarovnyFiltr implements IFiltrZprav {

    @Override
    public boolean prijima(String text) {

        if (text == null) {
            return false;
        }

        String upraveny = text.strip();
        if (upraveny.isEmpty()) {
            return false;
        }
        return upraveny.toLowerCase().startsWith("pozor:") || upraveny.endsWith("!");
    }
}