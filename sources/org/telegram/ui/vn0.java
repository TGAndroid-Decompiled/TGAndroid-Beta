package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vn0 {
    public final go0 f42234a;

    public vn0(go0 go0Var) {
        this.f42234a = go0Var;
    }

    public final void a(Exception exc) {
        go0 go0Var = this.f42234a;
        if (go0Var.Q0) {
            return;
        }
        go0Var.H0(true, false);
        go0Var.D0(false);
        if (!(exc instanceof vc.a) && !(exc instanceof vc.b)) {
            org.telegram.ui.Components.f5.v0(go0Var, exc.getMessage());
        } else {
            org.telegram.ui.Components.f5.v0(go0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        }
    }
}
