// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageTemplateArgumentListImpl extends ASTWrapperPsiElement implements DLanguageTemplateArgumentList {

  public DLanguageTemplateArgumentListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitTemplateArgumentList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageTemplateArgument getTemplateArgument() {
    return findNotNullChildByClass(DLanguageTemplateArgument.class);
  }

  @Override
  @Nullable
  public DLanguageTemplateArgumentList getTemplateArgumentList() {
    return findChildByClass(DLanguageTemplateArgumentList.class);
  }

  @Override
  @Nullable
  public PsiElement getOpComma() {
    return findChildByType(OP_COMMA);
  }

}
