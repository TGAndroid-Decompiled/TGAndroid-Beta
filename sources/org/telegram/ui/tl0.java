package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tl0 implements Runnable {
    public final int f41859a;
    public final sm0 f41860b;
    public final TLRPC.TL_error f41861c;
    public final TLObject d;

    public tl0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f41859a = i10;
        this.f41860b = sm0Var;
        this.f41861c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f41859a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f41861c;
        sm0 sm0Var = this.f41860b;
        switch (i10) {
            case 0:
                sm0Var.f41557e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    sm0Var.f41547a0 = password;
                    if (!TwoStepVerificationActivity.m0(password, false)) {
                        org.telegram.ui.Components.s4.w0(sm0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = sm0Var.C0;
                    if (paymentForm != null && sm0Var.f41547a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        sm0Var.P0();
                    }
                    TwoStepVerificationActivity.q0(sm0Var.f41547a0);
                    sm0 sm0Var2 = sm0Var.f41560f0;
                    if (sm0Var2 != null) {
                        sm0Var2.H0(sm0Var.f41547a0);
                    }
                    if (!sm0Var.f41547a0.has_password && sm0Var.f41555d0 == null) {
                        rl0 rl0Var = new rl0(sm0Var, 2);
                        sm0Var.f41555d0 = rl0Var;
                        org.telegram.messenger.i0.h3(rl0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sm0.Z(sm0Var, tL_error, tLObject);
                return;
            default:
                sm0.b0(sm0Var, tL_error, tLObject);
                return;
        }
    }
}
