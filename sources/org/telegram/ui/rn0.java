package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rn0 implements Runnable {
    public final int f40171a;
    public final so0 f40172b;
    public final TLRPC.TL_error f40173c;
    public final TLObject d;

    public rn0(so0 so0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f40171a = i10;
        this.f40172b = so0Var;
        this.f40173c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40171a) {
            case 0:
                so0 so0Var = this.f40172b;
                so0Var.f40558e0 = false;
                if (this.f40173c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    so0Var.f40547a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(so0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = so0Var.C0;
                    if (paymentForm != null && so0Var.f40547a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        so0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(so0Var.f40547a0);
                    so0 so0Var2 = so0Var.f40561f0;
                    if (so0Var2 != null) {
                        so0Var2.C0(so0Var.f40547a0);
                    }
                    if (!so0Var.f40547a0.has_password && so0Var.f40555d0 == null) {
                        pn0 pn0Var = new pn0(so0Var, 3);
                        so0Var.f40555d0 = pn0Var;
                        AndroidUtilities.runOnUIThread(pn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                so0.T(this.f40172b, this.f40173c, this.d);
                return;
            default:
                so0.W(this.f40172b, this.f40173c, this.d);
                return;
        }
    }
}
