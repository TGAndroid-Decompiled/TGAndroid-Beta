package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wk0 implements kl0 {
    public final ml0 f53451a;

    public wk0(ml0 ml0Var) {
        this.f53451a = ml0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ml0 ml0Var = this.f53451a;
        ml0Var.J0 = tL_payments_validateRequestedInfo;
        ml0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
