package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class uk0 implements bl0 {
    public final dl0 f50111a;

    public uk0(dl0 dl0Var) {
        this.f50111a = dl0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f50111a.f44740b0 = password;
    }

    @Override
    public final void b() {
        this.f50111a.f44753g0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        dl0 dl0Var = this.f50111a;
        bl0 bl0Var = dl0Var.U;
        if (bl0Var != null) {
            bl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (dl0Var.T0) {
            dl0Var.removeSelfFromStack();
        }
        if (dl0Var.U != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
