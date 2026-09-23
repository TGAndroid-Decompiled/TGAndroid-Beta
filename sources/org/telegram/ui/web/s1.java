package org.telegram.ui.web;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s1 extends org.telegram.ui.Cells.n1 {
    public final org.telegram.ui.l0 e;

    public s1(org.telegram.ui.l0 l0Var) {
        super(1);
        this.e = l0Var;
    }

    public final void f() {
        invalidateSelf();
        this.e.O.setContentDescription(LocaleController.getString(R.string.Forward));
    }
}
