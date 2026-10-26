package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wn0 implements no0 {
    public final po0 f45524a;

    public wn0(po0 po0Var) {
        this.f45524a = po0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        po0 po0Var = this.f45524a;
        po0Var.I0 = tL_payments_validateRequestedInfo;
        po0Var.C0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void a(TL_account.Password password) {
    }
}
