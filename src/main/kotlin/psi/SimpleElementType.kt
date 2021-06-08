package psi

import SimpleLanguage
import com.intellij.psi.tree.IElementType

class SimpleElementType(debugName: String) : IElementType(debugName, SimpleLanguage)