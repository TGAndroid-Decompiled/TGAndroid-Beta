package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vn0 implements fo0 {
    public final ho0 f42780a;

    public vn0(ho0 ho0Var) {
        this.f42780a = ho0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f42780a.f37915a0 = password;
    }

    @Override
    public final void b() {
        this.f42780a.f37928f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ho0 ho0Var = this.f42780a;
        fo0 fo0Var = ho0Var.T;
        if (fo0Var != null) {
            fo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ho0Var.S0) {
            ho0Var.removeSelfFromStack();
        }
        if (ho0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
