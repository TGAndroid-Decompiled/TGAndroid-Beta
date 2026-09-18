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
        languageSelectActivity.f31053b.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = languageSelectActivity.f31053b;
        int i10 = wl0Var.E1;
        if (i10 != -1 && (view = wl0Var.F1) != null) {
            wl0Var.j1(i10, view);
            wl0Var.invalidate();
        }
    }
}
