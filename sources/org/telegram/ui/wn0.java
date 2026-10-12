package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wn0 implements Runnable {
    public final int f43574a;
    public final xo0 f43575b;
    public final TLRPC.TL_error f43576c;
    public final TLObject d;

    public wn0(xo0 xo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43574a = i10;
        this.f43575b = xo0Var;
        this.f43576c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43574a) {
            case 0:
                xo0 xo0Var = this.f43575b;
                xo0Var.f44102e0 = false;
                if (this.f43576c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    xo0Var.f44091a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(xo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = xo0Var.C0;
                    if (paymentForm != null && xo0Var.f44091a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        xo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(xo0Var.f44091a0);
                    xo0 xo0Var2 = xo0Var.f44105f0;
                    if (xo0Var2 != null) {
                        xo0Var2.C0(xo0Var.f44091a0);
                    }
                    if (!xo0Var.f44091a0.has_password && xo0Var.f44099d0 == null) {
                        un0 un0Var = new un0(xo0Var, 3);
                        xo0Var.f44099d0 = un0Var;
                        AndroidUtilities.runOnUIThread(un0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                xo0.V(this.f43575b, this.f43576c, this.d);
                return;
            default:
                xo0.X(this.f43575b, this.f43576c, this.d);
                return;
        }
    }
}
