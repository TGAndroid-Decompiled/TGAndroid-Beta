package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xn0 implements ho0 {
    public final jo0 f40271a;

    public xn0(jo0 jo0Var) {
        this.f40271a = jo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f40271a.X = password;
    }

    @Override
    public final void b() {
        this.f40271a.f35395c0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jo0 jo0Var = this.f40271a;
        ho0 ho0Var = jo0Var.Q;
        if (ho0Var != null) {
            ho0Var.c(str, str2, z4, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jo0Var.P0) {
            jo0Var.removeSelfFromStack();
        }
        if (jo0Var.Q != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
