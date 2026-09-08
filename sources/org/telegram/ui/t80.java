package org.telegram.ui;

import android.view.View;
public final class t80 extends s4.j {
    public final LanguageSelectActivity F;

    public t80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33444b.invalidate();
        org.telegram.ui.Components.ll0 ll0Var = languageSelectActivity.f33444b;
        int i10 = ll0Var.E1;
        if (i10 != -1 && (view = ll0Var.F1) != null) {
            ll0Var.h1(i10, view);
            ll0Var.invalidate();
        }
    }
}
