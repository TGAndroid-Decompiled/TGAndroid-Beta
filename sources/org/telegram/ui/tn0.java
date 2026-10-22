package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tn0 {
    public final eo0 f41714a;

    public tn0(eo0 eo0Var) {
        this.f41714a = eo0Var;
    }

    public final void a(Exception exc) {
        eo0 eo0Var = this.f41714a;
        if (eo0Var.Q0) {
            return;
        }
        eo0Var.H0(true, false);
        eo0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(eo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.f5.v0(eo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
