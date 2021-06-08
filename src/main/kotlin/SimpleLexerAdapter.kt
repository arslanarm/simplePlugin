import com.intellij.lexer.FlexAdapter

class SimpleLexerAdapter : FlexAdapter(SimpleLexer(null))