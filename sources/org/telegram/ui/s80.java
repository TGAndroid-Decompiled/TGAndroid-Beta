package org.telegram.ui;

import android.view.View;
public final class s80 extends s4.j {
    public final LanguageSelectActivity F;

    public s80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f30806b.invalidate();
        org.telegram.ui.Components.ll0 ll0Var = languageSelectActivity.f30806b;
        int i10 = ll0Var.E1;
        if (i10 != -1 && (view = ll0Var.F1) != null) {
            ll0Var.i1(i10, view);
            ll0Var.invalidate();
        }
    }
}
