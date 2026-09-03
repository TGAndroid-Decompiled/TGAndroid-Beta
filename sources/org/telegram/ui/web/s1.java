package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s1 extends org.telegram.ui.Cells.m1 {
    public final org.telegram.ui.o0 e;

    public s1(org.telegram.ui.o0 o0Var) {
        super(1);
        this.e = o0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
