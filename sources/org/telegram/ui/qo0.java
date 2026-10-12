package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qo0 implements ap0 {
    public final cp0 f39510a;

    public qo0(cp0 cp0Var) {
        this.f39510a = cp0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f39510a.f34996a0 = password;
    }

    @Override
    public final void b() {
        this.f39510a.f35009f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        cp0 cp0Var = this.f39510a;
        ap0 ap0Var = cp0Var.T;
        if (ap0Var != null) {
            ap0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (cp0Var.S0) {
            cp0Var.removeSelfFromStack();
        }
        if (cp0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
