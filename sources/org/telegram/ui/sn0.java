package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sn0 implements co0 {
    public final eo0 f41503a;

    public sn0(eo0 eo0Var) {
        this.f41503a = eo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f41503a.f36704a0 = password;
    }

    @Override
    public final void b() {
        this.f41503a.f36717f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        eo0 eo0Var = this.f41503a;
        co0 co0Var = eo0Var.T;
        if (co0Var != null) {
            co0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (eo0Var.S0) {
            eo0Var.removeSelfFromStack();
        }
        if (eo0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
