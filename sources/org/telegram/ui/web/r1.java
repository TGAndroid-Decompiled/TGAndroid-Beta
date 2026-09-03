package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r1 extends org.telegram.ui.Cells.n1 {
    public final org.telegram.ui.m0 f42646e;

    public r1(org.telegram.ui.m0 m0Var) {
        super(1);
        this.f42646e = m0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f42646e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
