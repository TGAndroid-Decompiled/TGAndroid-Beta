package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xn0 implements Runnable {
    public final int f39671a;
    public final yo0 f39672b;
    public final TLRPC.TL_error f39673c;
    public final TLObject d;

    public xn0(yo0 yo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39671a = i10;
        this.f39672b = yo0Var;
        this.f39673c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39671a) {
            case 0:
                yo0 yo0Var = this.f39672b;
                yo0Var.f39955e0 = false;
                if (this.f39673c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    yo0Var.f39945a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(yo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = yo0Var.C0;
                    if (paymentForm != null && yo0Var.f39945a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        yo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(yo0Var.f39945a0);
                    yo0 yo0Var2 = yo0Var.f39958f0;
                    if (yo0Var2 != null) {
                        yo0Var2.C0(yo0Var.f39945a0);
                    }
                    if (!yo0Var.f39945a0.has_password && yo0Var.f39953d0 == null) {
                        vn0 vn0Var = new vn0(yo0Var, 3);
                        yo0Var.f39953d0 = vn0Var;
                        AndroidUtilities.runOnUIThread(vn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                yo0.V(this.f39672b, this.f39673c, this.d);
                return;
            default:
                yo0.X(this.f39672b, this.f39673c, this.d);
                return;
        }
    }
}
