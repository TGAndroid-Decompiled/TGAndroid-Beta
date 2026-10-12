package org.telegram.ui;

import android.view.View;
public final class w80 extends s4.k {
    public final LanguageSelectActivity F;

    public w80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f32098b.invalidate();
        org.telegram.ui.Components.mm0 mm0Var = languageSelectActivity.f32098b;
        int i10 = mm0Var.C1;
        if (i10 != -1 && (view = mm0Var.D1) != null) {
            mm0Var.i1(i10, view);
            mm0Var.invalidate();
        }
    }
}
