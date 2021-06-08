import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class SimpleFile(viewProvider: FileViewProvider?) : PsiFileBase(viewProvider!!, SimpleLanguage) {
    override fun getFileType(): FileType {
        return SimpleFileType
    }

    override fun toString(): String {
        return "Simple File"
    }
}