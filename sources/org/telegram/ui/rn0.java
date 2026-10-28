package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rn0 implements Runnable {
    public final int f43090a;
    public final ro0 f43091b;
    public final TLRPC.TL_error f43092c;
    public final TLObject d;

    public rn0(ro0 ro0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43090a = i10;
        this.f43091b = ro0Var;
        this.f43092c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43090a) {
            case 0:
                ro0 ro0Var = this.f43091b;
                ro0Var.f43108e0 = false;
                if (this.f43092c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ro0Var.f43098a0 = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(ro0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = ro0Var.C0;
                    if (paymentForm != null && ro0Var.f43098a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        ro0Var.L0();
                    }
                    TwoStepVerificationActivity.n0(ro0Var.f43098a0);
                    ro0 ro0Var2 = ro0Var.f43111f0;
                    if (ro0Var2 != null) {
                        ro0Var2.D0(ro0Var.f43098a0);
                    }
                    if (!ro0Var.f43098a0.has_password && ro0Var.f43106d0 == null) {
                        pn0 pn0Var = new pn0(ro0Var, 3);
                        ro0Var.f43106d0 = pn0Var;
                        AndroidUtilities.runOnUIThread(pn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ro0.W(this.f43091b, this.f43092c, this.d);
                return;
            default:
                ro0.Y(this.f43091b, this.f43092c, this.d);
                return;
        }
    }
}
