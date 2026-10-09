package org.telegram.ui;

import android.view.View;
public final class s80 extends s4.j {
    public final LanguageSelectActivity F;

    public s80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33771b.invalidate();
        org.telegram.ui.Components.qm0 qm0Var = languageSelectActivity.f33771b;
        int i10 = qm0Var.C1;
        if (i10 != -1 && (view = qm0Var.D1) != null) {
            qm0Var.i1(i10, view);
            qm0Var.invalidate();
        }
    }
}
