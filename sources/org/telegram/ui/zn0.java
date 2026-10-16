package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zn0 implements Runnable {
    public final int f42360a;
    public final ap0 f42361b;
    public final TLRPC.TL_error f42362c;
    public final TLObject d;

    public zn0(ap0 ap0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42360a = i10;
        this.f42361b = ap0Var;
        this.f42362c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42360a) {
            case 0:
                ap0 ap0Var = this.f42361b;
                ap0Var.f34018e0 = false;
                if (this.f42362c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ap0Var.f34008a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ap0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = ap0Var.C0;
                    if (paymentForm != null && ap0Var.f34008a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        ap0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(ap0Var.f34008a0);
                    ap0 ap0Var2 = ap0Var.f34021f0;
                    if (ap0Var2 != null) {
                        ap0Var2.C0(ap0Var.f34008a0);
                    }
                    if (!ap0Var.f34008a0.has_password && ap0Var.f34016d0 == null) {
                        xn0 xn0Var = new xn0(ap0Var, 3);
                        ap0Var.f34016d0 = xn0Var;
                        AndroidUtilities.runOnUIThread(xn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ap0.V(this.f42361b, this.f42362c, this.d);
                return;
            default:
                ap0.X(this.f42361b, this.f42362c, this.d);
                return;
        }
    }
}
