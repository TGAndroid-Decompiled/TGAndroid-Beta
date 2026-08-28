package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rn0 {
    public final co0 f42467a;

    public rn0(co0 co0Var) {
        this.f42467a = co0Var;
    }

    public final void a(Exception exc) {
        co0 co0Var = this.f42467a;
        if (co0Var.M0) {
            return;
        }
        co0Var.G0(true, false);
        co0Var.C0(false);
        if (!(exc instanceof bc.a) && !(exc instanceof bc.b)) {
            org.telegram.ui.Components.y4.w0(co0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.y4.w0(co0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
