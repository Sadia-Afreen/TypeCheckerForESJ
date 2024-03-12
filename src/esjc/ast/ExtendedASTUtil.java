package esjc.ast;

import org.eclipse.jdt.core.dom.CompilationUnit;

import esjc.parser.ExtendedParserUtil;

public class ExtendedASTUtil {
  public static CompilationUnit ast(final String filename) throws Exception {
    return ExtendedStaticJavaASTBuilder.ast(ExtendedParserUtil.parse(filename));
  }
}
