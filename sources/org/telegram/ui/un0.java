package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class un0 implements Runnable {
    public final int f42459a;
    public final vo0 f42460b;
    public final TLRPC.TL_error f42461c;
    public final TLObject d;

    public un0(vo0 vo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42459a = i10;
        this.f42460b = vo0Var;
        this.f42461c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42459a) {
            case 0:
                vo0 vo0Var = this.f42460b;
                vo0Var.f42923e0 = false;
                if (this.f42461c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    vo0Var.f42912a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(vo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = vo0Var.C0;
                    if (paymentForm != null && vo0Var.f42912a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        vo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(vo0Var.f42912a0);
                    vo0 vo0Var2 = vo0Var.f42926f0;
                    if (vo0Var2 != null) {
                        vo0Var2.C0(vo0Var.f42912a0);
                    }
                    if (!vo0Var.f42912a0.has_password && vo0Var.f42920d0 == null) {
                        sn0 sn0Var = new sn0(vo0Var, 3);
                        vo0Var.f42920d0 = sn0Var;
                        AndroidUtilities.runOnUIThread(sn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vo0.V(this.f42460b, this.f42461c, this.d);
                return;
            default:
                vo0.X(this.f42460b, this.f42461c, this.d);
                return;
        }
    }
}
