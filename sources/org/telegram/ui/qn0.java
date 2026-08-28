package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qn0 implements ao0 {
    public final co0 f42166a;

    public qn0(co0 co0Var) {
        this.f42166a = co0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f42166a.W = password;
    }

    @Override
    public final void b() {
        this.f42166a.f37249b0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        co0 co0Var = this.f42166a;
        ao0 ao0Var = co0Var.P;
        if (ao0Var != null) {
            ao0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (co0Var.O0) {
            co0Var.removeSelfFromStack();
        }
        if (co0Var.P != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
