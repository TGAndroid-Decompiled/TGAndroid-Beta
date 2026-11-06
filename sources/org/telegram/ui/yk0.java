package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yk0 implements fl0 {
    public final hl0 f52261a;

    public yk0(hl0 hl0Var) {
        this.f52261a = hl0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f52261a.f46408a0 = password;
    }

    @Override
    public final void b() {
        this.f52261a.f46422f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        hl0 hl0Var = this.f52261a;
        fl0 fl0Var = hl0Var.T;
        if (fl0Var != null) {
            fl0Var.c(str, str2, z9, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (hl0Var.S0) {
            hl0Var.removeSelfFromStack();
        }
        if (hl0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
