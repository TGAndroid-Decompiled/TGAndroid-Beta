package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qn0 implements Runnable {
    public final int f36781a;
    public final ro0 f36782b;
    public final TLRPC.TL_error f36783c;
    public final TLObject d;

    public qn0(ro0 ro0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f36781a = i10;
        this.f36782b = ro0Var;
        this.f36783c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36781a) {
            case 0:
                ro0 ro0Var = this.f36782b;
                ro0Var.f37178e0 = false;
                if (this.f36783c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    ro0Var.f37168a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(ro0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = ro0Var.C0;
                    if (paymentForm != null && ro0Var.f37168a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        ro0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(ro0Var.f37168a0);
                    ro0 ro0Var2 = ro0Var.f37181f0;
                    if (ro0Var2 != null) {
                        ro0Var2.C0(ro0Var.f37168a0);
                    }
                    if (!ro0Var.f37168a0.has_password && ro0Var.f37176d0 == null) {
                        on0 on0Var = new on0(ro0Var, 3);
                        ro0Var.f37176d0 = on0Var;
                        AndroidUtilities.runOnUIThread(on0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ro0.V(this.f36782b, this.f36783c, this.d);
                return;
            default:
                ro0.X(this.f36782b, this.f36783c, this.d);
                return;
        }
    }
}
