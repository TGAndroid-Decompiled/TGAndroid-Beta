package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class sn0 {

    public final do0 f42671a;

    public sn0(do0 do0Var) {
        this.f42671a = do0Var;
    }

    public final void a(Exception exc) {
        do0 do0Var = this.f42671a;
        if (do0Var.M0) {
            return;
        }
        do0Var.H0(true, false);
        do0Var.D0(false);
        if ((exc instanceof cc.a) || (exc instanceof cc.b)) {
            org.telegram.ui.Components.y4.w0(do0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            org.telegram.ui.Components.y4.w0(do0Var, exc.getMessage());
        }
    }
}
