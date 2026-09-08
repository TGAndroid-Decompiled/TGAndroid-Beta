package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wn0 implements Runnable {
    public final int f42468a;
    public final xo0 f42469b;
    public final TLRPC.TL_error f42470c;
    public final TLObject d;

    public wn0(xo0 xo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42468a = i10;
        this.f42469b = xo0Var;
        this.f42470c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42468a) {
            case 0:
                xo0 xo0Var = this.f42469b;
                xo0Var.f42844e0 = false;
                if (this.f42470c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    xo0Var.f42833a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(xo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = xo0Var.C0;
                    if (paymentForm != null && xo0Var.f42833a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        xo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(xo0Var.f42833a0);
                    xo0 xo0Var2 = xo0Var.f42847f0;
                    if (xo0Var2 != null) {
                        xo0Var2.C0(xo0Var.f42833a0);
                    }
                    if (!xo0Var.f42833a0.has_password && xo0Var.f42841d0 == null) {
                        un0 un0Var = new un0(xo0Var, 3);
                        xo0Var.f42841d0 = un0Var;
                        AndroidUtilities.runOnUIThread(un0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xo0.V(this.f42469b, this.f42470c, this.d);
                return;
            default:
                xo0.X(this.f42469b, this.f42470c, this.d);
                return;
        }
    }
}
