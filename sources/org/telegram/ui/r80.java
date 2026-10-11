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
        languageSelectActivity.f33833b.invalidate();
        org.telegram.ui.Components.rm0 rm0Var = languageSelectActivity.f33833b;
        int i10 = rm0Var.C1;
        if (i10 != -1 && (view = rm0Var.D1) != null) {
            rm0Var.i1(i10, view);
            rm0Var.invalidate();
        }
    }
}
