package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sn0 implements ho0 {
    public final jo0 f38411a;

    public sn0(jo0 jo0Var) {
        this.f38411a = jo0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        jo0 jo0Var = this.f38411a;
        jo0Var.F0 = tL_payments_validateRequestedInfo;
        jo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
