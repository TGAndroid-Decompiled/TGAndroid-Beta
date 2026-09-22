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
        languageSelectActivity.f31114b.invalidate();
        org.telegram.ui.Components.yl0 yl0Var = languageSelectActivity.f31114b;
        int i10 = yl0Var.E1;
        if (i10 != -1 && (view = yl0Var.F1) != null) {
            yl0Var.j1(i10, view);
            yl0Var.invalidate();
        }
    }
}
