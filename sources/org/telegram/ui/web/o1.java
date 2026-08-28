package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o1 extends org.telegram.ui.Cells.n1 {
    public final org.telegram.ui.n0 f43952e;

    public o1(org.telegram.ui.n0 n0Var) {
        super(1);
        this.f43952e = n0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f43952e.K.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
