package esjc.type;

/**
 * This class represents a non-base type of an {@link ArrayType} in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public abstract class NonBaseType extends Type {
  /**
   * Constucts a base type with the given name.
   * 
   * @param name
   *          The name of this base type.
   */
  protected NonBaseType(final String name) {
    super(name);
  }
}
