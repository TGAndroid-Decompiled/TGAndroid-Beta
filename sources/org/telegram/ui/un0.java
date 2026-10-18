package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class un0 implements eo0 {
    public final go0 f42034a;

    public un0(go0 go0Var) {
        this.f42034a = go0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f42034a.f37254a0 = password;
    }

    @Override
    public final void b() {
        this.f42034a.f37267f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        go0 go0Var = this.f42034a;
        eo0 eo0Var = go0Var.T;
        if (eo0Var != null) {
            eo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (go0Var.S0) {
            go0Var.removeSelfFromStack();
        }
        if (go0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
