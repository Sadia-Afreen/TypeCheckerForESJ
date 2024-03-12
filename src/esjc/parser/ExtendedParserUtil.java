package esjc.parser;

import esjc.parser.ExtendedStaticJavaParser.CompilationUnitContext;
import org.antlr.v4.runtime.*;

import java.io.FileReader;

public class ExtendedParserUtil {

  public static CompilationUnitContext parse(final String path)
      throws Exception {
    final CodePointCharStream input = CharStreams.fromReader(new FileReader(path));
    final ExtendedStaticJavaLexer lexer = new ExtendedStaticJavaLexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final ExtendedStaticJavaParser parser = new ExtendedStaticJavaParser(tokens);
    parser.removeErrorListeners();
    parser.addErrorListener(new BaseErrorListener() {
      @Override
      public void syntaxError(final Recognizer<?, ?> recognizer,
          final Object offendingSymbol, final int line,
          final int charPositionInLine, final String msg,
          final RecognitionException e) {
        throw new RuntimeException("Parse Error in " + path + ": [" + line
            + ", " + charPositionInLine + "] " + msg);
      }
    });
    return parser.compilationUnit();
  }
}
