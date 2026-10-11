package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s1 extends org.telegram.ui.Cells.o1 {
    public final org.telegram.ui.k0 f43646e;

    public s1(org.telegram.ui.k0 k0Var) {
        super(1);
        this.f43646e = k0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f43646e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
