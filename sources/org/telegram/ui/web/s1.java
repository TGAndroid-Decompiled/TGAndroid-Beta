package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s1 extends org.telegram.ui.Cells.o1 {
    public final org.telegram.ui.l0 f43457e;

    public s1(org.telegram.ui.l0 l0Var) {
        super(1);
        this.f43457e = l0Var;
    }

    public final void f() {
        invalidateSelf();
        this.f43457e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
