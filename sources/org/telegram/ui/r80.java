package org.telegram.ui;

import android.view.View;
public final class r80 extends s4.j {
    public final LanguageSelectActivity F;

    public r80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33761b.invalidate();
        org.telegram.ui.Components.zl0 zl0Var = languageSelectActivity.f33761b;
        int i10 = zl0Var.E1;
        if (i10 != -1 && (view = zl0Var.F1) != null) {
            zl0Var.l1(i10, view);
            zl0Var.invalidate();
        }
    }
}
