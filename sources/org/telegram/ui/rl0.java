package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rl0 implements Runnable {
    public final int f41101a;
    public final qm0 f41102b;
    public final TLRPC.TL_error f41103c;
    public final TLObject d;

    public rl0(qm0 qm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f41101a = i10;
        this.f41102b = qm0Var;
        this.f41103c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f41101a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f41103c;
        qm0 qm0Var = this.f41102b;
        switch (i10) {
            case 0:
                qm0Var.f40823e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qm0Var.f40813a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.s4.w0(qm0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                        return;
                    }
                    TLRPC.PaymentForm paymentForm = qm0Var.C0;
                    if (paymentForm != null && qm0Var.f40813a0.has_password) {
                        paymentForm.password_missing = false;
                        paymentForm.can_save_credentials = true;
                        qm0Var.Q0();
                    }
                    TwoStepVerificationActivity.r0(qm0Var.f40813a0);
                    qm0 qm0Var2 = qm0Var.f40826f0;
                    if (qm0Var2 != null) {
                        qm0Var2.I0(qm0Var.f40813a0);
                    }
                    if (!qm0Var.f40813a0.has_password && qm0Var.f40821d0 == null) {
                        pl0 pl0Var = new pl0(qm0Var, 2);
                        qm0Var.f40821d0 = pl0Var;
                        org.telegram.messenger.i0.h3(pl0Var, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qm0.a0(qm0Var, tL_error, tLObject);
                return;
            default:
                qm0.c0(qm0Var, tL_error, tLObject);
                return;
        }
    }
}
