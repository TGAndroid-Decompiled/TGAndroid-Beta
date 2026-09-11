package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u1 extends org.telegram.ui.Cells.n1 {
    public final org.telegram.ui.k0 f42254e;

    public u1(org.telegram.ui.k0 k0Var) {
        super(1);
        this.f42254e = k0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f42254e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
