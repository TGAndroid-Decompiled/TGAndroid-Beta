package org.telegram.ui;

import android.view.View;
public final class x70 extends f2.n {
    public final LanguageSelectActivity F;

    public x70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f35487b.invalidate();
        org.telegram.ui.Components.wk0 wk0Var = languageSelectActivity.f35487b;
        int i9 = wk0Var.A1;
        if (i9 != -1 && (view = wk0Var.B1) != null) {
            wk0Var.i1(i9, view);
            wk0Var.invalidate();
        }
    }
}
