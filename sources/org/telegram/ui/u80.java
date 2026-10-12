package org.telegram.ui;

import android.view.View;
public final class u80 extends s4.j {
    public final LanguageSelectActivity F;

    public u80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33608b.invalidate();
        org.telegram.ui.Components.wm0 wm0Var = languageSelectActivity.f33608b;
        int i10 = wm0Var.C1;
        if (i10 != -1 && (view = wm0Var.D1) != null) {
            wm0Var.i1(i10, view);
            wm0Var.invalidate();
        }
    }
}
