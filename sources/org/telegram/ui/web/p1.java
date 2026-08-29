package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p1 extends org.telegram.ui.Cells.m1 {
    public final org.telegram.ui.o0 f44142e;

    public p1(org.telegram.ui.o0 o0Var) {
        super(1);
        this.f44142e = o0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f44142e.K.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
