package psi

import SimpleLanguage
import com.intellij.psi.tree.IElementType

class SimpleTokenType(debugName: String) : IElementType(debugName, SimpleLanguage) {
    override fun toString(): String {
        return "psi.SimpleTokenType." + super.toString()
    }
}