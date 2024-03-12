package esjc.util;

public class Util {

    /**
     * Returns the first line of an object's {@link String} representation
     *
     * @param o The object.
     * @return The first line of the given object's {@link String} representation
     */
    public static
    String getFirstLine( final Object o) {
        assert o != null;
        final String nText = o.toString();
        final int index = nText.indexOf('\n');
        return index >= 0 ? nText.substring(0, index) : nText;
    }
}
