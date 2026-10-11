package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tn0 implements Runnable {
    public final int f42247a;
    public final uo0 f42248b;
    public final TLRPC.TL_error f42249c;
    public final TLObject d;

    public tn0(uo0 uo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42247a = i10;
        this.f42248b = uo0Var;
        this.f42249c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42247a) {
            case 0:
                uo0 uo0Var = this.f42248b;
                uo0Var.f42738e0 = false;
                if (this.f42249c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    uo0Var.f42727a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(uo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = uo0Var.C0;
                    if (paymentForm != null && uo0Var.f42727a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        uo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(uo0Var.f42727a0);
                    uo0 uo0Var2 = uo0Var.f42741f0;
                    if (uo0Var2 != null) {
                        uo0Var2.C0(uo0Var.f42727a0);
                    }
                    if (!uo0Var.f42727a0.has_password && uo0Var.f42735d0 == null) {
                        rn0 rn0Var = new rn0(uo0Var, 3);
                        uo0Var.f42735d0 = rn0Var;
                        AndroidUtilities.runOnUIThread(rn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                uo0.V(this.f42248b, this.f42249c, this.d);
                return;
            default:
                uo0.X(this.f42248b, this.f42249c, this.d);
                return;
        }
    }
}
