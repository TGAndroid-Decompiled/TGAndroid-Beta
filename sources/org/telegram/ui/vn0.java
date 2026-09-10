package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vn0 implements Runnable {
    public final int f37592a;
    public final wo0 f37593b;
    public final TLRPC.TL_error f37594c;
    public final TLObject d;

    public vn0(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37592a = i10;
        this.f37593b = wo0Var;
        this.f37594c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37592a) {
            case 0:
                wo0 wo0Var = this.f37593b;
                wo0Var.f38265e0 = false;
                if (this.f37594c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    wo0Var.f38255a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(wo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = wo0Var.C0;
                    if (paymentForm != null && wo0Var.f38255a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        wo0Var.K0();
                    }
                    TwoStepVerificationActivity.m0(wo0Var.f38255a0);
                    wo0 wo0Var2 = wo0Var.f38268f0;
                    if (wo0Var2 != null) {
                        wo0Var2.C0(wo0Var.f38255a0);
                    }
                    if (!wo0Var.f38255a0.has_password && wo0Var.f38263d0 == null) {
                        tn0 tn0Var = new tn0(wo0Var, 3);
                        wo0Var.f38263d0 = tn0Var;
                        AndroidUtilities.runOnUIThread(tn0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wo0.V(this.f37593b, this.f37594c, this.d);
                return;
            default:
                wo0.X(this.f37593b, this.f37594c, this.d);
                return;
        }
    }
}
