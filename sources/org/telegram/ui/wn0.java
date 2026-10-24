package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wn0 {
    public final ho0 f43378a;

    public wn0(ho0 ho0Var) {
        this.f43378a = ho0Var;
    }

    public final void a(Exception exc) {
        ho0 ho0Var = this.f43378a;
        if (ho0Var.Q0) {
            return;
        }
        ho0Var.H0(true, false);
        ho0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.d5.v0(ho0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.d5.v0(ho0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
