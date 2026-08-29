package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qn0 {
    public final bo0 f41755a;

    public qn0(bo0 bo0Var) {
        this.f41755a = bo0Var;
    }

    public final void a(Exception exc) {
        bo0 bo0Var = this.f41755a;
        if (bo0Var.M0) {
            return;
        }
        bo0Var.H0(true, false);
        bo0Var.D0(false);
        if (!(exc instanceof dc.a) && !(exc instanceof dc.b)) {
            org.telegram.ui.Components.c5.w0(bo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.c5.w0(bo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
