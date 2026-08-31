package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zn0 implements jo0 {
    public final lo0 f43962a;

    public zn0(lo0 lo0Var) {
        this.f43962a = lo0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f43962a.X = password;
    }

    @Override
    public final void b() {
        this.f43962a.f38802c0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        lo0 lo0Var = this.f43962a;
        jo0 jo0Var = lo0Var.Q;
        if (jo0Var != null) {
            jo0Var.c(str, str2, z4, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (lo0Var.P0) {
            lo0Var.removeSelfFromStack();
        }
        if (lo0Var.Q != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
