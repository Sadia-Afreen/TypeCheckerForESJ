package esjc.type;


/**
 * This class represents a type in StaticJava.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public abstract class Type {
  /**
   * Holds this type's name.
   */
  public final String name;

  /**
   * Constructs a type with the given name.
   * 
   * @param name
   *          The name of this type.
   */
  protected Type(final String name) {
    assert name != null;
    this.name = name;
  }

  /**
   * Determines whether a given object is equal to this type.
   * 
   * @param o
   *          The other object for comparison.
   * @return True, if the o object is a type with the same name as this type's.
   */
  @Override
  public boolean equals(final Object o) {
    return o instanceof Type && toString().equals(o.toString());
  }

  /**
   * Returns the hash code of this type. Type with the same names have the same
   * hash code.
   * 
   * @return The hash code of this type.
   */
  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  /**
   * Returns the {@link String} representation of this type, i.e., its name.
   * 
   * @return The {@link String} representation of this type, i.e., its name.
   */
  @Override
  public String toString() {
    return this.name;
  }
}
