package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class rn0 implements bo0 {

    public final do0 f42302a;

    public rn0(do0 do0Var) {
        this.f42302a = do0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f42302a.W = password;
    }

    @Override
    public final void b() {
        this.f42302a.f37455b0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        do0 do0Var = this.f42302a;
        bo0 bo0Var = do0Var.P;
        if (bo0Var != null) {
            bo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (do0Var.O0) {
            do0Var.removeSelfFromStack();
        }
        return do0Var.P != null;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
