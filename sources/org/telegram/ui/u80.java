package org.telegram.ui;

import android.view.View;
public final class u80 extends s4.j {
    public final LanguageSelectActivity F;

    public u80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f30826b.invalidate();
        org.telegram.ui.Components.ml0 ml0Var = languageSelectActivity.f30826b;
        int i10 = ml0Var.E1;
        if (i10 != -1 && (view = ml0Var.F1) != null) {
            ml0Var.j1(i10, view);
            ml0Var.invalidate();
        }
    }
}
