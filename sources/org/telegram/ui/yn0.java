package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yn0 {
    public final jo0 f40546a;

    public yn0(jo0 jo0Var) {
        this.f40546a = jo0Var;
    }

    public final void a(Exception exc) {
        jo0 jo0Var = this.f40546a;
        if (jo0Var.N0) {
            return;
        }
        jo0Var.H0(true, false);
        jo0Var.D0(false);
        if (!(exc instanceof fc.a) && !(exc instanceof fc.b)) {
            org.telegram.ui.Components.z4.w0(jo0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.z4.w0(jo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
