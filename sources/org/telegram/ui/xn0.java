package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xn0 implements po0 {
    public final ro0 f40015a;

    public xn0(ro0 ro0Var) {
        this.f40015a = ro0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ro0 ro0Var = this.f40015a;
        ro0Var.I0 = tL_payments_validateRequestedInfo;
        ro0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
