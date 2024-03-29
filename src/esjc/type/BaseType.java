package esjc.type;

/**
 * This class represents a base type of an {@link ArrayType} in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public abstract class BaseType extends Type {
  /**
   * Constucts a base type with the given name.
   * 
   * @param name
   *          The name of this base type.
   */
  protected BaseType(final String name) {
    super(name);
  }
}
