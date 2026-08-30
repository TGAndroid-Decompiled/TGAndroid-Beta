package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q1 extends org.telegram.ui.Cells.n1 {
    public final org.telegram.ui.m0 e;

    public q1(org.telegram.ui.m0 m0Var) {
        super(1);
        this.e = m0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.L.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
