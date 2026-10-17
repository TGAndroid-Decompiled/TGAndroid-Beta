package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r1 extends org.telegram.ui.Cells.o1 {
    public final org.telegram.ui.n0 e;

    public r1(org.telegram.ui.n0 n0Var) {
        super(1);
        this.e = n0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
