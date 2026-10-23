package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wn0 implements go0 {
    public final io0 f43406a;

    public wn0(io0 io0Var) {
        this.f43406a = io0Var;
    }

    @Override
    public final void a(TL_account.Password password) {
        this.f43406a.f38288a0 = password;
    }

    @Override
    public final void b() {
        this.f43406a.f38301f0 = null;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        io0 io0Var = this.f43406a;
        go0 go0Var = io0Var.T;
        if (go0Var != null) {
            go0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (io0Var.S0) {
            io0Var.removeSelfFromStack();
        }
        if (io0Var.T != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
