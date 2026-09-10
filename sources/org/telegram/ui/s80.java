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
        languageSelectActivity.f29922b.invalidate();
        org.telegram.ui.Components.vl0 vl0Var = languageSelectActivity.f29922b;
        int i10 = vl0Var.E1;
        if (i10 != -1 && (view = vl0Var.F1) != null) {
            vl0Var.h1(i10, view);
            vl0Var.invalidate();
        }
    }
}
