package esjc.type.checker;

import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import esjc.type.Type;
import esjc.util.Pair;

/**
 * This class is used to hold the result of the {@link ExtendedTypeChecker}
 * (when the type checking is successful).
 * 
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedTypeTable extends TypeTable {
  /**
   * Constructs an extended type table with the given {@link ASTNode} to its
   * {@link Type} map.
   * 
   * @param typeMap
   *          The mapping of {@link ASTNode} to its {@link Type} map of this
   *          type table.
   * @param methodTypeMap
   *          The mapping of {@link MethodDeclaration} or {@link Method} to its
   *          return {@link Type} and its parameter {@link Type}s.
   */
  protected ExtendedTypeTable(
      final Map<ASTNode, Type> typeMap,
      final Map<Object, Pair<Type, List<Type>>> methodTypeMap) {
    super(typeMap, methodTypeMap);
  }
}
