package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sn0 implements lo0 {
    public final no0 f37925a;

    public sn0(no0 no0Var) {
        this.f37925a = no0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        no0 no0Var = this.f37925a;
        no0Var.I0 = tL_payments_validateRequestedInfo;
        no0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
