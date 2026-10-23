package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xn0 {
    public final io0 f43625a;

    public xn0(io0 io0Var) {
        this.f43625a = io0Var;
    }

    public final void a(Exception exc) {
        io0 io0Var = this.f43625a;
        if (io0Var.Q0) {
            return;
        }
        io0Var.H0(true, false);
        io0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.w0(io0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.f5.w0(io0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
