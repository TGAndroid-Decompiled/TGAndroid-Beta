package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ro0 {
    public final cp0 f39839a;

    public ro0(cp0 cp0Var) {
        this.f39839a = cp0Var;
    }

    public final void a(Exception exc) {
        cp0 cp0Var = this.f39839a;
        if (cp0Var.Q0) {
            return;
        }
        cp0Var.H0(true, false);
        cp0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.g5.v0(cp0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.g5.v0(cp0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
