package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xn0 implements Runnable {
    public final int f39676a;
    public final yo0 f39677b;
    public final TLRPC.TL_error f39678c;
    public final TLObject d;

    public xn0(yo0 yo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39676a = i10;
        this.f39677b = yo0Var;
        this.f39678c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39676a) {
            case 0:
                yo0 yo0Var = this.f39677b;
                yo0Var.f39960e0 = false;
                if (this.f39678c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    yo0Var.f39950a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(yo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = yo0Var.C0;
                    if (paymentForm != null && yo0Var.f39950a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        yo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(yo0Var.f39950a0);
                    yo0 yo0Var2 = yo0Var.f39963f0;
                    if (yo0Var2 != null) {
                        yo0Var2.C0(yo0Var.f39950a0);
                    }
                    if (!yo0Var.f39950a0.has_password && yo0Var.f39958d0 == null) {
                        vn0 vn0Var = new vn0(yo0Var, 3);
                        yo0Var.f39958d0 = vn0Var;
                        AndroidUtilities.runOnUIThread(vn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                yo0.V(this.f39677b, this.f39678c, this.d);
                return;
            default:
                yo0.X(this.f39677b, this.f39678c, this.d);
                return;
        }
    }
}
