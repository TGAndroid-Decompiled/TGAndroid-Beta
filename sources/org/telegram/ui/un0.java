package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class un0 {
    public final fo0 f42019a;

    public un0(fo0 fo0Var) {
        this.f42019a = fo0Var;
    }

    public final void a(Exception exc) {
        fo0 fo0Var = this.f42019a;
        if (fo0Var.Q0) {
            return;
        }
        fo0Var.H0(true, false);
        fo0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(fo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.f5.v0(fo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
