package org.telegram.ui;

import android.view.View;
public final class r80 extends s4.j {
    public final LanguageSelectActivity F;

    public r80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33799b.invalidate();
        org.telegram.ui.Components.sm0 sm0Var = languageSelectActivity.f33799b;
        int i10 = sm0Var.C1;
        if (i10 != -1 && (view = sm0Var.D1) != null) {
            sm0Var.i1(i10, view);
            sm0Var.invalidate();
        }
    }
}
